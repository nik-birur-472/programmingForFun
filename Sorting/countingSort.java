import java.util.*;

public class countingSort{

	
	public int[] getCountArray(int[] input_array){
		int max = Integer.MIN_VALUE;
		for(int num : input_array){
			max = Math.max(max,num);
		}
	
		int[] count_array = new int[max+1];

		for(int num : input_array)
			count_array[num]++;

		for(int i = 1;i<count_array.length;i++){
			count_array[i] += count_array[i-1];
		}

		return count_array;

	}

	public void countSort(int[] input_array){
		int[] countArray = getCountArray(input_array);
		int[] tempArray = Arrays.copyOf(input_array, input_array.length);;
		for(int i = 0;i<tempArray.length;i++){
			input_array[countArray[tempArray[i]]-1] = tempArray[i];
			countArray[tempArray[i]]--;

		}

	}

	public void printArray(int[] input_array){
		for(int element : input_array){
			System.out.print(element+" ");
		}
		System.out.println();
	}

	public static void main(String[] args){

		int[] input_array = {31,9,50,6};
		countingSort cs = new countingSort();
		System.out.println("Elements Before Sorting");
		cs.printArray(input_array);
		cs.countSort(input_array);
		System.out.println("Elements After Sorting");
		cs.printArray(input_array);

	}


} 



