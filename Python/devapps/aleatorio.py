import random

def run():
    print('Bienvenido al Juego de Adivina el Numero')
    print('\nInstrucciones:')
    print('Se generara un numero aleatorio entre 1 y 20, y tendras solo 5 intentos para adivinarlo, elige saviamente!\n')

    number_found = False
    random_number = random.randint(0,20)
    count = 5

    while not number_found:
        number = int(input('Digita un numero: '))

        if number == random_number:
            print('Felicidades adivinaste el numero!!!')
            number_found = True
        
        elif number != random_number:
            count -= 1
            print('\nLo siento el numero es incorrecto, te quedan {} intentos!'.format(count))
            if count == 0:
                print('Perdiste esta vez, vuelve a empezar!')
                number_found = True

            elif number > random_number:
                print('Pista: el numero escogido es mayor al numero oculto')
            else:
                print('Pista: el numero escogido es menor al numero oculto')
                    

if __name__ == "__main__":
    run()