import javax.swing.*;
import java.awt.*;
class E extends JPanel 
{
JButton b1;
JTextField tx1,tx2,tx3,tx4;
TextArea a1;
E(Fd f)
{
Font f1=new Font("Broadway",Font.BOLD,18);
setFont(f1);
setBackground(Color.darkGray);
setLayout(null);
Label un =new Label("Enter Name");
un.setForeground(Color.white);
un.setSize(130,30);
un.setLocation(80,150);
add(un);
tx1=new JTextField(20);
tx1.setSize(150,30);
tx1.setLocation(250,150);
add(tx1);
Label un1 =new Label("Enter password");
un1.setForeground(Color.white);
un1.setSize(130,30);
un1.setLocation(80,200);
add(un1);
tx2=new JTextField(20);
tx2.setSize(150,30);
tx2.setLocation(250,200);
add(tx2);
Label un2 =new Label("Contact no.");
un2.setForeground(Color.white);
un2.setSize(130,30);
un2.setLocation(80,250);
add(un2);
tx3=new JTextField(20);
tx3.setSize(150,30);
tx3.setLocation(250,250);
add(tx3);
Label un3 =new Label("city");
un3.setForeground(Color.white);
un3.setSize(130,30);
un3.setLocation(80,330);
add(un3);
tx4=new JTextField(20);
tx4.setSize(150,30);
tx4.setLocation(250,330);
add(tx4);
	 a1 =new TextArea("Address:-");
	 a1.setSize(300,250);
	 a1.setLocation(80,390);
	 add(a1);


b1=new JButton("register");
b1.setSize(100,60);
b1.setLocation(430,440);
add(b1);
b1.addActionListener(f);
}
public void paintComponent(Graphics g)
{
	Toolkit tk= Toolkit.getDefaultToolkit();
	Image i=tk.getImage("139234ce0cf2fe435c597220b58c10da2.jpg");
	g.drawImage(i,600,100,this);
	g.drawString("login to book",100,70);
}

}
