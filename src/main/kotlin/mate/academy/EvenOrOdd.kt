package mate.academy

fun evenOrOdd(number: Int) = if (number % 2 == 0) {
    "Even"
} else {
    "Odd"
}

fun main() {
    println("10 e ${evenOrOdd(10)}")
}
