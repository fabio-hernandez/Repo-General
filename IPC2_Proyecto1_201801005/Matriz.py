from Circular import *

class NodoSimple:
    def __init__(self, nombre, n, m):
        self.nombre = nombre
        self.n = n
        self.m = m
        self.valores = ListaC()
        self.siguiente = None
