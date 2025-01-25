import java.util.Random;
public class Main {
	public static void main(String[] args) {
		Random rand = new Random();
		int a = rand.nextInt(10);
		int b = rand.nextInt(20);
		int c = a+ b; //we are just generating two random numbers and adding it.
		System.out.println(+c);
		
	}
}