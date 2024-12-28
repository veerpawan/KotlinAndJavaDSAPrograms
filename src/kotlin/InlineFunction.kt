package kotlin

fun main() {


    println("Start")
    printBetween({ println("FirstAction") }, { println("SecondAction") })

    println("End")
}

inline fun printBetween(doSomething: () -> Unit,noinline anotherAction: () -> Unit) {
    doSomething()
    anotherAction()
}