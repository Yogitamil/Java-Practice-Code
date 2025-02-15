import java.util.*;
public class Main {
	public static void main(String[] args) {
		int[] a = {1, 2, 3, 4};
        int[] b = {3, 4, 5, 6};
        HashSet<Integer> unique = new HashSet<>();
        ArrayList<Integer> answer = new ArrayList<>();
        for(int i =0;i<a.length;i++)
        {
        	unique.add(a[i]);
        	unique.add(b[i]);
        }
        answer.addAll(unique);
        Collections.sort(answer);
        System.out.print(answer);
	}
}