# -*- coding: utf-8 -*-
"""
Created on Sun Jun 12 21:47:45 2022

@author: Ahyun
"""

import turtle
import csv

aaa = turtle.Turtle()
bbb = turtle.Turtle()
sc = turtle.Screen()
turtle.title('마우스클릭')

bbb.penup()
bbb.goto(-230,150) 
bbb.shape('turtle')
bbb.hideturtle()
bbb.write('Clear [C] \nSave [S] \nRead [R]', font=('Arial', 15, 'normal'))

sc.setup(500,500)
         #, startx = 0, starty = 0)
aaa.penup()
aaa.goto(0,0)
lt_back=[]
lt = []

aaa.speed(100)
def screenLeftClick(x, y) :    
    aaa.pendown()
    aaa.goto(x, y)
    lt.append([x,y])
    lt_back.append([x,y])
    print(lt)
    aaa.penup()

def screenRightClick(x, y):
    aaa.penup()
    aaa.goto(x,y) 
    
def key_clear():
    aaa.clear()
    aaa.penup()
    menu('c')
    aaa.goto(0,0)
    
def key_save():
    menu('s')
    with open('turtle.csv', 'w', encoding='euc-kr') as w:
        wr = csv.writer(w)
        wr.writerow(lt)
        print(f'{lt} save')

def key_read():
    menu('r')
    with open('turtle.csv', 'r', encoding='euc-kr') as r:  
        reader = csv.reader(r)
        for line in reader:
            frawline(line)
        print(f"{reader} read")
    
def key_back():
    if len(lt_back) > 0:
        lt.oppend(lt_back[1])
        lt_back.pop()
        print(lt_back)
    aaa.clear()
    menu('1')
    for line in lt:
        frawline(line)
    print(lt)
    
def key_next():
    if len(lt_back) > 0:
        lt.oppend(lt_back[-1])
        lt_back.pop()
        print(lt_back)
    aaa.clear()
    menu('2')
    for line in lt:
        frawline(line)
    print(lt)
    
def key_merge():
    menu('3')
    pass

def frawline(line):
    aaa.goto(line)
    pass

def menu(now):
    bbb.clear()
    #bbb.goto(-230,200) 
    menu = {'c':'Clear [C]', 's':'Save [S]', 'r':'Read [R]', '1':'Back [1]', '2':'Next [2]', '3':'Merge[3]'}
    key = list(menu.keys())
    
    for t in key:
        if t == now:
            bbb.color('red')
            bbb.write(f'{menu.get(t)}\n', font=('Arial', 15, 'normal'))
        else:
            bbb.color('black')
            bbb.write(f'{menu.get(t)}\n', font=('Arial', 15, 'normal'))
    
    
turtle.onscreenclick(screenLeftClick, 1)
turtle.onscreenclick(screenRightClick, 3) #오른쪽마우스 등록
turtle.onkey(key_clear,'c')
turtle.onkey(key_save,'s') # 그려진 내용을 저장할 수 있다. (*.csv 파일에 저장)
turtle.onkey(key_read,'r') #저장된 그림을 불러
turtle.onkey(key_back,'1') #가장 최근에 그려진 선을 삭제
turtle.onkey(key_next,'2')  #가장 최근에 삭제된 선을 복구
turtle.onkey(key_merge,'3') #가깝게 떨어져 있는 선분들을 결합
turtle.listen()

turtle.done()