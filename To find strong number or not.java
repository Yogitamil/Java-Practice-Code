public class Main {
static int fact(int n)
//to calculate factorial of number
{
	if(n==1||n==0)
	{
		return 1;
	}
	return n*fact(n-1);
}
	public static void main(String[] args) {
		int i = 145;
		int j = i;
		int sum = 0;
		while(i>0)
		{
		    int temp = i%10;
		    sum += fact(temp); //to add factorial of numbers
		    i=i/10;
		}
		if(sum==j)
		{
			System.out.println(true);
		}
		else
		{
			System.out.println(false);
		}
	}
}