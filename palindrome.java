public class Main {
	public static void main(String[] args) {
		String s1 ="madam";
		int i=0;
		int j=s1.length()-1;
		boolean pal = true;
		while(i<=j)
		{
			if(s1.charAt(i)!=s1.charAt(j))
			{
			     pal = false;
			     break;
			}
			i++;
			j--;
		}
		if(pal)
		{
		     System.out.println("Its  an palindrome");
		}
		else
		{
		     System.out.println("Its not an palindrome");
		}
	}
}