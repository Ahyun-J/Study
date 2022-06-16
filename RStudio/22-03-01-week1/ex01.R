tmp0 = c(1,2,3,4,5,6,7,8,9,10)

tmp0

sum(tmp0)
#평균
mean(tmp0)
#분산
var(tmp0)
#표준편차
sd(tmp0)

#CAD(엑셀, 파워포인트, 프리미어, 포토샵..)
# 자동화 불가능
#Programming

#1부터 10까지의 자연수의 평균을 반복문을 사용하여 구하라

tmp0 = c(1:10)
result = 0

for(i in tmp0){
  result = result + i
}
avg0 = result/length(tmp0)

cat('sum ; ', result, sum(tmp0), '\n')
cat('avg ; ', avg0, mean(tmp0), '\n')

#for(kk in tmp0){
#  cat(kk, '\n')
#}

sum1 = 0

for(kk in tmp0){
  sum1 = sum1 + (avg0 - kk)**2
}

var0 = sum1/(length(tmp0)-1)
std0 = sqrt(var0)

cat('var ; ', var0, var(tmp0), '\n')
cat('std ; ', std0, sd(tmp0), '\n')

#####################
tmp0 = c(1:10)
sum0 = 0

for(i in tmp0){
  sum0= sum0+ i
}
avg0 = sum0/length(tmp0)

sum1 = 0

for(kk in tmp0){
  sum1 = sum1 + (avg0 - kk)**2
}

var0 = sum1/(length(tmp0)-1)
std0 = sqrt(var0)
cat('sum ; ', sum0, '\n')
cat('avg ; ', avg0, '\n')
cat('var ; ', var0, '\n')
cat('std ; ', std0, '\n')

