def recursive(number):

    if number == 1:
        return 1
    else:
        return number + recursive(number - 1)

    
    
if __name__ == "__main__":
    number = int(input('Escribe hasta que numero deseas sumar: '))
    result = recursive(number)

print('La suma recursiva de {} es {}'.format(number,result))
