import java.util.Scanner;
	public class Main {
		public static void main(String[] args) {
			int n, i, sum=0;
			Scanner sc = new Scanner(System.in);
			n = sc.nextInt();
			int[] arr = new int[n+1];

			for(i = 1; i <= n;i++) {
				if(n % i == 0) {
					arr[i] = i;
				}
			}
			System.out.println("Devisiors for "+n+" are: ");
			for(i = 1;i <= n; i++){
				if(arr[i] != 0){
					System.out.println(arr[i]+" ");
					sum = sum+arr[i];
				}
			}
			System.out.println("Sum of all divisors are: "+sum);
		}
	}