fun main() {
    // 1부터 100사이의 홀수를 누적하는 프로그램을 while문으로 작성하시오
    var number : Int = 1
    var sum : Int = 0

    while(number < 100){
        if(number % 2 == 1){
            sum += number
        }
        number++
    }

    println(sum)
}