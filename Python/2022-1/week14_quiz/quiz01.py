nn = int(input())
if(nn < 0 ): #만약 nn이 0보다 작다면(음수라면)
    print("Please enter a number greater than 0") # 오류 메세지 출력
else: #아니라면
    for kk in range (1,nn+1): # 1부터 nn까지
        print('\"',end='') # " 출력, 마지막에 줄바꾸지 않음
        print(kk,end='') # 출력 횟수 출력, 마지막에 줄바꾸지 않음
        print('\" Hello World') # " Hello World 출력
