
public class Main 
{
public String convertbit(int num)
	{
	   StringBuilder sb = new StringBuilder();
	  while(num>0)
	  {
	    if(num%2==1)
	   {
	   	sb.append("1");
	   	num = num/2;
	   }
	   else
	   {
	   	sb.append("0");
	   	num = num/2;
	   }
	   
	 }  
	    return sb.toString();
	}
		
		
public static void main(String[] args) {
	       int num = 65;
	       Main bs = new Main();
	       System.out.println(bs.convertbit(num));
	       
		
	}
}