def partition(arr, low, high):
	pivot = arr[high]
	i = low - 1

	for j in range(low, high):
		if (arr[j] <= pivot):
			i+=1
			arr[i], arr[j] = arr[j], arr[i]

	arr[i+1], arr[high] = arr[high], arr[i+1]

	return i + 1


def quick_sort(arr, low, high):
	if (low < high):
		pi = partition(arr, low, high)
		quick_sort(arr, low, pi-1)
		quick_sort(arr, pi+1, high)


def main():
	numbers = [89, 45, 68, 90, 29, 34, 17]
	print(f'Unsorted: {numbers}')

	quick_sort(numbers, 0, len(numbers) - 1)
	print(f'Sorted: {numbers}')

main()