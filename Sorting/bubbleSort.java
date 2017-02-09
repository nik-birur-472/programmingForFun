/*
*	Bubble Sort : Involves arranging the elements of an array in ascending/
*	descending order.
*
*	The algorithm works moving the largest element to the end of the array like a 
*	bubble.
*
*
*/


public class bubbleSort{



	public void swapElements(int[] input_array, int first_pos, int second_pos){

		int temp = input_array[second_pos];
		input_array[second_pos] = input_array[first_pos];
		input_array[first_pos] = temp;

	}


	public int[] bubbleSort(int[] input_array){
		
		int size_array = input_array.length;
		for(int i = 0 ; i<size_array - 1; i++){
			for(int j = 0 ; j<size_array - i - 1; j++){
				if(input_array[j+1] < input_array[j]){
					swapElements(input_array,j,j+1);
				}
			}
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

		int[] input_array = {64, 34, 25, 12, 22, 11, 90};
		bubbleSort bs = new bubbleSort();
		System.out.println("Elements Before Sorting");
		bs.printArray(input_array);
		int[] output_array = bs.bubbleSort(input_array);
		System.out.println("Elements After Sorting");
		bs.printArray(output_array);

	}


}