package kotlinDSA.kotlinClasses

fun main(){

   val buttonclick = ButtuonClick("yes")
    buttonclick.onClick("hiiii")



}



class ButtuonClick(val lebel:String) : Click {
    override fun onClick(message: String) {

        println("message $lebel $message ")
    }
}

interface Click{

    fun onClick(message:String)
}