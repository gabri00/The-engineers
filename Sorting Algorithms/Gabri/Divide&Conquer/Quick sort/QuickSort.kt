fun quickSort(arr: IntArray, low: Int, high: Int) {
    if (low < high) {
        val pi = partition(arr, low, high) // partitioning index

        quickSort(arr, low, pi - 1)
        quickSort(arr, pi + 1, high)
    }
}

fun partition(arr: IntArray, low: Int, high: Int): Int {
    val pivot = arr[high] // Select the last element as pivot
    var i = low - 1 // Index of the smaller element

    for (j in low until high) {
        // If current element is smaller than the pivot increment i and swap
        if (arr[j] <= pivot) swap(arr, ++i, j)
    }

    swap(arr, i + 1, high)

    return i + 1
}

fun swap(a: IntArray, i: Int, j: Int) {
    val temp = a[i]
    a[i] = a[j]
    a[j] = temp
}

fun main() {
    val numbers = intArrayOf(89, 45, 68, 90, 29, 34, 17)
    println("Unsorted: " + numbers.contentToString())

    quickSort(numbers, 0, numbers.size - 1)
    println("Sorted: " + numbers.contentToString())
}