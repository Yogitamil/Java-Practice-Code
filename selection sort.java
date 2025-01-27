import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number of elements in array :");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println(" enter the  elements in array : ");
		for(int i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		// here we have just implemented the selection sort algorithm
		for(int i=0;i<n;i++)
		{
			int min = i;
			for(int j=i+1;j<n;j++)
			{
				if(arr[i]>arr[j])
				{
					min = j;
				}
			}
			int temp = arr[min];
			arr[min] = arr[i];
		    arr[i] = temp;
		}
		System.out.println("After swapping the elements : ");
		for(int i=0; i<n;i++)
		{
			System.out.print(arr[i]);
		}
		
		
	}
}