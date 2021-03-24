from Simple import *
from Circular import *
import xml.etree.ElementTree as ET

matrices = Lista()
data = ListaC()
vacio = None

def lector():
    print("\n")
    print("Opción cargar archivo: ")
    ruta = input("Por favor ingrese la ruta del archivo: ")
    ruta = ruta.strip('\"')
    tree = ET.parse(ruta)
    root = tree.getroot()

    for elemento in root:
        vacio = matrices.insertar(elemento.attrib['nombre'], elemento.attrib['n'], elemento.attrib['m'])

        for coordenadas in elemento:
            if coordenadas.text != '0':
                vacio.valores.insertar(coordenadas.attrib['x'], coordenadas.attrib['y'], coordenadas.text, 1)
            else:
                vacio.valores.insertar(coordenadas.attrib['x'], coordenadas.attrib['y'], coordenadas.text, 0)

    matrices.mostrarNodos()
    return matrices



def menu():
    print("\n")
    print("----------------------Bienvenido----------------------")
    print("Menú principal: ")
    print("1. Cargar archivo\n"
          "2. Procesar archivo\n"
          "3. Escribir archivo de salida\n"
          "4. Mostrar datos del estudiante\n"
          "5. Generar gráfiva\n"
          "6. Salida")
    valor = input("> Por favor seleccione una opción: ")
    return valor

bandera = True

while bandera:

    valor = int(menu())

    if valor == 1:

        lector()        

    elif valor == 2:
        print("\n")
        print("> Calculando la matriz binaria...")
        print("> Realizando suma de tuplas...")
        print("\n")


    elif valor == 3:
        print("\n")
        salida = input("Escriba una ruta específica: ")
        print("Escritura de archivo realizada exitosamente...")

    elif valor == 4:
        print("\n")
        print("> Fabio Josué Hernández Martinez")
        print("> 201801005")
        print("> Introducción a la Programación y computación 2 sección D")
        print("> Ingenieria en Ciencias y Sistemas")
        print("> 7mo semestre")

    elif valor == 5:
        print("\n")
        graf_matriz = input("Por favor seleccione una de las matrices para la generación de su gráfica: ")

    elif valor == 6:
        bandera = False

    else:
        print("Opción invalida, por favor seleccione una opción valida")
    
