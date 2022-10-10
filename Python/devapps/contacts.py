class Contact:
    
    def __init__(self, name, phone, email):
        self.name = name
        self.phone = phone
        self.email = email

class ContactBook:

    def __init__(self):
        self._contacts = []

    def add(self, name, phone, email):
        contact = Contact(name, phone, email)
        self._contacts.append(contact)

    def update_contact(self, name, phone, email):
        for contact in self._contacts:
            if contact.name.lower() == name.lower():
                contact.phone = phone
                contact.email = email
                break
            
            else:
                self._not_found()

    def search_contact(self, name):
        for contact in self._contacts:
            if contact.name.lower() == name.lower():
                self._print_contact(contact)
                break

            else:
                self._not_found()   

    def delete_contact(self, name):
        for idx, contact in enumerate(self._contacts):
            if contact.name.lower() == name.lower():
                del self._contacts[idx]
                break
    
    def show_all(self):
        for contact in self._contacts:
            self._print_contact(contact)

    def _print_contact(self, contact):
        print('* ~ * ~ * ~ * ~ * ~ * ~ * ~ * ~ * ~ * ~ *')
        print('Nombre: {}'.format(contact.name))
        print('Telefono: {}'.format(contact.phone))
        print('Email: {}'.format(contact.email))
        print('* ~ * ~ * ~ * ~ * ~ * ~ * ~ * ~ * ~ * ~ *') 


    def _not_found(self):
        print('********************************************************')
        print('Lo siento este contacto no esta registrado en la agenda!')
        print('********************************************************')

def run():

    contact_book = ContactBook()

    while True:
        command = str(input('''
            ¿Qué deseas hacer?

            [a]ñadir contacto
            [ac]tualizar contacto
            [b]uscar contacto
            [e]liminar contacto
            [l]istar contactos
            [s]alir
        '''))

        if command == 'a':
            name = str(input('Escribe el nombre del contacto: '))
            phone = str(input('Escribe el telefono del contacto: '))
            email = str(input('Escribe el email del contacto: '))
            contact_book.add(name, phone, email)
            

        elif command == 'ac':
            name = str(input('Escriba el nombre del contacto que desea actualizar o modificar: '))
            phone = str(input('Escriba el telefono del contacto: '))
            email = str(input('Escriba el email del contacto: '))
            contact_book.update_contact(name, phone, email)


        elif command == 'b':
            name = str(input('Escribe el nombre del contacto que deseas buscar: '))
            contact_book.search_contact(name)

        elif command == 'e':
            name = str(input('Escribe el nombre del contacto que deseas eliminar: '))
            contact_book.delete_contact(name)

        elif command == 'l':
            contact_book.show_all()

        elif command == 's':
            break
        else:
            print('Comando no encontrado.')


if __name__ == '__main__':
    print('B I E N V E N I D O  A  L A  A G E N D A')
    run()