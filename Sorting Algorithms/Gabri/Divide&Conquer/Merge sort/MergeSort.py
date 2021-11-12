def merge(arrA, arrB, low, mid, high):
	if (high + 1 - low >= 0):
		for i in range(0, len(arrA)):    
			arrB[i] = arrA[i]

	i = low
	j = mid + 1

	for k in range(low, high+1):
		if (i > mid):
			j+=1
			arrA[k] = arrB[j]
		elif (j > high):
			i+=1
			arrA[k] = arrB[i]
		elif (arrB[j] < arrB[i]):
			j+=1
			arrA[k] = arrB[j]
		else:
			i+=1
			arrA[k] = arrB[i]


def merge_sort_rec(arrA, arrB, low, high):
	if (high > low):
		mid = low + (high-low)//2
		
		merge_sort_rec(arrA, arrB, low, mid)
		merge_sort_rec(arrA, arrB, mid+1, high)
		
		merge(arrA, arrB, low, mid, high)


def merge_sort(arrA):
	arrBuffer = []
	merge_sort_rec(arrA, arrBuffer, 0, len(arrA) - 1)


def main():
	numbers = [89, 45, 68, 90, 29, 34, 17]
	print(f'Unsorted: {numbers}')

	merge_sort(numbers)
	print(f'Sorted: {numbers}')

main()