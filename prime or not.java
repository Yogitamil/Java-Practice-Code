import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter N");
		int n = sc.nextInt();
		if(n==1 || n==2 || n==3)
		{
			System.out.println("prime");
		}
		int a = n*n;
		a = a-1;
		a = a%24; 
		if(a==0)
		{
			System.out.println("prime");
		}
		else
		{
			System.out.println("not a prime ");
		}
	}
}