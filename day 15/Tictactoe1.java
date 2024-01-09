import java.awt.*;
import java.awt.event.*;
class FDemo extends Frame implements ActionListener
{
	Button b[] = new Button[9];
    int x=100,y=100,w=100,h=100;
    FDemo()
	{
     Font f = new Font("Times New Roman",Font.BOLD,30);

    setFont(f);
    setLayout(null);

    int i,j,k=0;
    for(i=0;i<3;i++)
	{
     for(j=0;j<3;j++)
      {
      	b[k]=new Button();
        b[k].setSize(w,h);	
        b[k].setLocation(x,y);
        b[k].addActionListener(this);
        add(b[k]);
        k++;
        x+=100;
	  }
       x=100;
       y+=100;	   
	}
}

int c=0;
public void actionPerformed(ActionEvent e)
{
	Button b = (Button)e.getSource();

	if(c%2==0||)
		b.setLabel("o");
	else
		b.setLabel("x");
	b.removeActionListener(this);
	c++;
}
}
class Tictactoe1
{
	public static void main(String[]arg)
	{
	  FDemo f= new FDemo();
	  f.setVisible(true);
	  f.setSize(500,500);
	  f.setLocation(300,50);
	}
}
