import java.util.Arrays;
public class Main {
	public static void main(String[] args) {
		String s = "Ajith kumar";
		String[] sp =s.split(" ");
		int ssize = sp.length;
		String[] ns = new String[ssize];
		for(int i =0;i<=ssize-1;i++)
		{
			
			ns[i] = String.valueOf(sp[i].charAt(0));
		}
		System.out.print(Arrays.toString(ns));
	}
}