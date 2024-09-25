import java.util.Scanner;

public class Test_Sort {

	public static void main(String[] args) {
		//Selection Sort
		System.out.println("Selection Sort");
		IntegerArrayOperations Array1= new IntegerArrayOperations(9);
		Array1.display();
		Array1.selectionSort();
		Array1.display();
		
		//Insertion Sort
		System.out.println("Insertion Sort");
		IntegerArrayOperations Array2= new IntegerArrayOperations(9);
		Array2.display();
		Array2.insertionSort();
		Array2.display();
		
		//Binary Search
		
		System.out.println("Binary search");
		System.out.println("Index: " + Array1.BinarySearch(Array1.arr[2]));
		System.out.println("Index: " + Array1.BinarySearch(109));
	}
}






/*In the IntegerArrayOperations class, the first thing I did was create 
an constructor to initialize the arr array with a given size 
and fill with random integers values using the Random class.


After I created the swap method which swaps two elements in an array.

The display method goes through each element of the array and displays them with a space inbetween.

The selectionSort methods goes through the array from start to the 
element second from the end of the array.
The selectionSort method starts by finding the minimum value in array swaps it 
with the element in the front then iterates through the array
after the element that swapped to find the next minimum value and swaps it again.

The insertionSort through the array from start to the end of the array.
he selectionSort method starts by saving the first element in an 
temporary variable then goes through the array until it finds the element that is 
smaller than it then inserts the value after the smaller element.
Then iterates through the array after the inserted element repeating the previous steps.

The Binary Search method is given an element that the user wants the index of 
and goes through the array. Dividing the array in half and finding the midpoint.
Then checks each half seeing if the element is larger or smaller 
than the midpoint. If larger then it will check the right after the midpoint
if smaller then it will check before the midpoint.
Repeating the process until the midpoint is equal to the element 
the user wants then returns the index of midpoint.
If the element isn't in array then the method returns -1.*/
