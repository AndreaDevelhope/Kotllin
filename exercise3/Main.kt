package exercise3

fun main(args: Array<String>){
//Write sealed class for a type exercise3.User that uses data classes for different types: Email, Facebook, Google.
// They need to each have an id, and optionally password or email. Use them in a when inside a method to return a printable value as String.
    val email = User.Email("Esercizio", "esercizio2@kotlin.com")
    val fb = User.Facebook("ForseHoCapito", "naso47")
    val google = User.Google("Kotlin è complicato ma figo", "gamba2")
    log(email)
    log(fb)
    log(google)
}
fun log(user: User) = when(user){
    is User.Email -> println("${user.id}, is a Email user ")
    is User.Facebook -> println("${user.id}, is a Facebook user")
    is User.Google -> println("${user.id}, is a Google user")
}

sealed class User(open val id: String){
data class Email(override val id: String, val email: String): User(id)
data class Facebook(override val id: String,val password: String): User(id)
data class Google(override val id: String,val password: String): User(id)
}
