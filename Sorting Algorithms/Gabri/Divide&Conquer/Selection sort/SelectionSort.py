def selection_sort(array):
    for i in range(len(array) - 1):
        currMin = i

        for j in range(i + 1, len(array)):
            if (array[j] < array[currMin]):
            	currMin = j

        swap(array, i, currMin)


def swap(arr, i, min):
    temp = arr[i]
    arr[i] = arr[min]
    arr[min] = temp


def main():
	numbers = [89, 45, 68, 90, 29, 34, 17]
	print(f'Unsorted: {numbers}')

	selection_sort(numbers)
	print(f'Sorted: {numbers}')

main()