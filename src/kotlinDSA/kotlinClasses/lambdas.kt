package kotlinDSA.kotlinClasses


//lambdas and trailing lambdas
fun main() {

    println(calculateCatAge(7))
    println(ageCalculate(7))
    println(agePrint("My age is -> ", 7))

    printNameOf("Pawan")
    enhancedMessage(message = "hiii", {  ageCalculate(7) })


}

fun enhancedMessage(message:String, funAsParameter:()->Int){
    println("$message ${funAsParameter()}")
}

val printNameOf: (String) -> Unit =
    {
        println(it)
    }

val agePrint: (String, Int) -> String = { ageTitle, age -> ageTitle + age }

val ageCalculate: (Int) -> Int = { it * 7 }

fun calculateCatAge(age: Int): Int {
    return age * 7

}