def factorial(number):
    if number == 0:
        return 1
    elif number < 0:
        print('Lo siento el factorial de un numero negativo no existe')
    else:
        return number * factorial(number - 1)


if __name__ == '__main__':
    number = int(input('Escribe un número: '))

    result = factorial(number)

    print(result)
