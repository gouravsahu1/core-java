import java.io.*;
import java.util.*;
class Demo2
{
	public static void main(String[]arg)throws IOException
	{
		InputStreamReader i = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(i);
		
		System.out.println("Enter two numbers");
		String s1 = br.readLine();
		System.out.println(s1);
		
		StringTokenizer st = new StringTokenizer(s1);
		
		String s2 = st.nextToken();
		String s3 = st.nextToken();
		
		int n1 = Integer.parseInt(s2);
		int n2 = Integer.parseInt(s3);
		
		int sum=n1+n2;
		System.out.println("sum="+sum);
		}
}
		