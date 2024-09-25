/*
 * Danielle Taylor
 * CPS350
 * Project 1
 * 
 * Description: 
 *For this project, I created two constructors: 
 *one that scans in integers from another text into an array 
 *and one that generates random integers to put in an array of N size.  
 *I use quick sort and/or merge sort to sort the arrays.
 * 
 */



import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

public class IntegerArrayOperations {
	int[] arr; // array to store the integers
	int currentSize; // the number of valid elements currently in the array
	// initializing an array of the maximum size given by n

	IntegerArrayOperations(int n) {

		Random rand = new Random();
		this.arr = new int[n];

		for (int i = 0; i < n; i++) {
			// this.arr[i] = rand.nextInt();
			this.arr[i] = rand.nextInt(200 + 1) - 100;
		}
		
		currentSize= this.arr.length;
	}

	// initializing an array by reading numbers from a file
	IntegerArrayOperations(String filename) {
		try (Scanner scan = new Scanner(new File(filename))) {
			Integer first = Integer.valueOf(scan.nextLine());
			this.arr = new int[first];

			for (int i = 0; i < arr.length; i++) {
				if (scan.hasNextLine()) {
					Integer num = Integer.valueOf(scan.nextLine());
					arr[i] = num;
				}
			}
			scan.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();

		}
		currentSize= this.arr.length;
	}

	// additional methods to be implemented...
	public void swap(int i, int j) {
		int temp = this.arr[i];
		this.arr[i] = this.arr[j];
		this.arr[j] = temp;
	}

	public int medianOf3(int left, int center, int right) {
		// order left & center
		if (this.arr[left] > this.arr[center])
			swap(left, center);
		// order left & right
		if (this.arr[left] > this.arr[right])
			swap(left, right);
		// order center & right
		if (this.arr[center] > this.arr[right])
			swap(center, right);

		return center; // return median value
	} // end medianOf3()

	public void quickSort(int first, int last) {
		if (last <= first) {
			return;
		}

		int median = medianOf3(first, first + (last - first) / 2, last);
		swap(first, median); // median is the index of the median item of 3 items

		int partitionIndex = partition(first, last);
		quickSort(first, partitionIndex - 1);
		quickSort(partitionIndex + 1, last);
	}

	public int partition(int low, int high) {
		int pivot = arr[low];
		int i = low + 1, j = high;

		while (true) {
			// Find leftmost element greater
			// than or equal to pivot
			while (i <= j && arr[i] < pivot) {
				i++;
			}

			// Find rightmost element smaller
			// than or equal to pivot
			while (i <= j && arr[j] > pivot) {
				j--;
			}

			// If two pointers met.
			if (i >= j) {
				break;
			}

			swap(i, j);

		}
		swap(j,low);
		return j;
	}

	public void mergeSort(int first, int last) {
		if (last <= first) {
			return;
		} // Find the midpoint to divide the array into two halves
		int mid = first + (last - first) / 2; // Recursively sort first and second halves
		mergeSort(first, mid);
		mergeSort(mid + 1, last); // Merge the sorted halves
		merge(first, mid, last);
	}

	public void merge(int first, int mid, int last) {
		int n1 = mid - first + 1;
		int n2 = last - mid;
		int L[] = new int[n1];// create an auxiliary array
		int R[] = new int[n2];// create an auxiliary array
		for (int i = 0; i < n1; i++) {
			L[i] = arr[first + i];
		} // Copy data
		for (int j = 0; j < n2; j++) {
			R[j] = arr[mid + 1 + j];
		} // Copy data
		// Merge
		int i = 0, j = 0;
		int k = first;
		while (i < n1 && j < n2) {
			if (L[i] < R[j]) {
				arr[k] = L[i];
				i++;
			} else {
				arr[k] = R[j];
				j++;
			}
			k++;
		}
		while (i < n1) { // copy remaining elements of L[]
			arr[k] = L[i];
			i++;
			k++;
		}

		while (j < n2) {// copy remaining elements of R[]
			arr[k] = R[j];
			j++;
			k++;
		}
	}
}
