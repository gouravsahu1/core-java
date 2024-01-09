import java.awt.Frame;
import java.awt.Color;
import java.awt.Graphics;
class FDemo extends Frame
{
	FDemo()
	{
		
	}
	public void paint (Graphics g)
	{
		g.drawString ("Jai Shree Ram",200,200);
	}
}
class Demo2
{
	public static void main(String[]arg)
	{
		FDemo f=new FDemo();
		f.setVisible(true);
		f.setSize(500,500);
		f.setLocation(500,300);
		f.setBackground(Color.black);
		f.setForeground(Color.white);
	}
}