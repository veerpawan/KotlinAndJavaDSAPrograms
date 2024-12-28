package kotlinSample.kotlinClasses

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
    
    //val obj = SealedClassExample.A()
    //obj.printA()

    lateinit var name:String

   fun initialize(){
       name = "pawan"
   }





    val sum = { a: Int, b: Int -> a + b }

    val result = sum(3,4)
    println(result)


}