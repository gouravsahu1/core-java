import java.io.*;
class Demo9
{
	public static void main(String[]arg)throws IOException
	{
		InputStreamReader i=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(i);
		
		System.out.println("enter no.1");
		String n1 = br.readLine();
		int x=Integer.parseInt(n1);
		
		System.out.println("enter no.2");
		String n2 = br.readLine();
		int y=Integer.parseInt(n2);
		
		int Sum=x+y;
		System.out.println("Sum="+Sum);
		}
}
     