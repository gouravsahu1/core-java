import java.io.*;
import java.util.*;
class Demo4
{
	public static void main(String[]arg)throws IOException
	{
		Scanner sc = new Scanner (System.in);
		
		System.out.println("enter 2 no.");
		int s1 = sc.next();
		int s2 = sc.next();
		
		int n1 = Integer.parseInt(s1);
		int n2 = Integer.parseInt(s2);
		int sum = n1+n2;
		
		System.out.println(sum);
		}
}
/*error:- incompatible types: String cannot be converted to int*/