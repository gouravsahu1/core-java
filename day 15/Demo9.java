import java.awt.*;
import java.awt.event.*;
class FDemo extends Frame implements ActionListener
{
	Button b1,b2,b3;
	FDemo()
	{
		Font f = new Font ("Times New Roman",Font.BOLD,30);
		setFont(f);
		
		setLayout(new FlowLayout());
		
		
		b1 = new Button ("Red");
		add(b1);
		b1.addActionListener(this);
		
		b2 = new Button ("Blue");
		add(b2);
		b2.addActionListener(this);
		
		b3 = new Button ("Green");
		add(b3);
		b3.addActionListener(this);
		
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)          setBackground(Color.red);
		
		if(e.getSource()==b2)          setBackground(Color.blue);

        if(e.getSource()==b3)		   setBackground(Color.green);
	}
}
class Demo9
{
	public static void main(String[]arg)
	{
	  FDemo f= new FDemo();
	  f.setVisible(true);
	  f.setSize(500,500);
	  f.setLocation(300,50);
	}
}
