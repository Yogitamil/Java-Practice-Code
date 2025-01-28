import java.util.*;
public class Main {
	public static void main(String[] args) {
		String s1 = "@ahhghs";
		for(int i=0;i<s1.length();i++)
		{
			for(int j=i+1;j<s1.length();j++)
			{
	           	String s= (s1.substring(i,j));
	           	System.out.println(s);
			}
		}
		
	 	
	}
}