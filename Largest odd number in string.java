import java.util.*;
public class Main {
	public static void main(String[] args) {
		String nums = "732";
		String ans = "";
		int num = Integer.parseInt(nums);
		if(num%2 !=0)
		{
			System.out.println(nums);
		}
		else if(num%2==0)
		{
			while(num>0)
			{
				int temp = num%10;
				if(temp%2!=0)
				{
					
					ans = Integer.toString(num);
					System.out.print(ans);
					break;
				}
				else
				{
				    num = num/10;
				}
			}
		}
	
	}
}