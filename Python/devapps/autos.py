class Coches():

    numeroPuertas = 4
    numeroRuedas = 4
    longitud = 250
    enmarcha = False

    def arrancar(self, arrancamos):
        self.enmarcha = arrancamos

        if (self.enmarcha):
            return print('El coche ya esta en movimiento!')
        else:
            return print('El coche esta detenido!')

    def estado(self):
        print ('El coche tiene ', self.numeroPuertas, 'puertas, ', self.numeroRuedas, 'ruedas y una longitud de ', self.longitud)

miCoche = Coches()

print('El auto tiene ', miCoche.numeroPuertas, 'puertas')
miCoche.arrancar(True)
miCoche.estado()
