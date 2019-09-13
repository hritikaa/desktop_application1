import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.Graphics.*;
class jp5 extends JPanel
{
JButton b1;
Label un;
jp5(Fd f)
{
setLayout(null);

Font f1=new Font("Broadway",Font.BOLD,25);
setFont(f1);
setBackground(Color.darkGray);
// Label un =new Label("Welcome in the wonderlust booking website!!!!!");
// un.setForeground(Color.white);
// un.setSize(600,150);
// un.setLocation(80,150);
// add(un);
b1=new JButton("back");
b1.setSize(100,50);
b1.setLocation(100,100);
b1.addActionListener(f);
add(b1);
}
public void paintComponent(Graphics g)
{
	Toolkit tk= Toolkit.getDefaultToolkit();
	Image i=tk.getImage("1c74113373c3b1797d463de63ad00afb.jpg");
	g.drawImage(i,0,300,this);
	
	g.drawString("Welcome in the wonderlust booking website!!!!!",100,70);
}
}

