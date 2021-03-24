from Datos import *

class ListaC:
    def __init__(self):
        self.head = None

    def vacia(self):
        return self.head is None

    def insertar(self, x, y, dato, binario):
        nuevo = Datos(x, y, dato, binario)
        if self.vacia():
            self.head = nuevo
            nuevo.next = self.head
        else:
            tmp = self.head
            while tmp.next is not self.head:
                tmp = tmp.next
            tmp.next = nuevo
            nuevo.next = self.head

    def imprimir(self):
        if self.vacia():
            return
        tmp = self.head
        print(tmp.dato)
        while tmp.next != self.head:
            tmp = tmp.next
            print(str(tmp.dato))

    def buscar(self, dato):
        tmp = self.head
        while tmp is not None:
            if tmp.dato == dato:
                return True
            elif tmp.next == self.head:
                return False
            else:
                tmp = tmp.next
        return False
