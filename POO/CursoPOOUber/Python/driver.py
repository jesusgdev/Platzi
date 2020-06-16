from account import Account

class Driver(Account):

    id       = int
    name     = str
    document = str
    email    = str
    password = str

    def __init__(self, name, document, email, password):
        super.__init__(id, name, document, email, password)