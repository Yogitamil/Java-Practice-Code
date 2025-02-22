public class Main {
	public static void main(String[] args) {
		int v = 200;
		int w = 540;
		if(w<2||w%2!=0||w<=v)
		{
			System.out.println("Invalid Input");
			return;
		}
		int fw = (w-2*v)/2;
		System.out.printf("Four wheelers : %d",fw);
		System.out.printf("%nTwo wheelers : %d",v-fw);
	}
}