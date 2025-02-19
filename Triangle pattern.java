public class Main {
	public static void main(String[] args) {
		int n = 7;
		for(int i = 0; i<=n;i++)
		{
			for(int j =0;j<=n-i;j++)
			{
				System.out.print(" ");
			}
			for(int a=0;a<=i;a++)
			{
				System.out.print("* ");
			}
			System.out.println("");
		}
			
	}
}