from Analizador import flujomenu, flujofactura

class principal:
    opcion = 0
    flagmenu = 0

def menu():
    print("\n")
    print("                       Proyecto 1 - LFP                 ")
    print("  ------------------------------------------------------ ")
    print(" |    Carnet: 201801005                                 |")
    print(" |    Nombre: Fabio Josué Hernández Martinez            |")
    print(" |    Correo: fabioher2901@gmail.com                    |")
    print(" |    Curso: Lenguajes Formales y de Programación B-    |")
    print("  ------------------------------------------------------ ")
    print("\n")
    print("1. Cargar menú\n"
          "2. Cargar orden\n"
          "3. Generar menú\n"
          "4. Generar factura\n"
          "5. Generar árbol\n"
          "6. Salir\n")
    valor = input(">>Por favor seleccione una opción: ")
    return valor


bandera = True

while bandera:
    global flagmenu
    opcion = int(menu())

    if opcion == 1:
        flujomenu()
    elif opcion == 2:
        flujofactura()
    elif opcion == 3:
        print('hola')
    elif opcion == 4:
        print("Listando todas")
    elif opcion == 5:
        print("Archivo HTML")
    elif opcion == 6:
        bandera = False
    else:
        print("Opción invalida, por favor seleccione una opción valida")
