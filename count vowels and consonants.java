import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an string :");
		String word = sc.next();
		word = word.toLowerCase();
		int v  = 0;
		int oo = 0;
		int o = 0;
		for(int i=0;i<word.length();i++)
		{
			char c = word.charAt(i);
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
			{
				v++;
			}
			if(!(c>='a' && c<='z'))
			{
				o++;
			}
			else
			{
		    	oo++;
			}
			
		}
		System.out.printf("vowel : %d consonets : %d other char: %d", v ,oo,o);
	}
}