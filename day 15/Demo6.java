import java.awt.*;
class FDemo extends Frame
{
	FDemo()
	{
		Font f = new Font ("Times New Roman",Font.BOLD,30);
		setFont(f);
		
		FlowLayout f1 = new FlowLayout();
		setLayout(f1);
		
		TextField tx1 = new TextField(10);
		add(tx1);
		
		Button b1 = new Button ("Click!!!");
		add(b1);
	}
}
class Demo6
{
	public static void main(String[]arg)
	{
	  FDemo f= new FDemo();
	  f.setVisible(true);
	  f.setSize(500,500);
	  f.setLocation(300,50);
	}
}
