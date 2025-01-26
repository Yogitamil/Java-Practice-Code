import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an number:");
		boolean result = false;
		int year = sc.nextInt();
		if(year%4==0)
		{
			result= true;
		}
		else if(year%100==0 && year%400 ==0)
		{
			result = true;
		}
		System.out.printf("year %d is an leap year : %s",year,result);
			
	}
}