import java.io.*;
class Demo7
{
	public static void main(String[]arg)throws IOException
	{
		InputStreamReader i=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(i);
		
		System.out.println("enter any sentence");
		String x= br.readLine();
		System.out.println("Sentence is ="+x);
	}
}
     