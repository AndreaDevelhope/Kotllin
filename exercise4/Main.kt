package exercise4

fun main(args: Array<String>){
//Create a list of integers, transform it into a list of strings, and exercise5.print them one by one
    val listOfInt = listOf(1,2,3,4)
    listOfInt.map { it.toString() }.forEach { println(it) }

    val strings = listOfInt.map { it.toString() }
    strings.forEach {println(it)}
}