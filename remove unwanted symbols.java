import java.util.*;
public class Main {
	public static void main(String[] args) {
		String s1 = "@ahhghs";
		//here we are using replaceAll function to remove unwanted symbols
		String s= (s1.replaceAll("[^a-zA-Z]"," "));
		System.out.println(s);
		
	}
}