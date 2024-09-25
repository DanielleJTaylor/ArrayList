import java.util.Arrays;

public class TestFile {

	public static void main(String[] args) {

		IntegerArrayOperations Quick_arr = new IntegerArrayOperations("numbers.txt");

		System.out.println(Arrays.toString(Quick_arr.arr));

		Quick_arr.quickSort(0, Quick_arr.arr.length - 1);

		int Quick_n = Quick_arr.arr.length;

		Quick_arr.quickSort(0, Quick_n - 1);
		System.out.print("Sorted array: ");
		System.out.println(Arrays.toString(Quick_arr.arr));

		IntegerArrayOperations Merge_arr = new IntegerArrayOperations("numbers.txt");

		System.out.println(Arrays.toString(Merge_arr.arr));

		Merge_arr.mergeSort(0, Merge_arr.arr.length - 1);

		int Merge_n = Merge_arr.arr.length;

	
		Merge_arr.mergeSort(0, Merge_n - 1);
		System.out.print("Sorted array: ");
		System.out.println(Arrays.toString(Merge_arr.arr));

		
		//Start loop
		System.out.println("");
		System.out.println("Quick Sort");

		double totalTime = 0;

		double startTime = System.currentTimeMillis();
		
		for (int i = 0; i < 10; i++) {
			
			IntegerArrayOperations object = new IntegerArrayOperations(10000);
			
			object.quickSort(0, object.arr.length - 1);
			
		}
		
		double endTime = System.currentTimeMillis();
		double duration = endTime - startTime;
		totalTime += duration;

		double averageTime = totalTime / 10;
		System.out.println("Total Time Cost: " + totalTime);
		System.out.println("Average time cost: " + averageTime);

	

		//Start loop
	System.out.println("");
	System.out.println("Merge Sort");

	totalTime = 0;

	startTime = System.currentTimeMillis();
	
	for (int i = 0; i < 10; i++) {
		
		IntegerArrayOperations object = new IntegerArrayOperations(10000);
		object.mergeSort(0, object.arr.length - 1);
		
	}
	
	 endTime = System.currentTimeMillis();
	 duration = endTime - startTime;
	totalTime += duration;

	 averageTime = totalTime / 10;
	System.out.println("Total Time Cost: " + totalTime);
	System.out.println("Average time cost: " + averageTime);

	
	}	

}
