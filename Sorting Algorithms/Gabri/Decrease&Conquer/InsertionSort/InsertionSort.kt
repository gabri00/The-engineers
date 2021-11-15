fun insertionSort(arr: IntArray) {
    for (i in 1 until arr.size) {
        val el = arr[i]
        var j = i - 1
        while (j >= 0 && arr[j] > el) arr[j + 1] = arr[j--]
        arr[j + 1] = el
    }
}

fun main() {
    val numbers = intArrayOf(89, 45, 68, 90, 29, 34, 17)
    println("Unsorted: " + numbers.contentToString())

    insertionSort(numbers)
    println("Sorted: " + numbers.contentToString())
}