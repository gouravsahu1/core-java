import java.io.*;
import java.util.*;
class Demo7
{
	public static void main(String[]arg)throws IOException
	{
		InputStreamReader i = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(i);
		
		System.out.println("enter no.");
		String s1=br.readLine();
		
		StringTokenizer st = new StringTokenizer(s1," ,");
		
     
        int n= st.countTokens();
		int a=0;
		for(int b=1;b<=n;b++)
		{
        String s2 = st.nextToken();
        int x= Integer.parseInt(s2);
		a=a+x;
		}
 
        System.out.println("sum="+a);
		
	    
		
		
		}
}
		