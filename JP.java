import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class Jp extends JPanel
{
JButton b1;
Label un;
Jp(Fd f)
{
setLayout(null);

Font f1=new Font("Script MT Bold",Font.BOLD,25);
setFont(f1);
setBackground(Color.darkGray);
// Label un =new Label("Welcome in the wonderlust booking website!!!!!");
// un.setForeground(Color.white);
// un.setSize(600,150);
// un.setLocation(80,150);
// add(un);
b1=new JButton("admin login....");
b1.setSize(200,50);
b1.setLocation(50,520);
b1.addActionListener(f);
add(b1);


}
public void paintComponent(Graphics g)
{
	Toolkit tk= Toolkit.getDefaultToolkit();
	Image i=tk.getImage("University-of-California-Berkeley.jpg");
	g.drawImage(i,0,0,this);
	g.setFont(new Font("TimesRoman",Font.BOLD,40));
	g.drawString("engineering college florida",50,50);
	// g.setColor(Color.yellow);
	// g.setFont(new Font("Script MT Bold",Font.BOLD,40));
	// g.drawString("1.travel different city",600,200);
	// g.setColor(Color.pink);
	// g.drawString("2.At low cost",600,250);
	// g.setColor(Color.orange);
	// g.drawString("3.luxuriuos proviences",600,300);
	// g.setColor(Color.green);
	// g.drawString("4.Amazing experience",600,350);
}
}