import javax .swing.*;
import java .awt.*;
import java .awt.event.*;
class JPdemo extends JPanel
{
JTabbedPane tb;
InsData ins;
SrcData src;
UpdateData up;
DelData del;

ShowData show;
JPdemo(Fd f)
{
setLayout(new BorderLayout());
setBackground(Color.darkGray);
tb=new JTabbedPane();
ins=new InsData(f);
src=new SrcData(f);
up=new UpdateData(f);
del=new DelData(f);
show=new ShowData(f);
tb.addTab("Register student",ins);
tb.addTab("Search search",src);
tb.addTab("update info",up);
tb.addTab("delete student",del);
tb.addTab("show all data",show);
 tb.setForeground(Color.darkGray);
add(tb);

}

}
class InsData extends JPanel
{
JLabel u1,u2,u3,u4,u5,u6;
JTextField tx1,tx2,tx3,tx4,tx5,tx6;
JButton b1;
InsData(Fd f)
{
setLayout(null);
u1=new JLabel("Enter name");
u1.setSize(120,50);
u1.setLocation(100,150);
add(u1);
u2=new JLabel("Enter password");
u2.setSize(120,50);
u2.setLocation(100,230);
add(u2);
u3=new JLabel("contact");
u3.setSize(120,50);
u3.setLocation(100,300);
add(u3);
u4=new JLabel("city");
u4.setSize(120,50);
u4.setLocation(100,400);
add(u4);
u5=new JLabel("address");
u5.setSize(120,50);
u5.setLocation(100,500);
add(u5);
u6=new JLabel("ID");
u6.setSize(120,50);
u6.setLocation(100,550);
add(u6);
tx1=new JTextField(20);
tx1.setSize(150,30);
tx1.setLocation(230,160);
add(tx1);
tx2=new JTextField(20);
tx2.setSize(150,30);
tx2.setLocation(230,230);
add(tx2);
tx3=new JTextField(20);
tx3.setSize(150,30);
tx3.setLocation(230,300);
add(tx3);
tx4=new JTextField(20);
tx4.setSize(150,30);
tx4.setLocation(230,400);
add(tx4);
tx5=new JTextField(20);
tx5.setSize(150,30);
tx5.setLocation(230,500);
add(tx5);
tx6=new JTextField(20);
tx6.setSize(150,30);
tx6.setLocation(230,550);
add(tx6);

b1=new JButton("Register");
b1.setSize(100,40);
b1.setLocation(400,600);
b1.addActionListener(f);
add(b1);
}
public void paintComponent(Graphics g)

{
	Toolkit tk= Toolkit.getDefaultToolkit();
	Image i=tk.getImage("business-sc1.jpg");
	g.drawImage(i,0,0,this);
	
	g.setFont(new Font("TimesRoman",Font.BOLD,90));
	// g.drawString("WONDERLUST",100,80);
}

}
class SrcData extends JPanel
{
	
JLabel u1;
JTextField tx1;
JButton b1;
SrcData(Fd f)
{
setLayout(null);
u1=new JLabel("Enter password");
u1.setSize(120,50);
u1.setLocation(100,100);
add(u1);
tx1=new JTextField(20);
tx1.setSize(150,30);
tx1.setLocation(230,100);
add(tx1);
b1=new JButton("search");
b1.setSize(100,40);
b1.setLocation(100,200);
add(b1);
b1.addActionListener(f);
}
public void paintComponent(Graphics g)

{
	Toolkit tk= Toolkit.getDefaultToolkit();
	Image i=tk.getImage("NewHousing-630.jpg");
	g.drawImage(i,0,0,this);
	
	g.setFont(new Font("TimesRoman",Font.BOLD,90));
	// g.drawString("WONDERLUST",100,80);
}
}

class ShowData extends JPanel
{
	

JButton b1,b2;
ShowData(Fd f)
{
setLayout(null);
b1=new JButton("show all data");
b1.setSize(150,40);
b1.setLocation(100,200);
add(b1);
b1.addActionListener(f);
b2=new JButton("back to login page");
b2.setSize(150,40);
b2.setLocation(250,200);
add(b2);
b2.addActionListener(f);
}
public void paintComponent(Graphics g)

{
	Toolkit tk= Toolkit.getDefaultToolkit();
	Image i=tk.getImage("Fresno%20city%20college%20campus%20wallpaper.jpg");
	g.drawImage(i,0,0,this);
	g.setFont(new Font("TimesRoman",Font.BOLD,90));
	g.drawString("show all data",300,80);
	// g.setForeground(Color.white);
}


	
	
}
class UpdateData extends JPanel
{
JLabel u1,u2,u3,u4,u5,u6;
JTextField tx1,tx2,tx3,tx4,tx5,tx6;
JButton b1;
UpdateData(Fd f)
{
setLayout(null);
u1=new JLabel("Enter name");
u1.setSize(120,50);
u1.setLocation(100,100);
add(u1);
u2=new JLabel("Enter password");
u2.setSize(120,50);
u2.setLocation(100,200);
add(u2);
u3=new JLabel("contact");
u3.setSize(120,50);
u3.setLocation(100,300);
add(u3);
u4=new JLabel("city");
u4.setSize(120,50);
u4.setLocation(100,400);
add(u4);
u5=new JLabel("address");
u5.setSize(120,50);
u5.setLocation(100,500);
add(u5);
u6=new JLabel("ID");
u6.setSize(120,50);
u6.setLocation(100,550);
add(u6);
tx1=new JTextField(20);
tx1.setSize(150,30);
tx1.setLocation(230,100);
add(tx1);
tx2=new JTextField(20);
tx2.setSize(150,30);
tx2.setLocation(230,200);
add(tx2);
tx3=new JTextField(20);
tx3.setSize(150,30);
tx3.setLocation(230,300);
add(tx3);
tx4=new JTextField(20);
tx4.setSize(150,30);
tx4.setLocation(230,400);
add(tx4);
tx5=new JTextField(20);
tx5.setSize(150,30);
tx5.setLocation(230,500);
add(tx5);
tx6=new JTextField(20);
tx6.setSize(150,30);
tx6.setLocation(230,550);
add(tx6);

b1=new JButton("update");
b1.setSize(100,40);
b1.setLocation(400,600);
add(b1);
b1.addActionListener(f);
}

public void paintComponent(Graphics g)

{
	Toolkit tk= Toolkit.getDefaultToolkit();
	Image i=tk.getImage("139234ce0cf2fe435c597220b58c10da.jpg");
	g.drawImage(i,0,0,this);
	
	g.setFont(new Font("TimesRoman",Font.BOLD,70));
	g.drawString("UPDATE STUDENT INFO",90,80);
}


}
class DelData extends JPanel
{
	
JLabel u1;
JTextField tx1;
JButton b1;
DelData(Fd f)
{
setLayout(null);
u1=new JLabel("Enter ID");
u1.setSize(120,50);
u1.setLocation(100,100);
add(u1);
tx1=new JTextField(20);
tx1.setSize(150,30);
tx1.setLocation(230,100);
add(tx1);
// tx2=new JTextField(20);
// tx2.setSize(150,30);
// tx2.setLocation(250,150);
// add(tx2);
// tx3=new JTextField(20);
// tx3.setSize(150,30);
// tx3.setLocation(250,150);
// add(tx3);
// tx4=new JTextField(20);
// tx4.setSize(150,30);
// tx4.setLocation(250,150);
// add(tx4);
// tx5=new JTextField(20);
// tx5.setSize(150,30);
// tx5.setLocation(250,150);
// add(tx5);
b1=new JButton("delete");
b1.setSize(100,40);
b1.setLocation(100,200);
add(b1);
b1.addActionListener(f);
}

public void paintComponent(Graphics g)
{
	Toolkit tk= Toolkit.getDefaultToolkit();
	Image i=tk.getImage("4655875a7c91727375a2a49be3f50120.jpg");
	g.drawImage(i,0,0,this);
	g.setFont(new Font("TimesRoman",Font.BOLD,60));
	
	g.drawString("DELETE INFO",100,80);
}


	
	
}

