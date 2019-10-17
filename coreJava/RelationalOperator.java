public class RelationalOperator{
public static void main(String []args){
     int a=10, b=20;
	 
	 boolean r;
	 System.out.println("a="+a);
	 System.out.println("b="+b);
	 r= a==b;
	 System.out.println("a==b--"+r);
	 
	 r= a!=b;
	 System.out.println("a!= b--"+r);
	 
	 r= a<b;
	 System.out.println("a<b--"+r);
	 
	 r= a>b;
	 System.out.println("a>b--"+r);
	 
	 r= a>=b;
	 System.out.println("a>=b--"+r);
	 
	 r= a<=b;
	 System.out.println("a<=b--"+r);
	 
	 
	 
	 int c=66;
	 char d='A';   //ASCII value for 'A' is 65	
	 
	 r=c<d;
	 System.out.println("c<d--"+r);
	 
	 char e='w';
	 char f='t';
	 r=e>f;
	 System.out.println("e>f--"+r);
}
}

	 