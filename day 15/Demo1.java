import java.awt.Frame;
class FDemo extends Frame
{
	FDemo()
	{
		
	}
}
class Demo1
{
	public static void main(String[]arg)
	{
		FDemo f=new FDemo();
		f.setVisible(true);
		f.setSize(500,500);
		f.setLocation(500,300);
	}
}