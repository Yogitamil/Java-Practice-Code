public class Main {
	public static void main(String[] args) {
		int n = 7;
		for(int i=0;i<=n;i++)
		{
			for(int a=0;a<=i;a++)
			{
				System.out.print(" ");
			}
			for(int j=n;j>=i;j--)
			{
				System.out.print(" *");
			}
			System.out.println("");
		}
	}
}