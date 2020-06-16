def binary_search(numbers, number_to_find, low, high):

    if low > high:
        return False

    mid = int((low + high) / 2)

    if numbers[mid] == number_to_find:
        return True
    elif numbers[mid] > number_to_find:
        return binary_search(numbers, number_to_find, low, mid - 1)
    else:
        return binary_search(numbers, number_to_find, mid + 1, high)



if __name__ == '__main__':
    numbers_unorder = [1, 3, 10, 5, 28, 9, 4, 25, 11, 27, 6, 33, 36, 49, 51]

    numbers = sorted(numbers_unorder)

    number_to_find = int(input('Ingresa un número: '))

    result = binary_search(numbers, number_to_find, 0, len(numbers) - 1)

    if result is True:
        print('El número {} sí está en la lista.'.format(number_to_find))
    else:
        print('El número {} NO está en la lista.'.format(number_to_find))

print(numbers)