import java.io.*;
class Demo8
{
	public static void main(String[]arg)throws IOException
	{
		InputStreamReader i=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(i);
		
		System.out.println("enter name");
		String name = br.readLine();
		
		System.out.println("enter address");
		String add = br.readLine();
		
		System.out.println("enter gender");
		char g = (char)br.read();
		
		System.out.println("Name="+name);
		System.out.println("Add="+add);
		System.out.println("Gender="+g);
	}
}
     