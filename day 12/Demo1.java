import java.io.*;
import java.util.*;
class Demo1
{
	public static void main(String[]arg)throws IOException
	{
		InputStreamReader i=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(i);
		
		System.out.println("Enter names");
		String s1=br.readLine();
		System.out.println(s1);
		
		StringTokenizer st=new StringTokenizer(s1);
		
		String s2=st.nextToken();
		System.out.println(s2);
		
		String s3=st.nextToken();
		System.out.println(s3);
		
		String s4=st.nextToken();
		System.out.println(s4);
	}
}
		