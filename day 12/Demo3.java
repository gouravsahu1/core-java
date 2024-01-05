import java.io.*;
import java.util.*;
class Demo3
{
	public static void main(String[]arg)
	{
		
		
		String s1 = "my name";
		
		
		StringTokenizer st = new StringTokenizer(s1);
		
		String s2 = st.nextToken();
		String s3 = st.nextToken();
		String s4 = st.nextToken();
		
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		}
}
		