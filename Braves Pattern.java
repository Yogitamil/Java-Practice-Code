public class Main {
	public static void main(String[] args) {
		int n=3;
		for(int i =0;i<=n;i++)
		{
			for(int j=0;j<=i;j++)
			{
				for(int a=0;a<=j;a++)
				{
					System.out.print("{");
				}
				for(int b=0;b<=j;b++)
				{
					System.out.print("}");
				}
			}
			System.out.println("");
		}
	}
}