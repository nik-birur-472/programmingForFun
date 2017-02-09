/*
*	Selection Sort : Involves arranging the elements of an array in ascending/
*	descending order.
*
*	The algorithm works by dividing the array into a sorted and an unsorted array. The 
*	smallest element in the unsorted array is found and put at the end of the sorted 
*	array.
*
*
*/


public class selectionSort{



	public void swapElements(int[] input_array, int first_pos, int second_pos){

		int temp = input_array[second_pos];
		input_array[second_pos] = input_array[first_pos];
		input_array[first_pos] = temp;

	}


	public int[] selectSort(int[] input_array){
		int min_pos = 0;
		int size_array = input_array.length;
		for(int i = 0 ; i<size_array - 1; i++){
			min_pos = i;
			for(int j = i+1 ; j<size_array; j++){
				if(input_array[j] < input_array[min_pos]){
					min_pos = j;
				}
			}
			swapElements(input_array,i,min_pos);
		}

		return input_array;
	}
	
	public void printArray(int[] input_array){
		for(int element : input_array){
			System.out.print(element+" ");
		}
		System.out.println();
	}

	public static void main(String[] args){

		int[] input_array = {23,45,13,9,89};
		selectionSort ss = new selectionSort();
		System.out.println("Elements Before Sorting");
		ss.printArray(input_array);
		int[] output_array = ss.selectSort(input_array);
		System.out.println("Elements After Sorting");
		ss.printArray(output_array);

	}


}