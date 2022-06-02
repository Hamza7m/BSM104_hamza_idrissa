
public class InsertionSort {

	void insertionSort(int[] array) {
		for(int i = 0 ; i<array.length ; i++) {
			int key = array[i];
			int j = i - 1 ; 
			while (j >= 0 && array[j] > key) {
				array[j + 1] = array[j];
				j-- ; 
			}
			array[j + 1 ] = key ; 
		}
		
	}
	void printArray(int[] array) {
		for(int i =0 ; i<array.length ; i++) {
			System.out.print(array[i]+ " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int[] array = {234,53,42,45,3,2,-1,-10 } ; 
     InsertionSort ob = new InsertionSort();
     ob.insertionSort(array);
     ob.printArray(array);
	}

}
