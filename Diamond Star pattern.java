public class Main {
	public static void main(String[] args) {
		int n = 5;
		Thread W = new Thread ( ()->{for(int i =0;i<n;i++)
		{ 
			for(int j=0;j<i+1;j++)
			{
				  System.out.print("*");
			}
			System.out.println("");
		}});
		Thread T = new Thread ( ()->{for(int i=n;i>0;i--)
		{ 
			for(int j=0;j<i;j++)
			{
				  System.out.print("*");
			}
			System.out.println("");
		} } );
	try{
		W.start();
		W.join();
		T.start();
	}
	catch(InterruptedException e){
		e.printStackTrace();
	}
	}
}