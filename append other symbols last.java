import java.util.*;
public class Main {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		String s1 = "_ahhghs";
		//here we are using replaceAll function to remove unwanted symbols
		String s= (s1.replaceAll("[^a-zA-Z]"," "));
		sb.append(s);
		for(int i = s.length()-1;i<s1.length();i++)
		{
			sb.append("_");
		}
		System.out.println(sb);
	}
}