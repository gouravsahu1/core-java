import java.io.*;
import java.util.*;
class Demo5
{
	public static void main(String[]arg)throws IOException
	{
		Scanner sc = new Scanner (System.in);
		
		System.out.println("enter 2 no.");
		
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		
		int sum = n1+n2;
		
		System.out.println("sum="+sum);
		}
}
/*exception:-
enter 2 no.
10 ram
Exception in thread "main" java.util.InputMismatchException*/