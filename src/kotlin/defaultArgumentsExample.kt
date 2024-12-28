package kotlin

class defaultArgumentsExample {
}

fun displayBorder(d:Char='=', lenght:Int= 15 ){
    for(i in 1..lenght){
        print(d)
    }


}


fun main(){

    println("Output when no argument is passed:")
    displayBorder()
    println("\n\n'*' is used as a first argument.")
    println("5 is used as a second argument.")
    println("Output when both arguments are passed:")
    displayBorder('%', 4)

    println("\n\n'*' is used as a first argument.")
    println("Output when first argument is passed:")
    displayBorder('#')

    displayBorder(lenght = 5)


}