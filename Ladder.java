package jan2023;

public class Ladder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int month =Integer.parseInt(args[0]);
		if (month==12||(month>=1 && month<=2))
		{
			System.out.println("Winter season");	

	}
		else if (month>2 && month<=5)
		{
			System.out.println("summer season");
		}
		else if(month>5 && month<=8)
		{
			System.out.println("spring season");
		
		}
		else if (month>8 && month<=12)
		{
			System.out.println("spring autumn");
		}
}
}