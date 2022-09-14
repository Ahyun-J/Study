# 논리 명령어 실습!
# 학번 : 20215247
# 소속: 소프트웨어학부 빅데이터 전공  이름 : 조아현

	.text
	.globl main
main:
	# 논리 명령어를 실행해 봅니다!
	li $t0, 0x0000FFFF
	li $t1, 0x12345678
	
	and $t2, $t0, $t1	# $t2 <- $t1 & $t0	 : 0x00005678
	or $t3, $t0, $t1	# $t3 <- $t1 | $t0 : 0x1234FFFF
	xor $t4, $t0, $t1
	nor $t5, $t0, $t1
	andi $t6, $t0, $t1
	ori $t7, $t0, $t1
	xori $t8, $t0, $t1
	
	li $v0, 10		# Program Exit!
	syscall

	.data