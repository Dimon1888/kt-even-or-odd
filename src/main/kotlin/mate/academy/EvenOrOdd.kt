package mate.academy

//Створіть evenOrOdd()функцію, яка приймає ціле число як аргумент і повертає результат "Even"для парних або "Odd"непарних чисел.
// Create a function `evenOrOdd` that takes an integer as an argument
// and returns "Even" for eve
// Створіть функцію `evenOrOdd`, яка приймає ціле число як аргумент
// та повертає "Парний" для парних чисел або "Непарний" для непарних чисел.n numbers or "Odd" for odd numbers.
fun evenOrOdd(number: Int) = if (number % 2 == 0) {
    "Even"
} else {
    "Odd"
}

fun main() {
    println("10 e ${evenOrOdd(10)}")
}
