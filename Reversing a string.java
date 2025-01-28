import java.util.*;
public class Main {
	public static void main(String[] args) {
		String s1 = "@ahhghs";
		String s2 = "";
		//here we are just reversing the string with for loop
		for(int i=s1.length()-1;i>=0;i--)
		{
			char c = s1.charAt(i);
			s2 += c;
			
		}
		System.out.println(s2);
	 	
	}
}