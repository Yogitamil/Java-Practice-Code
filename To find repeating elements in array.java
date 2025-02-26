import java.util.*;
public class Main {
	public static void main(String[] args) {
		int[] arr = {2,3,4,2,4,2};
		Map <Integer,Integer> mark = new HashMap<>();
		List <Integer> dup = new ArrayList<>();
		for(int num:arr)
		{
			mark.put(num,mark.getOrDefault(num,0)+1);
		}
		for(Map.Entry<Integer,Integer> entry : mark.entrySet())
		{
			if(entry.getValue()>1)
			{
				dup.add(entry.getKey());
			}
		}
	}
}