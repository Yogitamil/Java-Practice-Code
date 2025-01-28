import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the weight of cloths :");
		int weight = sc.nextInt();
		if(0<=2000)
		{
			System.out.println("The machine consumes low level water and runs for 25 mins");
		}
		else if(2001<=4000)
		{
			System.out.println("The machine consumes medium level water and runs for 35 mins");
		}
		else if(4000<7000)
		{
				System.out.println("The machine consumes high level water and runs for 45 mins");
		}
		else{
			System.out.println("Enter valid input");
		}
	}
}