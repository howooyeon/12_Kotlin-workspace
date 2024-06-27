fun main() {
    var one : IntArray = intArrayOf(10, 20, 30)
    for(i in one.indices){
        println(one[i])
    }
    for(value in one){
        println(value)
    } // one이라는 배열을 value에 담아 출력하겠다는 뜻

    var two : Array<String> = arrayOf("하나", "둘", "셋")
    for(i in 0..2 step 1){
        println(two[i])
    }

    var k : Int = 0
    while (k < two.size){
        println(two[k])
        k++ // 이걸 안하면 계속 "하나"만 나오게 됨
    }
}