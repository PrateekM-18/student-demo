// public class Main {
// 	public static void main(String[] args) {
// 		int sum = 0;
// 		int n = 34;

// 		for(int i= 1; i <= n; i++) {
// 			sum = sum + i;
// 		}

// 		System.out.print("The sum of number is: "+sum);
// 	}
// }

class Main{
	public static int sum(int n) {
		if(n == 0) return 0;
		else if (n == 1) return 1;
		return n + sum(n-1);
	}

	public static void main(String[] args) {
		int n = 34;
		int result = sum(n);
		System.out.print("The sum of number is: "+result);
	}
}