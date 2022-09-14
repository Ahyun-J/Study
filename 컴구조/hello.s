#Hello World 프린트

	#실제 코드 파트
	.text
	.globl main

main:
	# 입력을 요청하는 프린트
	la $a0, myInfo	# la : load address
	li $v0, 4 		# li : load immediate (즉석 값)
	syscall

	# 실제 정수를 입력 받는 코드
	li $v0, 5
	syscall
	# $v0에 값 저장

	add $t0, $v0, $0	# t0에 입력받은 값 저장

	la $a0, msg1	# la : load address
	li $v0, 4 		# v0값에 오버라이딩 되어 오류가 뜸 add사용
	syscall

	# $v0의 값을 프린트
	# -> 프린트 하기 위해서는 레지스터 값에 1을 넣어야 함
	# 이전에 입력 받은 값이 사라짐 임시적으로 다른 곳에 저장 필요
	#add $t0, $v0, $0
	#add $a0, $v0, $0

	add $a0, $t0, $0
	li $v0, 1
	#add $a0, $t0, $0
	syscall

	li $v0, 10 	# Program Exit!
	syscall

	#데이터 파트
	.data
myInfo:	.asciiz "Please Enter an Integer Number > "
msg1:	.asciiz "The number you put in > "
#.asciiz "20215247 조아현 \n"