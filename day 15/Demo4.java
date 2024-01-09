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
		//g.drawOval (100,100,200,100);
		//g.drawArc (100,100,200,200,180,180);
		//g.drawRect (100,100,200,300);
		//g.fillRect (100,100,200,300);
		//g.setColor (Color.red);
		//g.fillRect (10,10,100,100);
		Color c = new Color (207,79,174);
		g.setColor (c);
		g.fillRoundRect (10,10,100,100,50,50);
		g.setColor (Color.red);
		g.fillRoundRect (150,10,100,100,50,50);
		g.fillOval(100,100,100,100);
	}
}
class Demo4
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