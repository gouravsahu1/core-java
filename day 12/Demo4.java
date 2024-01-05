import java.io.*;
import java.util.*;
class Demo4
{
	public static void main(String[]arg)throws IOException
	{
		InputStreamReader i = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(i);
		
		System.out.println("enter two no.s");
	
	    int x = br.read();
		int y = br.read();
		
		System.out.println("sum="+(x+y));
		
		}
}
		