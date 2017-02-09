/*
*	Insertion Sort : Involves arranging the elements of an array in ascending/
*	descending order.
*
*	The algorithm works exactly like hoe we sort a deck of playing cards by hand.
*
*/


public class insertionSort{



	public int[] insertionSort(int[] input_array){
		
		int size_array = input_array.length;
		
		for(int i = 1; i<size_array;i++){
			int key = input_array[i];
			int j = i-1;
			while(j>=0){
				if(input_array[j]>key){
					input_array[j+1] = input_array[j];
					j--;
				}
				else{
					break;
				}
				
			}	
			input_array[j+1] = key;

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
		insertionSort is = new insertionSort();
		System.out.println("Elements Before Sorting");
		is.printArray(input_array);
		int[] output_array = is.insertionSort(input_array);
		System.out.println("Elements After Sorting");
		is.printArray(output_array);

	}


}