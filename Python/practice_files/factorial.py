def factorial(number):
    if number == 0:
        return 1

    elif number < 0:
        print ('NO se puede calcular el factorial de un numero negativo')

    return number * factorial(number - 1)

if __name__ == "__main__":
    number = int(input('Escribe un numero: '))

    result = factorial(number)

    print('El factorial de {} es {}'.format(number, result))    
    