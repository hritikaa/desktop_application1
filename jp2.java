import javax.swing.*;
import java.awt.*;
class Jp2 extends JPanel 
{
JButton b1,b2,b3;
JTextField tx1,tx2;
Jp2(Fd f)
{
Font f1=new Font("Broadway",Font.BOLD,18);
setFont(f1);
setBackground(Color.darkGray);
setLayout(null);
Label un =new Label("Enter e-mail");
un.setForeground(Color.white);

un.setSize(130,30);
un.setLocation(60,150);
add(un);
tx1=new JTextField(20);
tx1.setSize(150,30);
tx1.setLocation(250,150);
add(tx1);
Label un1 =new Label("Enter password");
un1.setForeground(Color.white);
un1.setSize(140,30);
un1.setLocation(60,200);
add(un1);
tx2=new JTextField(20);
tx2.setSize(150,30);
tx2.setLocation(250,200);
add(tx2);
// ImageIcon w=new ImageIcon("untitled3.jpg");
b1=new JButton("accountant");
b1.setSize(150,30);
b1.setLocation(90,300);
add(b1);
b2=new JButton("login");
b2.setSize(150,30);
b2.setLocation(200,250);
add(b2);
b3=new JButton("Back");
b3.setSize(150,30);
b3.setLocation(250,300);
add(b3);
b1.addActionListener(f);
b2.addActionListener(f);
b3.addActionListener(f);
}
public void paintComponent(Graphics g)
{
	Toolkit tk= Toolkit.getDefaultToolkit();
	Image i=tk.getImage("portal.jpg");
	g.drawImage(i,0,0,this);
	g.drawString("ADMIN LOGIN",600,70);
}

}
