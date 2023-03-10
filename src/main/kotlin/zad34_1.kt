import kotlin.math.pow
fun main() {
    print("Введите номер задания: ")
    var d = readLine().toString()
    when (d) {
        "1" -> cubenumbers1()
        "2" -> fibbo2()
        "3" -> flippendo3()
        "4" -> deletion4()
        "5" -> shirakuz5()
        "6" -> combo6()
    }
}
fun cubenumbers1() {
    print("Введите первое число интервала: ")
    val a = readLine().toString().toInt()
    print("Введите второе число интервала: ")
    val b = readLine().toString().toInt()
    var cube = a.toDouble()
    if (a < b) {
        while (cube <= b) {
            println(cube.pow(3))
            cube++
        }
    } else {
        while (cube >= b) {
            println(cube.pow(3))
            cube--
        }
    }
}
fun fibbo2() {
    print("Введите значение количества элементов последовательности: ")
    val n = readLine().toString().toInt()
    var i = 1
    var a = 1
    var b = 1
        while (i<=n) {
            var x = a
            a = b
            println(a)
            b = x+a
            i++
        }
}
fun flippendo3() {
    print("Введите число: ")
    var k = readLine().toString()
    var len = k.length
    var i = len-1
    var mirr = ""
    var mirror = 0
    while (i >= 0) {
        var ch = k.get(i)
        i--
        mirr = mirr + ch
    }
    mirror = mirr.toInt()
    print(mirror)
}
fun deletion4() {
    print("Введите число: ")
    var bas = readLine().toString()
    print("Введите цифру для удаления: ")
    var de = readlnOrNull()
    var chu = bas.split("$de")
    for (chunk in chu) {
        print(chunk)
    }
}
fun shirakuz5() {
    print("Введите число: ")
    var fir = readLine().toString().toInt()
    while (fir > 1) {
        if (fir.mod(2)==0) {
            fir = fir/2
        } else {
            fir = ((fir*3)+1)/2
        }
        println(fir)
    }
}
fun combo6() {

}