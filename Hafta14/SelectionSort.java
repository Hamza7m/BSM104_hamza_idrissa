
public class SelectionSort {
void sort(int array[]) {
	for(int index = 0 ; index < array.length ; index++ ) {
		int min_index = index ;
		for(int j = index + 1 ; j < array.length-1 ; j++) {
			if(array[j] < array[min_index]) {
				min_index = j ; 
			}
		}
		int tmp = array[min_index];
		array[min_index] = array[index];
		array[index] = tmp ; 
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
    int[] array = {15,12,14,20,30,5}; 
    SelectionSort ob = new SelectionSort();
    ob.sort(array);
    System.out.println("sirali dizi : ");
    ob.printArray(array);
	}

}