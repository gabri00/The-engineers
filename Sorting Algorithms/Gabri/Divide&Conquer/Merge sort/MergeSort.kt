fun mergeSort(arrA: IntArray) {
    val arrBuffer = IntArray(arrA.size)
    mergeSortRecursive(arrA, arrBuffer, 0, arrA.size - 1)
}

fun mergeSortRecursive(arrA: IntArray, arrB: IntArray, low: Int, high: Int) {
    if (high > low) {
        val mid = low + (high - low) / 2

        mergeSortRecursive(arrA, arrB, low, mid)
        mergeSortRecursive(arrA, arrB, mid + 1, high)
        merge(arrA, arrB, low, mid, high)
    }
}

fun merge(arrA: IntArray, arrB: IntArray, low: Int, mid: Int, high: Int) {
    for (k in low..high) arrB[k] = arrA[k]

    var i = low
    var j = mid + 1

    for (k in low..high) {
        if (i > mid) arrA[k] = arrB[j++]
        else if (j > high) arrA[k] = arrB[i++]
        else if (arrB[j] < arrB[i]) arrA[k] = arrB[j++]
        else arrA[k] = arrB[i++]
    }
}

fun main() {
    val arrA = intArrayOf(89, 45, 68, 90, 29, 34, 17)
    println("Unordered: " + arrA.contentToString())

    mergeSort(arrA)
    println("Ordered: " + arrA.contentToString())
}