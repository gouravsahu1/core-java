import java.util.Scanner;
class Factorial
{
	public static void main(String arg[])
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Factorial Number : ");
		int num = input.nextInt();
		int fact = 1;
		for(int i=1; i<=num; i++)
		{
			fact *= i;
		}        
		System.out.println("Factorial: "+ fact);
	}
}