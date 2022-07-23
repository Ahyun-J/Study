// 조건문
// 2. 시험 성적 (9498): when 표현식 사용 필수
import java.util.*

fun main(){
    val scanner = Scanner(System.`in`)
    var x = scanner.nextInt()
    
    when (x) {
        in 90..100 -> print("A")
        in 80..89 -> print("B")
        in 70..79 -> print("C")
        in 60..69 -> print("D")
        else -> {
            print("F")
        }
    }
}

//------------------
// 5. 알람 시계 (2884)
import java.util.*

fun main(){
    val scanner = Scanner(System.`in`)
    var h = scanner.nextInt()
    var m = scanner.nextInt()
    
    when(m){
        in 45..59 -> {
            m = m-45
            print("$h $m")
            }
        else -> {
            if(h==0){
                h = 24
            }
                h = h-1
                m = 60+m-45
                print("$h $m")
        }
    }
}

// 반복문 ------------------
// 7. A+B - 7 (11021)
import java.util.*

fun main(){
    val scanner = Scanner(System.`in`)
    var n = scanner.nextInt()

    for(x in 1..n){
        var a = scanner.nextInt()
        var b = scanner.nextInt()
        var sum = a+b
        
        println("Case #$x: $sum")
    }    
}

//------------------
// 8. A+B - 8 (11022)
import java.util.*

fun main(){
    val scanner = Scanner(System.`in`)
    var n = scanner.nextInt()

    for(x in 1..n){
        var a = scanner.nextInt()
        var b = scanner.nextInt()
        var sum = a+b
        
        println("Case #$x: $a + $b = $sum")
    }    
}

//------------------
// 10. 별 찍기 2 (2439)
import java.util.*

fun main(){
    val scanner = Scanner(System.`in`)
    var n = scanner.nextInt()

    for(x in 1..n){
        for (i in 1..n-x) {
          print(" ")
        }
        for (j in 1..x) {
          print("*")
        }
       println()
   }    
}

// 1차원 배열 ------------------
// 6. OX퀴즈 (8958)
import java.util.*

fun main() = with(Scanner(System.`in`)) {
    val num = nextInt()

    repeat(num) {
        val ox = next()
        var count = 1
        var result = 0
        ox.forEach {
            if (it == 'O') {
                result += count++
            } else {
                count = 1
            }
        }
        println(result)
    }
}

//------------------
// 7. 평균은 넘겠지 (4344)
