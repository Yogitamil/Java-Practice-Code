import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number :");
		int num1 = sc.nextInt();
			System.out.println("Enter second number :");
		int num2 = sc.nextInt();
		int add = num1 + num2;
		int sub = num1 - num2;
		if(sub<0)//it will print only positive value even the subraction value is positive
		{
			sub = -sub;
		}
		System.out.printf("Addition : %d Subraction : %d",add,sub);
	}
}
		
