import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean pal = true;
		while(pal)
		{
			System.out.println("Enter your option :");
			System.out.println("1.Addition \n 2.Subraction \n 3. multiply \n 4.Exit");
			int op = sc.nextInt();
			switch(op)
			{
				case 1:
						System.out.println("Enter number 1 :");
	                	int a = sc.nextInt();
		                System.out.println("Enter number 2 :");
		                int b = sc.nextInt();
		                int c = a+b;
		                System.out.println( c);
		        case 2:
						System.out.println("Enter number 1 :");
	                	int x= sc.nextInt();
		                System.out.println("Enter number 2 :");
		                int y= sc.nextInt();
		                int z = x-y;
		                System.out.println( z);
		         case 3:
						System.out.println("Enter number 1 :");
	                	int e = sc.nextInt();
		                System.out.println("Enter number 2 :");
		                int f= sc.nextInt();
		                int g= e*f;
		                System.out.println(g);
		          case 4:
		                 pal = false;
		          default:
		                 System.out.println("Invaid Input!");
			}
		}
			
		                
		                      
			
	}
}