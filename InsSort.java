public class InsSort {
    public static void main(String... args) {
	System.out.println("Hello world!");
	int arr[] = {2,5,6,7,12,7,9};
    }

    public static int[] insertSort(int[] arr){
	for (int k = 1; k < arr.length; k++) {
	    int newElement = arr[k];
	    int location = k - 1;
	    while (location >= 0 && arr[location] > newElement) {
		arr[location + 1] = arr[location];
		location--;
	    }
	    arr[location + 1] = newElement;
	    System.out.print(arr[k]);
	}
	return arr;	
    }
}