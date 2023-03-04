fun main(args: Array<String>) {
    print("Enter a two-digit number: ")
    val a = readLine().toString().toInt()
    val b = a.mod(10)
    val c = a.div(10)

        if (b==7||c==7) {
            println("yes, the number $a has a seven")
        } else {
            println("nope, the number $a doesn't has a seven")
        }
}