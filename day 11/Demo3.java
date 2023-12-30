import java.io.InputStreamReader;
import java.io.BufferedReader;
class Demo3
{
	public static void main(String[]arg)
	{
		InputStreamReader i=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(i);
		
		System.out.println("enter any character");
		int x=br.read();
		System.out.println("character is ="+x);
	}
}
//error:-unreported exception IOException; must be caught or declared to be thrown
                
