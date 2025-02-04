
public class Main 
{
public int convertdecimal(String num)
	{
	   int sum= 0;
	   int sq =1;
	   for(int i = num.length()-1;i>=0;i--)
	   {
	   	char c = num.charAt(i);
	   	if(c=='1')
	   	{
	   		sum += sq; 
	   	}
	   	sq *=2;
	   }
	   return sum;
    }	
	//here i am converting the binary value to decimal value 	
public static void main(String[] args) {
	       String num = "1000001";
	       Main bs = new Main();
	       System.out.println(bs.convertdecimal(num));
	       
		
	}
}