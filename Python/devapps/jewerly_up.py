class Jewerly():
    
    def __init__(self):
        self.bracelet_lvl_upgrade = 24
        self.necklace_lvl_upgrade = 12
        self.belt_lvl_upgrade = 240
        self.ring_lvl_upgrade = 12
        self.earring_lvl_upgrade = 6
        self.rune_lvl_upgrade = 120

    def upgrade_bracelet(self, attack, upgrade_lvl):
        self.attack = attack
        self.upgrade_lvl = upgrade_lvl

        return self.attack +(self.upgrade_lvl*self.bracelet_lvl_upgrade)

    def upgrade_necklace(self, defense, upgrade_lvl):
        self.defense = defense
        self.upgrade_lvl = upgrade_lvl

        return self.defense +(self.upgrade_lvl*self.necklace_lvl_upgrade)

    def upgrade_belt(self, ps , upgrade_lvl):
        self.ps = ps
        self.upgrade_lvl = upgrade_lvl

        return self.ps +(self.upgrade_lvl*self.belt_lvl_upgrade)

    def upgrade_ring(self, attack, upgrade_lvl):
        self.attack = attack
        self.upgrade_lvl = upgrade_lvl

        return self.attack +(self.upgrade_lvl*self.ring_lvl_upgrade)

    def upgrade_earring(self, defense, upgrade_lvl):
        self.defense = defense
        self.upgrade_lvl = upgrade_lvl

        return self.defense +(self.upgrade_lvl*self.earring_lvl_upgrade)
        
    def upgrade_rune(self, ps, upgrade_lvl):
        self.ps = ps
        self.upgrade_lvl = upgrade_lvl

        return self.ps +(self.upgrade_lvl*self.rune_lvl_upgrade)


def run():

    bracelet = Jewerly()
    necklace = Jewerly()
    belt = Jewerly()
    ring = Jewerly()
    earring = Jewerly()
    rune = Jewerly()

    
    while True:
        command = str(input('''
			¿Cual joya deseas encantar?

			[1]Bracelet
			[2]Necklace
			[3]Belt
			[4]Ring
			[5]Earring
			[6]Rune
		: '''))

        if command == '1':
            attack = int(input('Escribe cuanto ataque tiene el brazalete: '))
            upgrade_lvl = int(input('Escribe hasta que nivel deseas encantar la joya? '))

            if upgrade_lvl > 0 and upgrade_lvl < 6:

                bracelet_upgraded = bracelet.upgrade_bracelet(attack, upgrade_lvl)
                print('El nuevo ataque del brazalete es {}'.format(bracelet_upgraded))
                break
            else:
                print('Lo siento el nivel indicado es invalido, repita el procedimiento!')

        if command == '2':
            defense = int(input('Escribe cuanta defensa tiene el collar: '))
            upgrade_lvl = int(input('Escribe hasta que nivel deseas encantar la joya? '))

            if upgrade_lvl > 0 and upgrade_lvl < 6:

                necklace_upgraded = necklace.upgrade_necklace(defense, upgrade_lvl)
                print('La nueva defensa del collar es {}'.format(necklace_upgraded))
                break
            else:
                print('Lo siento el nivel indicado es invalido, repita el procedimiento!')

        if command == '3':
            ps = int(input('Escribe cuanta vida tiene el cinturon: '))
            upgrade_lvl = int(input('Escribe hasta que nivel deseas encantar la joya? '))

            if upgrade_lvl > 0 and upgrade_lvl < 6:

                belt_upgraded = belt.upgrade_belt(ps, upgrade_lvl)
                print('La nueva vida del brazalete es {}'.format(belt_upgraded))
                break
            else:
                print('Lo siento el nivel indicado es invalido, repita el procedimiento!')

        if command == '4':
            attack = int(input('Escribe cuanto ataque tiene el anillo: '))
            upgrade_lvl = int(input('Escribe hasta que nivel deseas encantar la joya? '))

            if upgrade_lvl > 0 and upgrade_lvl < 6:

                ring_upgraded = ring.upgrade_ring(attack, upgrade_lvl)
                print('El nuevo ataque del anillo es {}'.format(ring_upgraded))
                break
            else:
                print('Lo siento el nivel indicado es invalido, repita el procedimiento!')

        if command == '5':
            defense = int(input('Escribe cuanta defensa tienen los pendientes: '))
            upgrade_lvl = int(input('Escribe hasta que nivel deseas encantar la joya? '))

            if upgrade_lvl > 0 and upgrade_lvl < 6:

                earring_upgraded = earring.upgrade_earring(defense, upgrade_lvl)
                print('La nueva defensa de los pendientes es {}'.format(earring_upgraded))
                break
            else:
                print('Lo siento el nivel indicado es invalido, repita el procedimiento!')

        if command == '6':
            ps = int(input('Escribe cuanta vida tiene la runa: '))
            upgrade_lvl = int(input('Escribe hasta que nivel deseas encantar la joya? '))

            if upgrade_lvl > 0 and upgrade_lvl < 6:

                rune_upgraded = rune.upgrade_rune(ps, upgrade_lvl)
                print('La nueva vida de la runa es {}'.format(rune_upgraded))
                break
            else:
                print('Lo siento el nivel indicado es invalido, repita el procedimiento!')


if __name__ == '__main__':
    print('B I E N V E N I D O   A L  S I S T E M A  D E  E N C A N T A M I E N T O S')
    run()