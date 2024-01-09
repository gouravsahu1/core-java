import java.awt.*;
import java.awt.event.*;
class FDemo extends Frame implements ActionListener
{
	FDemo()
	{
		Font f = new Font ("Times New Roman",Font.BOLD,30);
		setFont(f);
		
		setLayout(new FlowLayout());
		
		
		Button b1 = new Button ("Login");
		add(b1);
		b1.addActionListener(this);
		
	}
	public void actionPerformed(ActionEvent e)
	{
		System.out.println("button clicked and background changed");
		setBackground(Color.green);
		setBackground(Color.blue);
		setBackground(Color.yellow);
	}
}
class Demo8
{
	public static void main(String[]arg)
	{
	  FDemo f= new FDemo();
	  f.setVisible(true);
	  f.setSize(500,500);
	  f.setLocation(300,50);
	}
}
