package arrays

fun main() {

    val list = listOf('r', 'y', 'r', 'y', 'o', 'i', 'r')
    val map = mutableMapOf<Char, Int>()

    for (char in list) {


        if (map.containsKey(char)) {
            map[char] = map.getOrDefault(char, 0) + 1

        } else {

            map[char] = 1
        }

    }

    for ((char, charcters) in map) {

        println("value of $char is $charcters")
    }

}