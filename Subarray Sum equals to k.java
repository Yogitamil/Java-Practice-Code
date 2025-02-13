import java.util.Scanner;
public class Main {
	static int subarray(int k,int[] arr)
	{
		int ans = 0,i=0;
		int count = 0;
		while(ans<=k && ans+arr[i]<k)
		{
			ans = ans+arr[count];
			count++;
		}
		return count;
	}
	
			
	//here is an simple program to calvulate the subarray of array		
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of element in array :");
		int n =sc.nextInt();
		int[] arr = new int[n];
		int i=0;
		while(i<n)
		{
			System.out.println("Enter the values :");
			arr[i] = sc.nextInt();
			i++;
		}
		int k =5;
    	System.out.println(subarray(k,arr));
	}
}