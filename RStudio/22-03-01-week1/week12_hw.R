#R언어 과제5 - 20215247 조아현 

#abs() 절댓값
abs(-5:5)
#log() 자연로그
log(1:5)
log(1:5, base = 2)
#log2() 밑이 2인 로그
log2(1:5)
#log10() 밑이 10인 로그
log10(1:5)

#factorial() 팩토리얼 ! : 1~n까지의 곱
factorial(1:5)

#choose() 조합계산(n,x) : n개에서 x개를 뽑는 경우의 수
choose(5,2)

#sqrt() 루트함수
sqrt(1:5)

#round() 반올림
round(123.567)
round(-123.567)
#floor() 바닥정수 : 내림
floor(123.567)
floor(-123.567)
#ceiling() 지붕정수 : 올림
ceiling(123.567)
ceiling(-123.567)
#trunc() 0에 가장 가까운 정수로 반올림
trunc(123.567)
trunc(-123.567)

#is.infinite() 무한대(Inf, -Inf)를 true로 반환
is.infinite(Inf)
is.infinite(-Inf)
is.infinite(5)
is.infinite(1/0)
#is.nan() 계산 결과를 정의할 수 없는 NaN을 true로 반환
is.nan(Inf/Inf)
Inf/Inf
is.nan(5)
is.nan(Inf*0)
#is.na() 결측치 NA를 true로 반환
is.na(NA)
is.na(NA+3)
is.na(5)


#cumsum() 누적합
cumsum(1:10)
#cumprod() 누적곱
cumprod(1:10)
#cummax() 누적 최대값
v1 = c(2,4,5,7,1,2,0,3)
cummax(v1)
#cummin() 누적 최소값
cummin(v1)

#diff() 차이값
diff(1:10)
diff(1:10, lag = 2)

v1 = c(1,2,3,4,5,6)
v2 = c(1,2,3,7,8,9)
#union() 합집합
union(v1,v2)
#intersect() 교집합
intersect(v1,v2)
#setdiff() 차집합
setdiff(v1,v2)
#setequal() 같은 집합인지 판단
setequal(v1,v2)
v3 = c(1,2,3,4,5,6)
setequal(v1,v3)
#is.element() 해당 원소가 있는지 확인
is.element(v1,v2)
