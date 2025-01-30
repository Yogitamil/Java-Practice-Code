import java.util.Scanner;
public class Main {
public static void bselection(int arr[],int n){
		for(int i=0;i<n-1;i++)
		{
			for(int j=i+1;j<n-1;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i]=temp;
				}
			}
		}
}
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
        bselection(arr,n);
		System.out.println("After swapping the elements : ");
		for(int i=0; i<n;i++)
		{
			System.out.print(arr[i]);
		}
		
		
	}
}