fun main() {
    val num1 = 10
    val num2 = 3
    val result : Int

    result = max(num1, num2)
    println(result)
}

fun max(a: Int, b: Int) = if(a > b) a else b

// 메모리 -> RAM 이건 CPU가 동작
// 실질적으로 RAM이 메모리
// Stack으로 main()이 먼저 자리 main()함수의 프레임, 그 다음으로 max()의 프레임