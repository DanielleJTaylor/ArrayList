/*
 * Danielle Taylor
 * CPS350
 * 
 * Description: 
 *For this project, I created an array of random integers to sort using selection and insertion sort.
 *Then created a binary search method to find the index of a specific element.
 * 
 */

import java.util.Arrays;
import java.util.Random;

public class IntegerArrayOperations {
	 static final int MAX_SIZE = 100; //the default maximum size of the array  
	 int[] arr;      
	 int currentSize; // the number of valid elements 
	 
	 
	 // Initializing an array of the maximum size given by n     
	 IntegerArrayOperations(int n) {            
		 Random rand = new Random();
		 this.arr = new int[n];
		 
		 for (int i=0;i<n;i++) {
			 //this.arr[i] = rand.nextInt();
			 this.arr[i] = rand.nextInt(100-1)+1;
		 }

	 } 
	 public static void swap(int a[], int i, int j) { 
		 int temp = a[i];
		 a[i]=a[j];
		 a[j]=temp;
		 }
	 
	 public void display() {
		 for (int i=0;i<arr.length;i++) {
			 System.out.print( this.arr[i]+ " ");
		 }
		 System.out.println("");
	 }
	 
	 public void selectionSort() { 
		 int arr_length = this.arr.length;
		 
		 for (int i =0; i<arr_length-1; i++) {
			 int min= i;
			 for (int j= i+1; j<arr_length; j++) {
				 if (arr[min]> arr[j]) {
					 min=j;
				 }
			 }
			 //swap
			 swap(arr, i, min);
		 }
	 }
	 
	 public void insertionSort() {
		 int arr_length = this.arr.length;
		 for (int i=0;i<arr_length;i++) {
			 int entry = arr[i];
			 int j = i-1;
			 while(j>=0 && arr[j]>entry) {
				 arr[j+1]=arr[j];
				 j--;
			 }
			 //inserts after the number smaller than it
			 arr[j+1]=entry;
		 }
	 }
	 
	 public int BinarySearch(int key) {
		int start = 0;
		int end = arr.length;
		
		
		 while(start<=end){
	            int mid = start+(end-start)/2;

	            if(key==arr[mid]){
	                return mid;
	            }

	            if(key<arr[mid]){
	                end = mid-1;
	            }
	            else {
	                start = mid+1;
	            }
	        } 
		 
		 return -1; //if false
		 
	 }
	 
}
