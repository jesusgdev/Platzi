import turtle
sides = int(input('lados de la figura: '))
length = int(input('longitud de cada lado: '))

window = turtle.Screen()
window.bgcolor('yellow')


def draw_polygon(t, sides, length):
    for _ in range(sides):
        t.forward(length)
        t.left(360 - 360/sides)
tess = turtle.Turtle()
draw_polygon(tess, sides, length)
window.mainloop()
