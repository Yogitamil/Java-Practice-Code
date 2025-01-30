import java.util.Arrays;

public class Main {
public static int unique(int [] arr,int n)
{
	Arrays.sort(arr);
	for(int i = 0; i<n;i+=2)
	{
		if(arr[i]!=arr[i+1])
		{
			return arr[i];
		}
	}
	return -1;
}

public static int optiunique(int [] arr)	
{
	int result = 0;
	for(int nums : arr)
	{
		result ^= nums;
	}
	return result;
}

public static void main(String[] args) {
		int [] arr = {3,2,6,6,2};
		int n = arr.length;
		//optimized way of finding unique elements in array by using XOR gate
		System.out.println(optiunique(arr));
	    //general way of apporach using for loop
		System.out.println(unique(arr,n));
		
	}
}