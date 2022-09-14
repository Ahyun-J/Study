# addi 명령어 실습!
# 학번 : 20215247
# 이름 : 조아현

	.text
	.globl main
main:
	li $t0, 3
	li $t1, 4

	addi $t2, $t0, 7	# $t2 <- $t0 (3) + 7 = 10, 0xA
	addi $t3, $t1, -1	# $t3 <- $t1 (4) + (-1) = 3
	
	li $v0, 10		# Program Exit!
	syscall

	.data