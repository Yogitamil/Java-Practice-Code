import java.util.*;
public class Main {
	public static void main(String[] args) {
		int[] arra = { 1,10,10,2};
		int[] arrb = new int[arra.length];
		int j =0;
		for(int i =0;i<arra.length;i++)
		{
			if(arra[i]!=10)
			{
			arrb[j] = arra[i];
			j++;
			}
		}
		
		for(int i=0;i<arra.length;i++)
	   {
		System.out.printf("%d ",arrb[i]);
	   }
		
	}
}