#1)
#getwd() - 현재 작업 경로의 위치 확인
#read.csv() - 파일 불러오기
getwd()
df.data = read.csv(file = "Excel_data.csv"
                   ,header = TRUE 
                   ,fileEncoding = "UCS-2LE")
df.menu = read.csv(file = "Excel_menu.csv"
                   ,header = TRUE 
                   ,fileEncoding = "UCS-2LE")
df.team = read.csv(file = "Excel_team.csv"
                   ,header = TRUE 
                   ,fileEncoding = "UCS-2LE")

#2)
#table() - 데이터의 빈도
#as.data.frame() - 객체를 데이터 프레임으로 변환
#colnames() - 열 이름 변경
#merge() - 데이터를 특정 열을 기준으로 병합
#order() - 데이터 정렬

df.cnt = as.data.frame(table(df.data$메뉴명))
colnames(df.cnt) = c('메뉴명','수량')

df.menu.new = merge(df.menu, df.cnt, key = '메뉴명')
df.menu.new = df.menu.new[order(df.menu.new$수량,decreasing=TRUE),]

#3)
#as.character() - 문자형으로 변환
#gsub() - 패턴 치환 gsub(찾을 것, 바꿀 것, 열 지정)
#as.numeric() - 숫자형으로 변환
#tapply() - 벡터의 특정요소에 관한 함수 실행 
#           tapply(벡터, 요인, 함수)

df0 = merge(df.data, df.menu, key = '메뉴명')
colnames(df0)[3] = '팀'
df0 = merge(df0, df.team, key = '팀')

num = gsub(",", "", df0$단가.원.)  
won = as.numeric(num)
df.sum1 = as.table(tapply(won , df0$본부, sum))
df1 = as.data.frame( df.sum1)
colnames(df1) = c("본부", "금액.원.")