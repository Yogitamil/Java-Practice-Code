import java.util.*;
class Main
{
public static void main(String []args)
	{
		int i =153;
		int a =153;
		int sum =0;
		while(i>0)
		{
			int temp = i%10;
			sum += temp*temp*temp;/*its is an simple logic to find armstrong number or not*/
			i = i/10;
		}
		if(a==sum)
		{
		System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
}
}