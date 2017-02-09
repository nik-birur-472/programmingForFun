public class quickSort{

	public void swapElements(int[] input_array, int first_pos, int second_pos){
		int temp = input_array[first_pos];
		input_array[first_pos] = input_array[second_pos];
		input_array[second_pos] = temp;


	}

	public int partition(int[] input_array,int low,int high){
		
		int j = low;
		int i = j - 1;
		int pivot = input_array[high];
		while(j<high){
			if(input_array[j]<=pivot){
				i++;
				swapElements(input_array,i,j);
			}
			j++;
		}
		swapElements(input_array, i+1,high);
		return i+1;
	}


	public void quickSort(int[] input_array, int low, int high){
		if(low<high){
			int partition = partition(input_array,low,high);
			quickSort(input_array,low,partition-1);
			quickSort(input_array,partition+1,high);

		}

	}



	public void sort(int[] input_array){
		int low = 0;
		int high = input_array.length - 1;
		quickSort(input_array,low,high);

	}

	public void printArray(int[] input_array){
		for(int element : input_array){
			System.out.print(element+" ");
		}
		System.out.println();
	}

	public static void main(String[] args){

		int[] input_array = {-8,9,-3,0,4,-3,65,-23};
		quickSort qs = new quickSort();
		System.out.println("Elements Before Sorting");
		qs.printArray(input_array);
		qs.sort(input_array);
		System.out.println("Elements After Sorting");
		qs.printArray(input_array);

	}


}


