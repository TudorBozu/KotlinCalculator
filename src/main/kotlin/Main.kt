fun main() {

    println("Hello in my calculator app\n")

    while (true) {
        println("Enter first number:")
        val first = readln()?.toDoubleOrNull()
        println("Enter second number:")
        val second = readln()?.toDoubleOrNull()
        println("Enter a operator (+,/,-,*)")
        val operator = readln()

        if (first == null || second == null || operator.isNullOrEmpty()) {
            println("Enter valid data")
        } else {
            val reuslt = calculate(first, operator, second)

            println("$first $operator $second = $reuslt")
        }
    }
}

fun calculate(first: Double, operator: String, second: Double): Double {

    var res = 0.0

    when (operator){

        "+" -> res = first + second
        "-" -> res = first - second
        "*" -> res = first * second
        "/" -> res = first / second

        else -> println("Don't exist this operator")
    }
    return res

}


