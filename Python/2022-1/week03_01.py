# -*- coding: utf-8 -*-
"""
Created on Thu Mar 17 19:51:47 2022

@author: Ahyun
"""

import turtle

t = turtle.Turtle()
t1 = turtle.Turtle()

t.shape("turtle")

t.pencolor("red")
t1.pencolor("blue")

t.pensize("3")
t1.pensize("3")

#2
for kk in range(1,126):
    t.fd(4)
    t1.fd(4)
    if(kk%25 == 0):
        t.left(360/5) 
        t1.right(360/5)
        
turtle.mainloop()
turtle.bye()

#1) if kk==1 or kk==3:
#2) if not(kk!=1 and kk!=3):
#3-1) if kk%2 == 1;
#3-2) if kk%2
#4-1) if kk%2 == 0;
#4-2) if not kk%2 == 0;

'''
for kk in range(1,5):
    t.fd(150)
    t.left(90)
    print(kk*2)
'''

"""
#1
for kk in range(6):
    if(kk==0 or kk==3):
        t.pencolor("red")
    if(kk==1 or kk==4):
        t.pencolor("green")
    if(kk==2 or kk==5):
        t.pencolor("blue")
    t.fd(60)
    t.left(60)
"""