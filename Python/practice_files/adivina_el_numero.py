import random

def run():
    number_found = False
    random_number = random.randint(0, 30)

    while not number_found:
        number = int(input('Intenta adivinar el numero, digita un numero! '))

        if number == random_number:
            print('Felicidades encontraste el numero!')
            number_found = True

        elif number > random_number:
            print('El numero introducido es mas grande, sigue intentando!')
        else:
            print('El numero introducido es mas pequeño, sigue intentando!')
        
if __name__ == "__main__":
    run()
        