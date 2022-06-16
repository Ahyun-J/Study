# -*- coding: utf-8 -*-
"""
Created on Thu Mar 24 21:13:19 2022

@author: Ahyun
"""

import turtle
import math

t = turtle.Turtle()

t.shape("turtle")
t.pensize(2)

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

