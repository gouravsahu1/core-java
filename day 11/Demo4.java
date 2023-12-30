import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
class Demo4
{
	public static void main(String[]arg)throws IOException
	{
		InputStreamReader i=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(i);
		
		System.out.println("enter any character");
		int x=br.read();
		System.out.println("character is ="+x);
	}
}
                
