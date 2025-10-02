//ITERATION
public class Main {
	public static void main(String[] args) {

		int n = 5, i, fact = 1;

		for(i = n; i > 0; i--) {
			fact = fact * i;
		}

		System.out.println("Factorial of "+n+" is: "+fact);
	}
}