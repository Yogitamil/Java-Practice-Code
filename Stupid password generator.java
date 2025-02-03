import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number n: ");
		int n = sc.nextInt();
		System.out.println("Enter number l: ");
		int l = sc.nextInt();
		for(int d1 =1;d1<=n;d1++){
			for(int d2=1;d2<=n;d2++){
				for(char c1 = 'a';c1<'a'+l;c1++){
					for(char c2='a';c2<'a'+l;c2++){
						for(int d3=1;d3<=n;d3++){
							if(d3>Math.max(d1,d2)){
								System.out.printf("%d%d%s%s%d ",d1,d2,c1,c2,d3);
							}
						}
					}
				}
							
			}
		}
			
		
	}
}