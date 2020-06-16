from payment import Payment

class Cash(Payment):

    id = int

    def __init__(self, id):
        super().__init__(id)