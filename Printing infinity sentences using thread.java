public class Main {
	public static void main(String[] args) {
		Thread wt = new Thread( ()-> {while (true)
		{
			System.out.println("Its been a while");
		}
		});
		
		Thread wf = new Thread( ()-> {for (; ;)
		{
			System.out.println("Its been so for");
		}
		});
		wt.start();
		wf.start();
	}
}