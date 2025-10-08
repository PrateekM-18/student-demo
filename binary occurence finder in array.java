public class Main {
	public static int firstOccurence(int[] arr, int target) {
		int left = 0, right = arr.length - 1, result = -1;

		while(left <= right) {
			int mid = (left + right)/2;

			if(arr[mid] == target) {
				result = mid;
				right = mid - 1;
			}
			else if(arr[mid] > target) {
				right = mid - 1;
			}
			else {
				left = mid + 1;
			}
		}
		return result;
	}
	public static int lastOccurence(int[] arr, int target) {
		int left = 0, right = arr.length-1, result = -1;

		while(left <= right) {
			int mid = (left+right)/2;

			if(arr[mid] == target) {
				result = mid;
				left = mid + 1;
			}
			else if(target < arr[mid]) {
				right = mid - 1;
			}
			else {
				left = mid + 1;
			}
		}
		return result;
	}
	public static void main(String[] args) {

		int[] arr =  {1,1,2,2,2,2,3,3,4,4,4,5,5,6,6,6,7,7,7};
		int target = 2;

		int first = firstOccurence(arr, target);
		int last = lastOccurence(arr, target);

		if(first != -1 && last != -1) {
			System.out.println("First occurence at index: "+first);
			System.out.println("Last occurence at index: "+last);
		}
		else {
			System.out.println("Element not found in array.");
		}
	}
}