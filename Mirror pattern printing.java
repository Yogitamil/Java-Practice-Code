public class Main {
	public static void main(String[] args) {
		int n=7;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n-i;j++)
			{
				System.out.print(" ");
			}
			for(int a=1;a<=i;a++)
			{
				System.out.print(" *");
			}
			System.out.println("");
		} 
		for(int i=n;i>=1;i--)
			{
				for(int j=1;j<=n-i;j++)
				{
					System.out.print(" ");
				}
				for(int a=1;a<=i;a++)
				{
					System.out.print(" *");
				}
				System.out.println("");
			}

	 
	}
}