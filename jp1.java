import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class Jp1 extends JPanel
{
JButton b1,b2;

Jp1(Fd f)
{
setLayout(null);

Font f1=new Font("Broadway",Font.BOLD,30);
setFont(f1);
setBackground(Color.darkGray);
// Label un =new Label("click on login to login or click on about to know more .....");
// un.setForeground(Color.white);
// un.setSize(800,150);
// un.setLocation(80,150);
// add(un);
b1=new JButton("login");
b1.setSize(100,50);
b1.setLocation(50,500);
b1.addActionListener(f);
add(b1);
b2=new JButton("about");
b2.setSize(100,50);
b2.setLocation(400,500);
b2.addActionListener(f);
add(b2);


}
public void paintComponent(Graphics g)
{
	Toolkit tk= Toolkit.getDefaultToolkit();
	Image i=tk.getImage("b5a46d5f10242b319f302efdc6db8df0.jpg");
	g.drawImage(i,0,0,this);
		g.setFont(new Font("TimesRoman",Font.BOLD,60));
	g.drawString("login to book",100,70);
	// g.drawString("welcome in wonderlust booking website",50,50);
	g.setColor(Color.blue);
	g.setFont(new Font("Script MT Bold",Font.BOLD,40));
	g.drawString("1.press login button to login",50,200);
	g.setColor(Color.blue);
	g.drawString("2.enter name and password",50,250);
	g.setColor(Color.blue);
	g.drawString("3.click on about",50,300);
	g.setColor(Color.blue);
	g.drawString("4.know more",50,350);

}

}