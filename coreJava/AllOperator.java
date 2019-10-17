public class AllOperator{
public static void main(String []args){

    int a=50, b=40;
	System.out.println("a="+a);
	System.out.println("b="+b);
	
	a++;
	
	int c=a%b;
	System.out.println("b%a--"+c);
	 
	
	--c;
	
	boolean r=c>=10;
    
    System.out.println("c >= b--"+r);

    boolean res = r&&(b<=a);
	System.out.println("result--"+res);
}
}

   	
	