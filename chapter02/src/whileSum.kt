fun main() {
    var sum = 0
    var x = 0

    while (x <= 10){
        sum += x
        x++
    }
    println("sum: $sum")

    sum = 0
    x = 0

    // 조건에 안맞아서 탈출을 하더라도 1번 이상 실행
    do{
        sum += x
        x++
    }while (x <= 10)
    println("sum: $sum")

}