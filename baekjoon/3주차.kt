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


//------------------
// 8. A+B - 8 (11022)


//------------------
// 10. 별 찍기 2 (2439)


// 1차원 배열 ------------------
// 6. OX퀴즈 (8958)


//------------------
// 7. 평균은 넘겠지 (4344)
