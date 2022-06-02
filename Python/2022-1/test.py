import turtle
import math

print('Hello Python 3.x')

t = turtle.Turtle()
sc = turtle.Screen()
turtle.title('마우스클릭')
t.shape("turtle")
t.pensize(2)

sc.setup(500,500, startx=0,starty = 0)

def MyStar (x):
    
    l = x
    a = l / ((1+math.cos(72*math.pi/180))*2)
    b = l-(2*a)
    
    for kk in range(5):
        for kk in range(3):
            if kk%2:
                t.pencolor('red')
                t.fd(b)
            else:
                t.pencolor('black')
                t.fd(a)
        t.left(144) 
    turtle.mainloop()
    turtle.bye()
        
MyStar(200)
t.done()
