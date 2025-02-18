public class Main {
	public static void main(String[] args) {
		int[] arra = {1,2,3,4,5,6,7,8,9};
		int[] arrb = new int[arra.length];
		for(int i=0;i<arra.length;i++)
		{
			arrb[i] = arra[i]*2;
		}
	   for(int i=0;i<arra.length;i++)
	   {
		System.out.printf("%d ",arrb[i]);
	   }
	}
}