fun selectionSort(array: IntArray) {
    for (i in 0 until array.size - 1) {
        var currMin = i

        for (j in i + 1 until array.size)
            if (array[j] < array[currMin]) currMin = j

        array[i] = array[currMin].also { array[currMin] = array[i] }
    }
}

fun main() {
    val numbers = intArrayOf(89, 45, 68, 90, 29, 34, 17)
    println("Unsorted: " + numbers.contentToString())

    selectionSort(numbers)
    println("Sorted: " + numbers.contentToString())
}