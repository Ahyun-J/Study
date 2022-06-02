# numpy.array(), numpy.arange(), numpy.linspace(), numpy.zeros(), numpy.ones()
import numpy as np
import numpy.linalg as nl
import scipy as sc
import scipy.linalg as sl

import matplotlib.pyplot as plt
import seaborn as sns

T1=10
T2=20
T3=30
T4=40
n=5
s=n*n

A=np.zeros((s,s))
b=np.zeros(s)

for i in range(s):
    if i == 0:
        A[i,i]=4
        A[i,i+1]=-1
        A[i,i+n]=-1
        b[i]=T1+T3

    elif i < 4:
        A[i,i-1]=-1
        A[i,i]=4
        A[i,i+1]=-1
        A[i,i+n]=-1
        b[i]=T3

    elif i == n-1:
        A[i,i]=4
        A[i,i-1]=-1
        A[i,i+n]=-1
        b[i]=T2+T3

    elif i == (s-n):
        A[i,i]=4
        A[i,i+1]=-1
        A[i,i-n]=-1
        b[i]=T1+T4

    elif (s-1)>i>s-n:  
        A[i,i]=4
        A[i,i-1]=-1
        A[i,i+1]=-1
        A[i,i-n]=-1
        b[i]=T4
        
    elif i == (s-1):
        A[i,i]=4
        A[i,i-1]=-1
        A[i,i-n]=-1
        b[i]=T4+T2
        
    else:
        A[i,i]=4
        A[i,i-1]=-1
        A[i,i+1]=-1
        A[i,i-n]=-1
        A[i,i+n]=-1
        b[i]=0

x1=nl.inv(A)@b
P,L,U=sl.lu(A)
y=nl.inv(L)@b
x2=nl.inv(U)@y

x=np.zeros((n,n))

for i in range(n):
    if i == 0:
        x[i,:]=x1[0:n]
    else:
        x[i,:]=x1[(i-1)*n:(i*n)]

sns.heatmap(A)
plt.show()    

sns.heatmap(A, cmap='coolwarm')
plt.show()    

sns.heatmap(A, annot=True) #숫자 출력
plt.show()  

sns.heatmap(x)
plt.show()    

sns.heatmap(x, cmap='coolwarm')
plt.show()    

sns.heatmap(x, annot=True) #숫자 출력
plt.show()  

