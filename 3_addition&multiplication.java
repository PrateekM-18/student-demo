public class Main {
	public static void main(String[] args) {

		int arr[] = {3,54,6,26,6,7,3,69,25};
		int array[] = {6,35,72,3,5,6,2,49,7};
		int[] ar = new int[arr.length];

		for(int i = 0; i < arr.length; i++) {	//Multiplication
				ar[i] = arr[i] * array[i];
		}

		for(int i = 0; i < arr.length; i++) {	//Addition
				ar[i] = arr[i] + array[i];
		}

		System.out.print("New array is: ");
		for(int i = 0; i < ar.length; i++) {
			System.out.print(ar[i]+" ");
		}
	}
}