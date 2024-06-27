// 두개의 숫자를 입력받아서 덧셈, 뺄셈, 곱셈을 함수를 이용해 출력하시오

fun main() {
    print("number1 = ")
    var number1 : Int = readLine()!!.toInt()

    print("number2 = ")
    var number2 : Int = readLine()!!.toInt()

    println("number1 + number2 = ${sum(number1, number2)}")
    println("number1 - number2 = ${sub(number1, number2)}")
    println("number1 x number2 = ${mul(number1, number2)}")

}

fun sum(a: Int, b: Int) : Int = a + b

fun sub(a: Int, b : Int) : Int = if(a > b) a - b else -1 * (b - a)

fun mul(a: Int, b: Int) : Int = a * b
