import kotlin.math.pow
fun main() {
    print("Введите номер задания: ")
    var d = readLine().toString()
    when (d) {
        "1" -> cubenumbers()
        "2" -> fibbo()
        "3" -> flippendo()
    }
}
fun cubenumbers() {
    print("Введите первое число интервала: ")
    val a = readLine().toString().toInt()
    print("Введите второе число интервала: ")
    val b = readLine().toString().toInt()
    var cube = a.toDouble()
        while (cube<=b) {
        println(cube.pow(3))
        cube++
    }
}
fun fibbo() {
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
fun flippendo() {
    print("Введите число: ")
    var k = readLine().toString()
    var len = k.length
    var i = len-1
    while (i >= 0) {
        print(k.get(i))
        i--
    }
}