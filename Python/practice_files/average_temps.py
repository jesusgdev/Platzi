def average_temps(temps):

    suma_temps = 0

    for temp in temps:
        suma_temps += float(temp)

    return suma_temps / len(temps)

if __name__ == "__main__":

    temps = [29, 31, 30, 32, 28, 34, 32]

    average = average_temps(temps)

    print('El promedio de temperaturas es {}'.format(average))