import java.util.ArrayList;
public class Main {
	public static void main(String[] args) {
		 int[] arr ={16, 17, 4, 3, 5, 2};
		 ArrayList<Integer> lp = new ArrayList<>();
		 for(int i=0;i<arr.length-1;i++)
		 { 
		 boolean flag = true;
		 int first = arr[i];
		 {
		 	for(int j=i+1;j<arr.length;j++)
		 	{
		 		if(first<arr[j])
		 		{
		 			flag = false;
		 			break;
		 		}
		 	}
		 	if(flag == true)
		 	{
		 		lp.add(first);
		 	}
		 }
		
		 
	}
	 lp.add(arr[arr.length-1]);
	 System.out.println(lp);
	}
}