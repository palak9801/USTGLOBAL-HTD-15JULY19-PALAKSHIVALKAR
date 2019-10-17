public class MethodExample{
	
	public static int areaofSquare( int side)
		{  
		int a=side*side;
		System.out.println("area= "+a);
		
		  return a;
		}
		
		public static void areaofCircle(int radius)
		
		{
			double b=3.14*radius*radius;
			System.out.println("area of circle= "+b);
			
		}
		
		public static void areaofTriangle(int b, int h)
		{
			double c=0.5*b*h;
			System.out.println("area of triangle= "+c);
			
		}
		
		public static void average(int i, int j, int k)
		{
			int avg=(i+j+k)/3;
			System.out.println("Average of three numbers= "+avg);
			
		}
		
		
			
	public static void main(String []args){
		  areaofSquare(12);
		  areaofCircle(10);
		  areaofTriangle(2,4);
		  average(10,20,30);
		  
	}
	
}


		
			