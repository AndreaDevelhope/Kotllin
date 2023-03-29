fun main(args: Array<String>) {
  //Write a loop that prints numbers from 1 to 100, increasing by 2 (so 1, 3, 5...).
  // Use two different printing functions for values below 50 and values above 50.
    exercise1()
}


fun exercise1() {
    for (i in 1..100 step 2) {
        when (i < 50) {
            true -> printSmall(i)
            false -> printBig(i)
        }
    }
}

fun printBig(number : Int) {
    println("$number is greater than 50")
}

fun printSmall(number : Int) {
    println("$number is smaller than 50")
}
