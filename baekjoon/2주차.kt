// 입출력과 사칙연산
// 1 Hello World

fun main() {
    println("Hello World!")
}

//---------------------
// 2 We love kriii
fun main(){
    var str = "강한친구 대한육군"
    print("$str\n$str")
}

//---------------------
// 3 고양이
fun main(){
    println("""\    /\
 )  ( ')
(  /  )
 \(__)|""")
}

//---------------------
// 4 개
fun main(){
        println("""|\_/|
|q p|   /}
( 0 )""${'"'}\
|"^"`    |
||_/=\\__|
""")
}

//---------------------
// 5 A+B
import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    var a = scanner.nextInt()
    var b = scanner.nextInt()
    println(a+b)
}

//---------------------
// 6 A-B
import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    var a = scanner.nextInt()
    var b = scanner.nextInt()
    println(a-b)
}

//---------------------
// 7 A*B
import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    var a = scanner.nextInt()
    var b = scanner.nextInt()
    println(a*b)
}

//---------------------
// 8 A/B
import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    var a = scanner.nextDouble()
    var b = scanner.nextInt()
    println(a/b)
}

//---------------------
// 9 사칙연산
import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    var a = scanner.nextInt()
    var b = scanner.nextInt()
    println(a+b)
    println(a-b)
    println(a*b)
    println(a/b)
    println(a%b)
}

//---------------------
// 10 ??!
import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val s: String = scanner.nextLine()
    println("$s??!")
}

//---------------------
// 11 1998년생인 내가 태국에서는 2541년생?!
import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    var a = scanner.nextInt()
    println(a - 543)
}

//---------------------
// 12 나머지
import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    var A = scanner.nextInt()
    var B = scanner.nextInt()
    var C = scanner.nextInt()
    
    println((A+B)%C)
    println(((A%C) + (B%C))%C)
    println((A*B)%C)
    println(((A%C) * (B%C))%C)
}

//---------------------
// 13 곱셈
import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    var a = scanner.nextInt()
    var b = scanner.nextInt()

    println(a*(b%10))
	println(a*(b%100/10))
	println(a*(b/100))
	println(a*b)
}
