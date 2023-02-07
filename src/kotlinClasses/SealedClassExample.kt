package kotlinClasses

sealed class SealedClassExample {


    class A : SealedClassExample() {

        fun printA() {
            println("function of class A Printed")
        }
    }

    class B : SealedClassExample() {

        fun printB() {
            println("function of class B printed")
        }
    }
}


fun main() {
    val obj = SealedClassExample.A()
    obj.printA()
}