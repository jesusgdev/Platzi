def foreign_exchange_calculator(ammount):
    arg_to_usd_rate = 80

    return ammount / arg_to_usd_rate

def run():
    print('C A L C U L A D O R A  D E  D I V I S A S')
    print('Convierte pesos argentinos a dolares \n')

    ammount = float(input('Ingrese la cantidad de pesos argentinos: '))

    result = foreign_exchange_calculator(ammount)

    print('${} pesos argentinos son ${} dolares'.format(ammount, result))

if __name__ == "__main__":
    run()
   
    