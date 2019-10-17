public class Pattern2{
	public static void main(String []args){
		
		for(int i=1;i<=4;i++)
		{    		int n=i;
			for(int j=1;j<=i;j++)
			{
				System.out.print(n);
				n=n+4-j;
			}
			System.out.println();
		}
	}
}
