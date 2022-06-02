nn = input()
for kk in range (len(nn)):   # nn의 길이 만큼 반복
    if(nn[kk] == " "): #nn의 kk번째 문자가 공백이라면
        print() # 줄바꿈
    else:  # 아니라면
        print(nn[kk],end="") #nn의 kk번째 문자 출력, 줄바꾸지 않음
