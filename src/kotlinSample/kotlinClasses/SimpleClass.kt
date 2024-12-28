package kotlinSample.kotlinClasses

class SimpleClass {

    private val name = "Pawan"

    fun displayName(){

        println("My name is $name")
    }
}

fun main(){

    val s = SimpleClass()
    s.displayName()
}