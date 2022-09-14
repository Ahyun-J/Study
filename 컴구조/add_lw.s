#Hello World 프린트

	#실제 코드 파트
	.text
	.globl main

main:
	# add / sub

	# li $t0, 10
	# li $t1, 11
	# add $t2, $t1, $t0
	# sub $t2, $t1, $t0

	# lw / sw
	
	lw $t0, aaa	# memory variabke aaa 값을 읽어서 $t0에 넣어라
	lw $t1, bbb	# memory variabke bbb 값을 읽어서 $t1에 넣어라
	add $t2, $t0, $t1	# $t0 + $t1 --> $t2
	
	# ccc = aaa + bbb
	sw $t2, ccc
	
	li $v0, 10 	# Program Exit!
	syscall

	#데이터 파트
	.data
aaa:	.word 1 
bbb:	.word 2
ccc:	.word 0
# 32bit data 이다 <- .word
# 값을 초기화
#.asciiz "20215247 조아현 \n"