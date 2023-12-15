class Demo16
{
	public static void main(String[]arg)
	{
		boolean b=true;
		switch(b)
		{
			case true:
			System.out.println("case a");
			break;
			case false:
			System.out.print("case b");
			break;
			default:
			System.out.println("exit");
			break;
			}
	}
}/*error:- incompatible types: boolean cant be converted to int*/