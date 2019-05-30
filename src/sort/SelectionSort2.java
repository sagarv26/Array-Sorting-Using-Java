package sort;

//Java program for implementation of Selection Sort 
class SelectionSort2 
{ 
	void sort(int arr[]) 
	{ 
		int n = arr.length; 

		// One by one move boundary of unsorted subarray 
		for (int i = n-1; i > 0; i--) 
		{ 
			// Find the minimum element in unsorted array 
			int max_idx = i; 
			for (int j = i-1; j >= 0; j--) 
				if (arr[j] > arr[max_idx]) 
					max_idx = j; 

			// Swap the found minimum element with the first 
			// element 
			int temp = arr[max_idx]; 
			arr[max_idx] = arr[i]; 
			arr[i] = temp; 
		} 
	} 

	// Prints the array 
	void printArray(int arr[]) 
	{ 
		int n = arr.length; 
		for (int i=0; i<n; ++i) 
			System.out.print(arr[i]+" "); 
		System.out.println(); 
	} 

	// Driver code to test above 
	public static void main(String args[]) 
	{ 
		SelectionSort2 ob = new SelectionSort2(); 
		int arr[] = {64,25,12,22,11,64,25,12,22,11}; 
		ob.sort(arr); 
		System.out.println("Sorted array"); 
		ob.printArray(arr); 
	} 
} 

