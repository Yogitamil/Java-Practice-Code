import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Principal :");
		int p = sc.nextInt();
		System.out.println("Enter Rate of interest :");
		int r = sc.nextInt();
		System.out.println("Enter number of terms :");
		int n = sc.nextInt();
		int ans = (p*r*n)/100; //here we are using simple intrest formula to find SI
		System.out.println(ans);
	}
}
		
		