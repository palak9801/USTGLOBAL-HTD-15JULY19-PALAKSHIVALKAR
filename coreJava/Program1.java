public class Program1{
	public static void main(String []args){
		int day=6;
		String name ="palak";
		switch(day){
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
		          System.out.println("Weekdays");
				  System.out.println(name);
				  break;
		case 6:
		case 7:
		           System.out.println("Weekends");
				   for(int i=1;i<=5;i++)
				   {
					   System.out.println(name);
				   }
				   break;
		default:System.out.println("invalid day");
	}
	}
}
	