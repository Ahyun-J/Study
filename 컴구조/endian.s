# MIPS 프로세서의 Endian 확인
# 학번 : 20215247
# 이름 : 조아현

	.text
	.globl main
main:
	la $t1, temp	# temp 변수의 주소를 $t1에 넣기!
	li $t0 0x23456789 	# $t0 <- 0x23456789

	# 수업시간 보았던 코드!
	sw $t0, 0($t1)
	lb $s0, 1($t1)	# $s0 <- 값!!
			# Big-Endian: 0x45, Little-Endian: 0x67(103)!!

	# $s0의 값을 확인하여 MIPS 프로세서의 Endian을 결정할 수 있음!
	add $a0, $s0, 0	# $a0 <- $s0
	li $v0, 1
	syscall
	
	li $v0, 10		# 프로그램 Exit
	syscall
	

	.data
temp:	.word 0