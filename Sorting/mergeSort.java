
/*
*	Merge Sort : Involves arranging the elements of an array in ascending/
*	descending order.
*
*	The algorithm works by dividing the array two equal halves and then merging
*	arrays back.
*
*/

public class mergeSort{

	public void merge(int[] input_array,int low, int mid, int high){
		
		int l1 = mid - low +1;
		int l2 = high - mid;

		int[] arr1 = new int[l1];
		int[] arr2 = new int[l2];

		for(int i = 0;i<arr1.length;i++){
			arr1[i] = input_array[low+i];
		}

		for(int i = 0;i<arr2.length;i++){
			arr2[i] = input_array[mid+i+1];
		}

		int i = 0, j = 0, k = low;
		while(i<arr1.length && j<arr2.length){
			if(arr1[i]<arr2[j]){
				input_array[k++] = arr1[i++];
			}
			else if (arr1[i]>=arr2[j]){
				input_array[k++] = arr2[j++];
			}
		}
	
		while(i<arr1.length){
			input_array[k++] = arr1[i++];
			
		}

		while(j<arr2.length){
			input_array[k++] = arr2[j++];
			
		}
	}


	public void mergeSort(int[] input_array, int low, int high){
		if(low<high){
			int mid = (low+high)/2;
			mergeSort(input_array,low,mid);
			mergeSort(input_array,mid+1,high);
			merge(input_array,low,mid,high);

		}

	}



	public void sort(int[] input_array){
		int low = 0;
		int high = input_array.length - 1;
		mergeSort(input_array,low,high);

	}

	public void printArray(int[] input_array){
		for(int element : input_array){
			System.out.print(element+" ");
		}
		System.out.println();
	}

	public static void main(String[] args){

		int[] input_array = {9,8,7,6,5,4,3,2,1};
		mergeSort ms = new mergeSort();
		System.out.println("Elements Before Sorting");
		ms.printArray(input_array);
		ms.sort(input_array);
		System.out.println("Elements After Sorting");
		ms.printArray(input_array);

	}


}


