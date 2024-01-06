import java.io.*;
import java.util.*;
class Demo1
{
	public static void main(String[]arg)throws IOException
	{
		InputStreamReader i=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(i);
		
		System.out.println("enter no.");
		String s1 = br.readLine();
		
		StringTokenizer st = new StringTokenizer(s1);
		
		System.out.println(st.hasMoreTokens());
		int sum = 0;
		while(st.hasMoreTokens())
		{
			String s2 = st.nextToken();
			int x = Integer.parseInt(s2);
			sum+=x;
		}
		System.out.println(sum);
		System.out.println(st.hasMoreTokens());
	}
}