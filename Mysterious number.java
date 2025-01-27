import java.util.Random;
public class Main {
	public static void main(String[] args) {
		Random rand = new Random();
		int a = rand.nextInt(10);
		int b = rand.nextInt(20);
		if(a>b)
		{
			System.out.println("The mysterious number is : "+a);
		}
		else 
		{
			System.out.println("The mysterious number is :"+b);
		}
	}
}