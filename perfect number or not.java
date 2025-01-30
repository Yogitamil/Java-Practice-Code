public class Main {
	public static void main(String[] args) {
		int perfect = 6;
		if( perfect == 1)
		{
		     System.out.println("It is an perfect number");
		}
		int sum = 1;
		for(int i = 2; i<perfect;i++)
		{
			if(perfect%i==0)
			{
				sum = sum+i;
			}
		}
	   if(sum == perfect)
	   {
	   	System.out.println("It is an perfect number");
	   }
	   else
	   {
	   	System.out.println("It is not an prefect number");
	   }
	}
}