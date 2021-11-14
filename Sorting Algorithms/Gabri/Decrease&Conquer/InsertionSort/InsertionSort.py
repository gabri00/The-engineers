def insertion_sort(arr):
    for i in range(len(arr)):
        el = arr[i]

        j = i - 1
        while (j >= 0 and arr[j] > el):
            arr[j + 1] = arr[j]
            j = j-1

        arr[j+1] = el


def main():
    numbers = [89, 45, 68, 90, 29, 34, 17]
    print(f'Unsorted: {numbers}')

    insertion_sort(numbers)
    print(f'Sorted: {numbers}')

main()