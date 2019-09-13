import javax.swing.*;
import java.awt.*;
class Jp3 extends JPanel 
{
JButton b1;
JTextField tx1,tx2;
Jp3(Fd f)
{
Font f1=new Font("Broadway",Font.BOLD,18);
setFont(f1);
setLayout(null);
setBackground(Color.darkGray);
// Label un =new Label("this is the bus booking website where you can travel many different cities!!!! .....");
// un.setForeground(Color.white);
// un.setSize(130,30);
// un.setLocation(80,150);
// add(un);
b1=new JButton("Back");
b1.setSize(150,30);
b1.setLocation(90,300);
add(b1);

b1.addActionListener(f);
}
public void paintComponent(Graphics g)
{
	Toolkit tk= Toolkit.getDefaultToolkit();
	Image i=tk.getImage("07593fefd2bbe513ca0cfdd4ae91c448.jpg");
	g.drawImage(i,50,100,this);
	g.drawString("WONDERLUST",600,50);
}

}
