class Demo15
{
	public static void main(String[]arg)
	{
		byte x=100;
		switch(x)
		{
			case "100":
			System.out.println("case a");
			break;
			case "1000":
			System.out.print("case b");
			break;
			default:
			System.out.println("exit");
			break;
			}
	}
}/*error:- incompatible types: string cant be converted to byte*/