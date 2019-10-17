public class Pattern5{
	public static void main(String []args){
		int k=1;
		int a=65;
		for(int i=1;i<=3;i++)
		{   for(int l=3;l>=i;l--)
			{
				System.out.print(" ");
			}
			
			for( int j=1;j<=k;j++)
			{     
				System.out.print((char)a);
				a++;
					
			}
			
			System.out.println();
			k=k+2;
			       
		}
		int p=3;
		int b=1;
		for(int m=2;m>=1;m--)
		{  
              for(int n=3;n>=m;n--)
			{
				System.out.print(" ");
			}	
			
			for( int o=1;o<=p;o++)
			{     
				System.out.print(+b);
				b++;
					
			}
			
			System.out.println();
			p=p-2;
			       
		}
	}
}