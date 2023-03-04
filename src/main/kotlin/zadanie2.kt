fun main(args: Array<String>) {
    print("Enter a three-digit number: ")
    val a = readLine().toString().toInt()
    val b = a.mod(10)
    val c = a.div(10).mod(10)
    val d = a.div(100)

    if ((b==4&&d==6)||
        (b==6&&d==4)||
        (b==4&&c==6)||
        (b==6&&c==4)||
        (c==4&&d==6)||
        (c==6&&d==4)) {
        println("yes, the number $a has six and four")
    } else {
        println("no, this number $a hasn't sixes and fours")
    }
}