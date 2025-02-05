import java.util.*;
public class Main {
static List<Integer> swap(int a,int b)
{
	a = a^b;
	b = a^b;
    a = a^b;
	return  Arrays.asList(a,b);
} 
	public static void main(String[] args) {
		System.out.print(swap(1,3));
		
		
	}
}