from tkinter import filedialog as FileDialog
import webbrowser


class Simbolo:

    def __init__(self, token, lexema, fila, columna):
        self.token = token
        self.lexema = lexema
        self.fila = fila
        self.columna = columna


tablaSimbolos = []
tablaErrores = []
flagautomataid = False
flagautomatacadena = False
flagasignacion = False
flagautomatanum = False
flagtoken = True
flagautomatapropina = False
lexema = ''
fila = 0
columna = 0
estado = 0
cont = ''
numero = 0
i = 0


def cargar():
    # Abrir ventena de seleccion
    fichero = FileDialog.askopenfilename(title="Seleccione un archivo")
    file = open(fichero, "r")
    contenedor = file.read()
    cadena = list(contenedor)
    file.close()
    return cadena


def isLetter(c):
    return (ord(c) >= 65 and ord(c) <= 90) or (ord(c) >= 97 and ord(c) <= 122)


def isNumber(c):
    return ord(c) >= 48 and ord(c) <= 57


def analizadorlexico(c):
    global fila, columna, estado, lexema, flagautomataid, flagautomatacadena, flagautomatanum

    # estado0 --> ID
    if flagautomataid:
        automataid(c)

    # estado1 --> cadena
    elif flagautomatacadena:
        automatacadena(c)

    # estado2 --> numero
    elif flagautomatanum:
        automatanum(c)

    elif isLetter(c):
        flagautomataid = True
        lexema = c
        columna += 1
    elif isNumber(c):
        columna += 1
        lexema = c
        flagautomatanum = True
    # Corchete que abre
    elif ord(c) == 91:
        columna += 1
        flagautomataid = True
    # Corchete que cierra
    elif ord(c) == 93:
        columna += 1
    # Comilla simple
    elif ord(c) == 39:
        columna += 1
        flagautomatacadena = True
        lexema = c
        return
    # Signo igual
    elif ord(c) == 61:
        columna += 1
        lexema = ''
        return
    # Salto de línea
    elif ord(c) == 10:
        fila += 1
        columna = 0
        lexema = ''
        return
    # Punto y coma
    elif ord(c) == 59:
        columna += 1
        lexema = ''
        return
    # Dos puntos
    elif ord(c) == 58:
        columna += 1
        lexema = ''
        return
    # Espacio
    elif ord(c) == 32:
        columna += 1
        lexema = ''
    else:
        columna += 1
        lexema = c
        tablaErrores.append(Simbolo("Carácter desconocido", lexema, fila, columna))
        return


def analizadorOrden(c):
    global flagautomatacadena, flagautomatapropina, flagautomatanum, columna, lexema, estado, fila

    if flagautomatacadena:
        automatacadena(c)
    elif flagautomatanum:
        numpropina(c)
    elif flagautomatapropina:
        automatapropina(c)
    elif isNumber(c):
        flagautomatanum = True
    elif ord(c) == 39:
        columna += 1
        flagautomatacadena = True
        lexema = c
        return
    elif ord(c) == 44:
        columna += 1
        lexema = ''
        return


def automatapropina(c):
    print('a')


def automataid(c):
    global lexema, columna, fila, flagautomataid

    # Letras y números
    if isLetter(c):
        lexema += c
        columna += 1
        if lexema == 'restaurante':
            tablaSimbolos.append(Simbolo('Reservada', lexema, fila, columna))
            flagautomataid = False
        return
    if isNumber(c) or c == '_':
        lexema += c
        columna += 1
        return
    # espacio
    elif ord(c) == 32:
        lexema += c
        columna += 1
        tablaSimbolos.append(Simbolo("Identificador", lexema, fila, columna))
        lexema = ''
        flagautomataid = False
    # Comilla simple
    if ord(c) == 39:
        columna += 1
        tablaSimbolos.append(Simbolo("Identificador", lexema, fila, columna))
        lexema = ''
        flagautomataid = False
    # dos puntos
    elif ord(c) == 58:
        columna += 1
        tablaSimbolos.append(Simbolo("Identificador", lexema, fila, columna))
        lexema = ''
        flagautomataid = False
    # punto y coma
    elif ord(c) == 59:
        tablaSimbolos.append(Simbolo("Identificador", lexema, fila, columna))
        columna += 1
        lexema = ''
        flagautomataid = False
    # Salto de linea
    elif ord(c) == 10:
        fila += 1
        columna = 0
        columna += 1
        tablaSimbolos.append(Simbolo("ID", lexema, fila, columna))
        lexema = ''
        flagautomataid = False
    # Igual
    elif ord(c) == 61:
        columna += 1
        tablaSimbolos.append(Simbolo("ID", lexema, fila, columna))
        lexema = ''
        flagautomataid = False
    else:
        columna += 1
        lexema = c
        tablaErrores.append(Simbolo("Error en ID", lexema, fila, columna))


def automatacadena(c):
    global lexema, columna, fila, flagautomatacadena

    # Comilla simple
    if ord(c) == 39:
        columna += 1
        lexema += c
        tablaSimbolos.append(Simbolo("Cadena", lexema, fila, columna))
        lexema = ""
        flagautomatacadena = False
    elif ord(c) == 10:
        fila += 1
        columna = 0
        tablaErrores.append(Simbolo("Error en cadena", lexema, fila, columna))
        columna += 1
        lexema = ""
        flagautomatacadena = False

    columna += 1
    lexema += c


def numpropina(c):
    global columna, fila, lexema, flagautomatanum

    if isNumber(c):
        columna += 1
        lexema += c
        return
    # Punto
    elif ord(c) == 46:
        columna += 1
        lexema += c
        return
    else:
        columna += 1
        lexema += c
        tablaErrores.append(Simbolo('Error en número', lexema, fila, columna))


def automatanum(c):
    global columna, fila, lexema, flagautomatanum

    if isNumber(c):
        columna += 1
        lexema += c
        return
    # Punto
    elif ord(c) == 46:
        columna += 1
        lexema += c
        return
    # Punto y coma
    elif ord(c) == 59:
        columna += 1
        tablaSimbolos.append(Simbolo("Número", lexema, fila, columna))
        lexema = ""
        flagautomatanum = False
    elif ord(c) == 32:
        columna += 1
        tablaSimbolos.append(Simbolo("Número", lexema, fila, columna))
        lexema = c
        tablaErrores.append(Simbolo('Error en número', lexema, fila, columna))
        lexema = ''
        flagautomatanum = False
    else:
        columna += 1
        lexema += c
        tablaErrores.append(Simbolo('Error en número', lexema, fila, columna))


def ordenTokens():
    global numero, flagtoken
    cont = ''
    htmlfile = open('Reporte_Menu.html', 'w', encoding='utf8')
    htmlfile.write(""" <!DOCTYPE html>    
        <html lang="es">
        <head>
            <meta charset="UTF-8">
            <meta name="viewport" content="width=device-width, initial-scale=1.0">
            <title> Tabla Reporte de Tokens del Menú </title>
            <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
            <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js"></script>
            <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"></script>
            <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
        </head>
        <body>
        <div class="container">
            <h2> Reporte de tokens </h2>
            <p> Lista de tokens </p>
            <table class="table table-striped table-bordered">
                <thead>
                <tr>
                    <th>Lexema</th>
                    <th>Fila</th>
                    <th>Columna</th>
                    <th>Token</th>
                </tr>
                </thead>
        """)
    for i in tablaSimbolos:
        cont += ("<tbody>"
                 '<td>' + i.lexema + '</td>\n'
                                     '<td>' + str(i.fila) + '</td>\n'
                                                            '<td>' + str(i.columna) + '</td>\n'
                                                                                      '<td>' + i.token + '</td>\n'
                                                                                                         '</tbody>')

    htmlfile.write(cont)
    htmlfile.write(""" 
                    </table>
                </div>
            </body>
        </html>
        """)
    htmlfile.close()

    nombreArchivo = '/Users/HernandezMartinez/Desktop/LFP-Proyecto1-201801005/' + 'Reporte_Menu.html'
    webbrowser.open_new_tab(nombreArchivo)


def ordenErrores():
    global numero, flagtoken
    cont = ''
    htmlfile = open('Reporte_de_Errores.html', 'w', encoding='utf8')
    htmlfile.write(""" <!DOCTYPE html>    
        <html lang="es">
        <head>
            <meta charset="UTF-8">
            <meta name="viewport" content="width=device-width, initial-scale=1.0">
            <title> Tabla Reporte de Tokens del Errores </title>
            <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
            <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js"></script>
            <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"></script>
            <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
        </head>
        <body>
        <div class="container">
            <h2> Reporte de tokens </h2>
            <p> Lista de tokens </p>
            <table class="table table-striped table-bordered">
                <thead>
                <tr>
                    <th>Lexema</th>
                    <th>Fila</th>
                    <th>Columna</th>
                    <th>Token</th>
                </tr>
                </thead>
        """)
    for i in tablaErrores:
        cont += ("<tbody>"
                 '<td>' + i.lexema + '</td>\n'
                                     '<td>' + str(i.fila) + '</td>\n'
                                                            '<td>' + str(i.columna) + '</td>\n'
                                                                                      '<td>' + i.token + '</td>\n'
                                                                                                         '</tbody>')

    htmlfile.write(cont)
    htmlfile.write(""" 
                    </table>
                </div>
            </body>
        </html>
        """)
    htmlfile.close()

    nombreArchivo = '/Users/HernandezMartinez/Desktop/LFP-Proyecto1-201801005/' + 'Reporte_de_Errores.html'
    webbrowser.open_new_tab(nombreArchivo)


def flujomenu():
    global estado, cont, i, flagtoken

    for c in cargar():
        analizadorlexico(c)

    for s in tablaSimbolos:
        ordenTokens()

    for e in tablaErrores:
        ordenErrores()


def flujofactura():
    global estado, cont, i
    for c in cargar():
        analizadorOrden(c)
