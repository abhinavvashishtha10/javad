package jan2023;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int month =Integer.parseInt(args[0]);
	String season="";
		
		switch(month)
		{
		
		case 1:
			season="winter";
		case 2:
			season="winter";
		case 3:
			season="summer";
		case 4:
			season="summer";
		case 5:
			season="summwe";
		case 6:
			season="spring";
		case 7:
			season="spring";
		case 8:
			season="spring";
		case 9:
			season="autumn";
		case10:
			season="autumn";
			default:
				System.out.println("invalid month");
			System.out.println("season is: "+ season);
		}
			

	}

}
