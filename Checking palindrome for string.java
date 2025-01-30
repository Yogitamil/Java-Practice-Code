
public class Main {
	public static void main(String[] args) {
	//its an simple java code for checking palindrome	
		String s = "A man, a plan, a canal: Panama";
	    String ns = s.replaceAll("[^A-za-z]", "");
	    ns = ns.toLowerCase();
	    int i = 0;
	    int j = ns.length()-1;
	    while(i<j)
	    {
	    	if(ns.charAt(i)==ns.charAt(j))
	    	{
	    		i++;
	    		j--;
	    	}
	    }
	    if(i==j)
	    {
	        System.out.print("Its is an palindrome");
	    }
	    else
	    {
	    	 System.out.print("Its is not an palindrome");
	}
	}
	
}