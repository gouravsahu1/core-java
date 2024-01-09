import java.awt.*;
class FDemo extends Frame
{
	FDemo()
	{
		Font f = new Font ("Times New Roman",Font.BOLD,30);
		setFont(f);
		
		setLayout(null);
		
		Label un = new Label ("enter user name:");
		un.setSize(300,50);
		un.setLocation(100,100);
		add(un);
		
		TextField tx1 = new TextField();
		tx1.setSize(300,50);
		tx1.setLocation(400,50);
		add(tx1);
		
		Label up = new Label ("enter password:");
		un.setSize(300,50);
		un.setLocation(50,130);
		add(up);
		
		TextField tx2 = new TextField();
		tx2.setSize(300,50);
		tx2.setLocation(400,130);
		add(tx2);
		
		Button b1 = new Button ("Login");
		b1.setSize(100,40);
		b1.setLocation(300,210);
		add(b1);
		
	}
}
class Demo7
{
	public static void main(String[]arg)
	{
	  FDemo f= new FDemo();
	  f.setVisible(true);
	  f.setSize(500,500);
	  f.setLocation(300,50);
	}
}
