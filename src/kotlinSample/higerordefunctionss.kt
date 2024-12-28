package kotlinSample

class higerordefunctionss {
}

val labdafun = {
    println("hi lambda")
}

val lambdaReturType = { a: Int, b: Int -> a + b }

fun printlabda(labda: () -> Unit) {
    labda()
}

fun printlabdareturnType(returnLambda: (Int, Int) -> Int) {
    val result = returnLambda(2, 4)
    print(result)
}

fun main() {
    //labda wihtput return type
    //printlabda(labdafun)

    labdafun.invoke()

    //lambda with parameters
    //printlabdareturnType(lambdaReturType)
}