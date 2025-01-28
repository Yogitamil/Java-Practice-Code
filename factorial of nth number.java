public class Main {
	public static int fib(int n)
		{
			if(n<=1)
			{
				return n;
			}
			// here we are using recursion method for finding factorial of the nth term
			return n * fib(n-1);
		}
public static void main(String[] args) {
		int n=6;
		int result = fib(n);
		System.out.println(result);
	}
}