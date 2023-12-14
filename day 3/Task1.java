class Demo121
{
	public static void main(String[]arg)
	{
	int p=40;
	int c=45;
	int m=40;
	int percentage = (p+c+m)/3;
	if(percentage>=90)
	{
	System.out.println("Grade is A+");}
	else if(percentage<89&&percentage>=80)
	{ 
      System.out.print("Grade is A");
	}
	else if(percentage<79&&percentage>=70)
	{
		System.out.println("Grade is B");
	}
	else if(percentage<69&&percentage>=60)
	{
		System.out.println("Grade is C");
	}
	else if(percentage<59&&percentage>=50)
	{
		System.out.println("Grade is D");
	}
	else if(percentage<50)
	{
		System.out.println("Grade is F");
	}
	}
}