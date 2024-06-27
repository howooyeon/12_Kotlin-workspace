fun main() {
    // 5단부터 8단까지 구구단을 출력하는 프로그램을 for문으로 작성하시오
    for(dan in 5..8){
        for(num in 1 .. 9){
            println("$dan x $num = " + dan * num)
        }
        println("=============")
    }

}