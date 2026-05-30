package kotlinDSA.kotlinClasses

fun main() {


    val list = listOf("Pawan", "Sameer", "Riya", "Rupali", "Kundan")

    val found = list.filter { it.length > 5 }
    val found1 = list.filter {
        it.startsWith("r", ignoreCase = true) && it.endsWith(char = 'I', ignoreCase = true)
    }


    println(found1)
    val list1 = mutableListOf(12, 5, 4, 66, 5, 44, 90)
    list1.add(89)

    val stringList = mutableListOf<String>()


    for (i in 0..10) {
        stringList.add(i, "hey $i")

    }
    stringList.add("pawan")
    stringList.add("Soni")
    println(stringList)


    //println(list.filter { it.endsWith("an") })

    list1.removeAt(0)
    list1.remove(12)


    //println( list.reversed())
    //println(list1)
}