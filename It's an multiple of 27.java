import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int num = sc.nextInt();
		if(num%27==0)
		//just taking % 27 to check it is divisible by 27 or not
		{
			System.out.println("Its is an multiple of 27");
		}
		else
		{
				System.out.println("Its is not an multiple of 27");
		}
	}
}