package exercise2//Write two different implementations of 1 parent and 2 children classes that override one method - one using inheritance and another using interfaces.

fun main(args: Array<String>){
    val inheritance = ParentInheritance("Giorgio", 40)
    inheritance.printName()
    val children1 = ParentInheritance.Children1("Marco", 48)
    val children2 = ParentInheritance.Children2("Francesco", 35)
    children1.printName()
    children2.printName()
    val children3 = Children3("Federico", 32)
    val children4 = Children4("Giovanni",23)
    println(children3.name())
    println(children4.name())
}

open class ParentInheritance(open val fatherName: String,open val fatherAge: Int){
   open fun printName() = println("$fatherName is $fatherAge years old")

    class Children1(override val fatherName: String, override val fatherAge: Int): ParentInheritance(fatherName, fatherAge){
        override fun printName() = println("$fatherName is $fatherAge years old, method ovverride done by inheritance, 1")
    }

    class Children2(override val fatherName: String, override val fatherAge: Int): ParentInheritance(fatherName, fatherAge) {
        override fun printName() = println("$fatherName is $fatherAge years old, method ovverride done by inheritance, 2")
    }
}

interface ParentInterface{
    val fatherName: String
    val fatherAge: Int
    fun name():String{
        return "$fatherName is $fatherAge years old"
    }
}

class Children3(override val fatherName: String, override val fatherAge: Int): ParentInterface {
}

class Children4(override val fatherName: String, override val fatherAge: Int): ParentInterface {
    override fun name(): String {
        return "$fatherName is $fatherAge years old, this is an override done with an interface, 2"
    }
}

