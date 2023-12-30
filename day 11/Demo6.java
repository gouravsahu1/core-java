import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
class Demo6
{
	public static void main(String[]arg)throws IOException
	{
		InputStreamReader i=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(i);
		
		System.out.println("enter any character");
		char x=(char)br.read();
		System.out.println("character is ="+x);
	}
}
     /*error: incompatible types: possible lossy conversion from int to char
                char x=br.read();*/            
