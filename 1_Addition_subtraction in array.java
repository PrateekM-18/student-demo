//ADDITION-ITERARTION
public class Main {
	public static void main(String[] args) {
		
		int arr[] = {3, 5 ,64, 45, 46, 86};
		int n = 15;
		int ind = 3;
		int[] array = new int[arr.length+1];

		for(int i = 0;i < ind; i++) {
				array[i] = arr[i];
		}

		array[ind] = n;

		for(int i = ind+1;i < array.length;i++) {
			array[i] = arr[i-1];
		}
		System.out.print("The new array is: ");
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i]+" ");
		}
	}
}

public class Main {
	public static void main(String[] args) {

		int arr[] = {3, 5 ,64, 45, 46, 86, 84, 92, 72};
		int ind = 4;
		int[] array = new int[arr.length-1];

		for(int i = 0; i < ind; i ++) {
			array[i] = arr[i];
		}

		for(int i = ind;i < array.length;i++){
			array[i-1] = arr[];
		}
	}
}

