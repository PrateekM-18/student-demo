public class Main {
	public static void main(String[] args) {

		int arr[] = {3,54,6,26,6,7,3,69,25};
		int max = arr[0];
		int min = arr[0];

		for(int i = 0; i < arr.length; i++) {

			if(arr[i] > max) {	//Largest Element
				max = arr[i];	//Smallest Element
			}

			if(arr[i] < min) {
				min = arr[i];
			}
		}

		System.out.println("Largest element is: "+max);
		System.out.println("Smallest element is: "+min);
	}
}