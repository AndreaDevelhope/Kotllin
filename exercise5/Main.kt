package exercise5

//Write an extension method that filters a list by value (e.g. smaller than 500).
// Write an extension method that prints list values.
// Then create a list that has at least 10 members, filter them and then exercise5.print the values that pass the filter.
fun main(args: Array<String>){
    val numbers = Numbers(listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 705, 1005, 45669))
    numbers.print()
    numbers.filterSmaller().forEach { println(it) }
    println(numbers.filterSmaller())
}

data class Numbers(val numbers: List<Int>)

fun Numbers.filterSmaller(): List<Int> = numbers.filter { it < 500 }


fun Numbers.print() = println(numbers)
