//ITERATION
public class Main {
	public static void main(String[] args) {

		int n = 100000, a =  0, b = 1;

		while(a <= n) {
			System.out.print(a+" ");
			int next = a + b;
			a = b;
			b = next;
		}		
	}
}

//RECURSION
public class Main{
	public static int fibonacci(int n) {

		if(n == 0) return 0;
		else if(n == 1) return 1;
		return fibonacci(n-1) + fibonacci(n-2);
	}
	public static void main(String[] args) {
		
		int i = 0, fib, n = 500;

		while(true) {
			fib = fibonacci(i);
			if(fib > n) break;
			System.out.print(fib+" ");
			i++;
		}
	}
}