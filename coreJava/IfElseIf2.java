public class IfElseIf2{
	public static void main(String []args)
	{
		int marks=141;
		if(marks>100)
		{
			System.out.println("Enter valid marks");
		}
		 else if(marks<=100 && marks>=91)
		{
			System.out.println("For "+marks +" marks " +"Grade = A");
		}
		else if(marks<=90 && marks>=81)
		{0 
			System.out.println("For "+marks +" marks " +"Grade = B");
		}
		else if(marks<=80 && marks>=71)
		{
			System.out.println("For "+marks +" marks " +"Grade = C");
		}
		else if(marks<=70 && marks>=61)
		{
			System.out.println("For "+marks +" marks " +"Grade = D");
		}
		else if(marks<=60 && marks>=51)
		{
			System.out.println("For "+marks +" marks " +"Grade = E");
		}
		else if(marks<=50 && marks>=41)
		{
			System.out.println("For "+marks +" marks " +"Give RETEST");
		}
		else{
			System.out.println("For "+marks +" marks " +" YOU ARE FAIL");
		}
	}
}
