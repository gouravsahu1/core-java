import java.io.*;
import java.util.*;
class Demo5
{
	public static void main(String[]arg)throws IOException
	{
		InputStreamReader i = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(i);
		
		System.out.println("enter two no.s");
		String s1=br.readLine();
		
		StringTokenizer st = new StringTokenizer(s1," ,");
		StringTokenizer st1 = new StringTokenizer(s1,",");

        String s2 = st.nextToken();
        String s3 = st.nextToken();		
	    int x = Integer.parseInt(s2);
		int y = Integer.parseInt(s3);
		
		System.out.println("sum="+(x+y));
		
		}
}
		