public class Main {
	public static void main(String[] args) {
		String s1 = "2001-07-18";
		String [] str = s1.split("-");
		boolean leapyear = false;
		int year = Integer.parseInt(str[0]);
		int month = Integer.parseInt(str[1]);
		int day = Integer.parseInt(str[2]);
		if(year%4==0 &&  year%100==0 || year%400==0)
		{
			leapyear = true;
		}
		int [] daycount = {31,28,31,30,31,30,31,31,30,31,30,31};
		if(leapyear)
		{
			daycount[1] =29;
		}
		int Tdays = 0;
		for(int i=0;i<month-1;i++)
		{
			Tdays += daycount[i];
		}
		Tdays += day;
		System.out.println(Tdays);
	}
}