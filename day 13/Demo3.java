import java.io.*;
import java.util.*;
class Demo3
{
	public static void main(String[]arg)throws IOException
	{
		Scanner sc = new Scanner (System.in);
		
		System.out.println("enter 2 no.");
		String s1 = sc.next();
		String s2 = sc.next();
		
		int n1 = Integer.parseInt(s1);
		int n2 = Integer.parseInt(s2);
		int sum = n1+n2;
		
		System.out.println(sum);
		}
}