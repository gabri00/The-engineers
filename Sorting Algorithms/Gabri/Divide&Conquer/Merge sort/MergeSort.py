def merge(arrA, arrB, low, mid, high):
	if (high + 1 - low >= 0):
		for i in range(low, high+1):    
			arrB[i] = arrA[i]

	i = low
	j = mid + 1

	for k in range(low, high+1):
		if (i > mid):
			arrA[k] = arrB[j]
			j+=1
		elif (j > high):
			arrA[k] = arrB[i]
			i+=1
		elif (arrB[j] < arrB[i]):
			arrA[k] = arrB[j]
			j+=1
		else:
			arrA[k] = arrB[i]
			i+=1


def merge_sort_rec(arrA, arrB, low, high):
	if (high > low):
		mid = low + (high-low)//2
		
		merge_sort_rec(arrA, arrB, low, mid)
		merge_sort_rec(arrA, arrB, mid+1, high)
		
		merge(arrA, arrB, low, mid, high)


def merge_sort(arrA):
	arrBuffer = [0] * len(arrA)
	merge_sort_rec(arrA, arrBuffer, 0, len(arrA) - 1)


def main():
	numbers = [89, 45, 68, 90, 29, 34, 17]
	print(f'Unsorted: {numbers}')

	merge_sort(numbers)
	print(f'Sorted: {numbers}')

main()