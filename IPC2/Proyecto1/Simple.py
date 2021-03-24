from Matriz import *

class Lista:
    def __init__(self):
        self.primero = None

    def insertar(self, nombre, n, m):
        nuevo = NodoSimple(nombre, n, m)
        if self.primero is None:
            self.primero = nuevo
            return nuevo
        else:
            tmp = self.primero
            while tmp.siguiente is not None:
                tmp = tmp.siguiente
            tmp.siguiente = nuevo
            return nuevo
        return None


    def mostrarNodos(self):
        tmp = self.primero
        while tmp is not None:
            print('Nombre: ' + str(tmp.nombre) + ' - Filas: ' + str(tmp.n) + ' - Columnas: ' + str(tmp.m))
            print('Datos: ' + str(tmp.valores))
            tmp = tmp.siguiente
