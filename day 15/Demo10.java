import java.awt.*;
import java.awt.event.*;
class FDemo extends Frame implements ActionListener
{
	Button b1,b2,b3;
	FDemo()
	{
		Font f = new Font ("Times New Roman",Font.BOLD,30);
		setFont(f);
		
		setLayout(null);
		
		
		b1 = new Button();
		
		b1.setSize(100,100);
		
		b1.setLocation(100,100);
		
		b1.addActionListener(this);
		add(b1);
		
		b2 = new Button();
		
		b2.setSize(100,100);
	  
        b2.setLocation(200,100);
      
        b2.addActionListener(this);
        add(b2);		
		
		
	}	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)          b1.setLabel("o");
		
		if(e.getSource()==b2)          b2.setLabel("x");
    }
}
class Demo10
{
	public static void main(String[]arg)
	{
	  FDemo f= new FDemo();
	  f.setVisible(true);
	  f.setSize(500,500);
	  f.setLocation(300,50);
	}
}
