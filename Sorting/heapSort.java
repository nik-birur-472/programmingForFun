public class heapSort{

	public void swapElements(int[] input_array, int first_pos, int second_pos){
		int temp = input_array[first_pos];
		input_array[first_pos] = input_array[second_pos];
		input_array[second_pos] = temp;

	}

	public int getParent(int i){
		return ((i-1)>>1);
	}

	public int getLeft(int i){
		return (((i<<1)+1));
	}

	public int getRight(int i){
		return (((i<<1)+2));
	}

	public void heapify(int[] input_array, int pos){

		int l = getLeft(pos); 
		int r = getRight(pos);
		int largest = pos;
		if(l<input_array.length && input_array[l]>input_array[pos])
			largest = l;
		if(r<input_array.length && input_array[r]>largest)
			largest = r;
		if(largest!=pos){
			swapElements(input_array,pos,largest);
			heapify(input_array,largest);
		}
	}

	public void buildMaxHeap(int[] input_array){
		int n = input_array.length/2;
		while(n>=0){
			heapify(input_array,n);
			n--;
		}

	}

	public void heapSort(int[] input_array){
		buildMaxHeap(input_array);
		for(int i = input_array.length-1 ; i>0;i--){
			swapElements(input_array,0,i);
			heapify(input_array,0);

		}

	}

	public void printArray(int[] input_array){
		for(int element : input_array){
			System.out.print(element+" ");
		}
		System.out.println();
	}

	public static void main(String[] args){

		int[] input_array = {9,8,7,6,5,4,3,2,1};
		quickSort qs = new quickSort();
		System.out.println("Elements Before Sorting");
		qs.printArray(input_array);
		qs.sort(input_array);
		System.out.println("Elements After Sorting");
		qs.printArray(input_array);

	}


}


