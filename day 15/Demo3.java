import java.awt.*;

class FDemo extends Frame
{
	FDemo()
	{
		Font f=new Font("Times New Roman",Font.BOLD,30);
		setFont(f);
	}
	public void paint (Graphics g)
	{
		g.drawString ("Jai Shree Ram",100,200);
	}
}
class Demo3
{
	public static void main(String[]arg)
	{
		FDemo f=new FDemo();
		f.setVisible(true);
		f.setSize(500,500);
		f.setLocation(500,300);
		f.setBackground(Color.green);
		f.setForeground(Color.white);
	}
}