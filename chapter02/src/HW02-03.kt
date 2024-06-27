import java.util.Arrays

fun main() {
    // 3X3 크기의 이차원 배열을 선언하고 for문을 이용하여 값을 할당하는 프로그램을 작성하시오

    var arr  = Array<IntArray>(3, {IntArray(3)})

//    arr[0][0] = 100
//    arr[0][1] = 110
//    arr[0][2] = 120
//    arr[1][0] = 130
//    arr[1][1] = 140
//    arr[1][2] = 150
//    arr[2][0] = 160
//    arr[2][1] = 170
//    arr[2][2] = 180

    var value : Int = 100

    for(i in 0..2){
        for(j in 0..2){
            arr[i][j] = value
            value += 10
            println("arr[$i][$j]: ${arr[i][j]}")
        }
    }

    println(Arrays.deepToString(arr))

    var simplArr = arrayOf(arrayOf(100, 110, 120), arrayOf(130, 140, 150), arrayOf(160, 170, 180))
    println(Arrays.deepToString(simplArr))

}