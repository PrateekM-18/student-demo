public class Main {
	public static void numbers(int n) {

		if(n == 0) return ;

		numbers(n-1);
		System.out.print(n);

	}
	public static void main(String[] args) {
		
		int n = 10;
		System.out.println("Numbers from 1 to " + n + ":");
        	numbers(n);
	}
}