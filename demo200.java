import java.awt.*;
import javax.swing.*;
import javax.swing.table.*;
import java.sql.*;
import java.awt.event.*;
class Fd extends JFrame implements ActionListener
{
 String [] str={"UNAME","UPASS","CONTACT","CITY","ADDRESS"};

 JTextField tx1,tx2,tx3,tx4;
TextArea a1;
JButton b1,b2,b3;
Jp p;
 Jp1 p1;
Jp2 p2;
Jp3 p3;
E h;
jp5 p5;
JPdemo jp;
JPdemo2 jp1;
InsData ins;
SrcData src;
UpdateData up;
DelData del;
ShowData show;
InsData1 ins1;
SrcData1 src1;
UpdateData1 up1;
DelData1 del1;
ShowData1 show1;
Container cn= getContentPane();
CardLayout card;
Fd()
{
card=new CardLayout();
cn.setLayout(card);
p=new Jp(this);
cn.add("p",p);
p1=new Jp1(this);
cn.add("p1",p1);
p2=new Jp2(this);
cn.add("p2",p2);
p3=new Jp3(this);
cn.add("p3",p3);
h=new E(this);
cn.add("h",h);
p5=new jp5(this);
cn.add("p5",p5);
jp=new JPdemo(this);
cn.add("jp",jp);
ins=new InsData(this);
cn.add("in",ins);
src=new SrcData(this);
cn.add("src",src);
up=new UpdateData(this);
cn.add("up",up);
del=new DelData(this);
cn.add("del",del);
show=new ShowData(this);
cn.add("show",show);
jp1=new JPdemo2(this);
cn.add("jp1",jp1);
ins1=new InsData1(this);
cn.add("in1",ins1);
src1=new SrcData1(this);
cn.add("src1",src1);
up1=new UpdateData1(this);
cn.add("up1",up1);
del1=new DelData1(this);
cn.add("del1",del1);
show1=new ShowData1(this);
cn.add("show1",show1);
}
public void actionPerformed(ActionEvent e)
{
if(e.getSource()==p.b1)
{
card.show(cn,"p2");
}


if(e.getSource()==p1.b1)
{
card.show(cn,"p2");

}
if(e.getSource()==p1.b2)
{
card.show(cn,"p3");

}
if(e.getSource()==jp.show.b2)
{
card.show(cn,"p2");

}
if(e.getSource()==jp1.show1.b2)
{
card.show(cn,"p2");

}
if(e.getSource()==p2.b1)
{
	
card.show(cn,"jp1");
}

if(e.getSource()==p2.b3)
{
card.show(cn,"p");

}

		if(e.getSource()==p2.b2)
		{
			String s1=p2.tx1.getText();
			String s2=p2.tx2.getText();
try
{
Class.forName("com.mysql.cj.jdbc.Driver");
String db_url="jdbc:mysql://localhost:3306/rit?useSSL=false&allowPublicKeyRetrieval=true";
String db_uname="root";
String db_upass="root";
Connection con=DriverManager.getConnection(db_url,db_uname,db_upass);
Statement st=con.createStatement();
String q="select * from student1 where UNAME='"+s1+"' AND UPASS='"+s2+"'";


st.executeQuery(q);

ResultSet rs=st.executeQuery(q);


			if(rs.next())
			{
		     card.show(cn,"jp");	
			}		
		
			else
			{
				JOptionPane.showMessageDialog(p2.b2,"invalid username and pass ");

			
}

p2.tx1.setText("");
  p2.tx2.setText("");
// p2.jpass.setText("");
			con.close();

}
		


		catch(Exception e1)
		{
			
			System.out.println(e1);
		}

		}
		if(e.getSource()==p5.b1)
{
card.show(cn,"p1");

}
	if(e.getSource()==h.b1)
{
String s3=h.tx1.getText();
			String s4=h.tx2.getText();
			String s5=h.tx3.getText();
			String s6=h.tx4.getText();
			String s7=h.a1.getText();
		
try
{
Class.forName("com.mysql.cj.jdbc.Driver");
String db_url="jdbc:mysql://localhost:3306/rit?useSSL=false&allowPublicKeyRetrieval=true";
String db_uname="root";
String db_upass="root";
Connection con=DriverManager.getConnection(db_url,db_uname,db_upass);
Statement st=con.createStatement();
String q="insert into student1 values('"+s3+"','"+s4+"','"+s5+"','"+s6+"','"+s7+"')";


st.executeUpdate(q);
con.close();
h.tx1.setText("");

h.tx2.setText("");
h.tx3.setText("");
h.tx4.setText("");			

System.out.println("data insert");
card.show(cn,"jp");
}
catch(Exception e2)
		{
			
			System.out.println(e2);
		}
}

if(e.getSource()==p3.b1)
{
card.show(cn,"p1");
}
if(e.getSource()==jp.ins.b1)
{
	String s8=jp.ins.tx1.getText();
			String s9=jp.ins.tx2.getText();
			String s10=jp.ins.tx3.getText();
			String s11=jp.ins.tx4.getText();
			String s12=jp.ins.tx5.getText();
			String s13=jp.ins.tx6.getText();
		
try
{
Class.forName("com.mysql.cj.jdbc.Driver");
String db_url="jdbc:mysql://localhost:3306/rit?useSSL=false&allowPublicKeyRetrieval=true";
String db_uname="root";
String db_upass="root";
Connection con=DriverManager.getConnection(db_url,db_uname,db_upass);
Statement st=con.createStatement();
String q="insert into student1(UID,UNAME,UPASS,CONTACT,CITY,ADDRESS) values('"+s13+"','"+s8+"','"+s9+"','"+s10+"','"+s11+"','"+s12+"')";


st.executeUpdate(q);
con.close();
jp.ins.tx1.setText("");

jp.ins.tx2.setText("");
jp.ins.tx3.setText("");
jp.ins.tx4.setText("");			
jp.ins.tx5.setText("");			
jp.ins.tx6.setText("");			
 showdata1();
	

// card.show(cn,"p2");
}
catch(Exception e3)
		{
			
			System.out.println(e3);
		}



}

if(e.getSource()==jp.up.b1)
{
	String s8=jp.up.tx1.getText();
			String s9=jp.up.tx2.getText();
			String s10=jp.up.tx3.getText();
			String s11=jp.up.tx4.getText();
			String s12=jp.up.tx5.getText();
			String s13=jp.up.tx6.getText();
		
try
{
Class.forName("com.mysql.cj.jdbc.Driver");
String db_url="jdbc:mysql://localhost:3306/rit?useSSL=false&allowPublicKeyRetrieval=true";
String db_uname="root";
String db_upass="root";
Connection con=DriverManager.getConnection(db_url,db_uname,db_upass);
Statement st=con.createStatement();
String q="update student1 set UNAME='"+s8+"',UPASS='"+s9+"',CONTACT='"+s10+"',CITY='"+s11+"',ADDRESS='"+s12+"' where UID='"+s13+"'";


st.executeUpdate(q);
con.close();
jp.up.tx1.setText("");

jp.up.tx2.setText("");
jp.up.tx3.setText("");
jp.up.tx4.setText("");			

jp.up.tx5.setText("");			
jp.up.tx6.setText("");			

 showdata1();
	
// card.show(cn,"p2");
}
catch(Exception e7)
		{
			
			System.out.println(e7);
		}



}

if(e.getSource()==jp1.up1.b1)
{
	String s8=jp1.up1.tx1.getText();
			String s9=jp1.up1.tx2.getText();
			String s10=jp1.up1.tx3.getText();
			String s11=jp1.up1.tx4.getText();
			String  s12=jp1.up1.tx5.getText();
			String s13=jp1.up1.tx6.getText();
		
try
{
Class.forName("com.mysql.cj.jdbc.Driver");
String db_url="jdbc:mysql://localhost:3306/rit?useSSL=false&allowPublicKeyRetrieval=true";
String db_uname="root";
String db_upass="root";
Connection con=DriverManager.getConnection(db_url,db_uname,db_upass);
Statement st=con.createStatement();
String q="update accountant1 set UNAME='"+s8+"',UPASS='"+s9+"',CONTACT='"+s10+"',CITY='"+s11+"',ADDRESS='"+s12+"' where UID='"+s13+"'";


st.executeUpdate(q);
con.close();
jp1.up1.tx1.setText("");

jp1.up1.tx2.setText("");
jp1.up1.tx3.setText("");
jp1.up1.tx4.setText("");			

jp1.up1.tx5.setText("");			
jp1.up1.tx6.setText("");			

 showdata2();
	
// card.show(cn,"p2");
}
catch(Exception e7)
		{
			
			System.out.println(e7);
		}



}


if(e.getSource()==jp.del.b1)
{
	String s8=jp.del.tx1.getText();
			
		
try
{
Class.forName("com.mysql.cj.jdbc.Driver");
String db_url="jdbc:mysql://localhost:3306/rit?useSSL=false&allowPublicKeyRetrieval=true";
String db_uname="root";
String db_upass="root";
Connection con=DriverManager.getConnection(db_url,db_uname,db_upass);
Statement st=con.createStatement();
String q="delete from student1  where UID='"+s8+"'";


st.executeUpdate(q);
con.close();
jp.del.tx1.setText("");
 showdata1();
	
}
catch(Exception e8)
		{
			
			System.out.println(e8);
		}



}


if(e.getSource()==jp1.del1.b1)
{
	String s8=jp1.del1.tx1.getText();
		
try
{
Class.forName("com.mysql.cj.jdbc.Driver");
String db_url="jdbc:mysql://localhost:3306/rit?useSSL=false&allowPublicKeyRetrieval=true";
String db_uname="root";
String db_upass="root";
Connection con=DriverManager.getConnection(db_url,db_uname,db_upass);
Statement st=con.createStatement();
String q="delete from accountant1  where UID='"+s8+"'";


st.executeUpdate(q);
con.close();
jp1.del1.tx1.setText("");
 showdata2();
	
}
catch(Exception e8)
		{
			
			System.out.println(e8);
		}



}

if(e.getSource()==jp.src.b1)
{
	 showdata();

	 }
	 if(e.getSource()==jp1.src1.b1)
{
	 showdata3();

	 }
if(e.getSource()==jp1.show1.b1)
{
	 showdata2();
	

	 }
if(e.getSource()==jp.show.b1)
{
	 showdata1();
 card.show(cn,"jp");

	 }
	
	if(e.getSource()==jp1.ins1.b1)
{
	
	String s8=jp1.ins1.tx1.getText();
			String s9=jp1.ins1.tx2.getText();
			String s10=jp1.ins1.tx3.getText();
			String s11=jp1.ins1.tx4.getText();
			String s12=jp1.ins1.tx5.getText();
			String s13=jp1.ins1.tx6.getText();
		
try
{
Class.forName("com.mysql.cj.jdbc.Driver");
String db_url="jdbc:mysql://localhost:3306/rit?useSSL=false&allowPublicKeyRetrieval=true";
String db_uname="root";
String db_upass="root";
Connection con=DriverManager.getConnection(db_url,db_uname,db_upass);
Statement st=con.createStatement();
String q="insert into accountant1 (UID,UNAME,UPASS,CONTACT,CITY,ADDRESS) values('"+s13+"','"+s8+"','"+s9+"','"+s10+"','"+s11+"','"+s12+"')";


st.executeUpdate(q);
con.close();
jp1.ins1.tx1.setText("");

jp1.ins1.tx2.setText("");
jp1.ins1.tx3.setText("");
jp1.ins1.tx4.setText("");			
jp1.ins1.tx5.setText("");			
jp1.ins1.tx6.setText("");			

 showdata2();
	
// card.show(cn,"p2");
}
catch(Exception e4)
		{
			
			System.out.println(e4);
		}





	 }
}
public void showdata()
{
	JFrame f1=new JFrame();
	f1.setLayout(new BorderLayout());
	f1.setLocation(100,100);
f1.setVisible(true);
f1.setSize(1000,1000);
Toolkit tk= Toolkit.getDefaultToolkit();
Image i=tk.getImage("rso.png");
f1.setIconImage(i);

DefaultTableModel  model=new DefaultTableModel();
model.setColumnIdentifiers(str);
JTable jt=new JTable(model);
jt.setModel(model);
jt.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
jt.setFillsViewportHeight(true);
jt.setVisible(true);
f1.add(jt);
JScrollPane jsp=new JScrollPane(jt);
jsp.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
jsp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
f1.add(jsp);
	String UNAME="";
	String UPASS="";
	String CONTACT="";
	String CITY="";
	String ADDRESS="";
	
try
{
Class.forName("com.mysql.cj.jdbc.Driver");
String db_url="jdbc:mysql://localhost:3306/rit?useSSL=false&allowPublicKeyRetrieval=true";
String db_uname="root";
String db_upass="root";
Connection con=DriverManager.getConnection(db_url,db_uname,db_upass);
Statement st=con.createStatement();
	String s8=jp.src.tx1.getText();
String q="select * from student1 where  UNAME LIKE'"+s8+"%'";
ResultSet rs=st.executeQuery(q);


			while(rs.next())
			{
		    UNAME= rs.getString("UNAME");	
		     UPASS=rs.getString("UPASS");	
		     CONTACT=rs.getString("CONTACT");	
		     CITY=rs.getString("CITY");	
		    ADDRESS=rs.getString("ADDRESS");
model.addRow(new Object[]{UNAME,UPASS,CONTACT,CITY,ADDRESS});			
 jt.setModel(model);
			}		
	System.out.println("search student data");	

con.close();
jp.src.tx1.setText("");

// card.show(cn,"p1");
}
catch(Exception e3)
		{
			
			System.out.println(e3);
		}

}
public void showdata1()
{
	JFrame f2=new JFrame("show all data");
	f2.setLayout(new BorderLayout());
	f2.setLocation(100,100);
f2.setVisible(true);
f2.setSize(1000,1000);
Toolkit tk= Toolkit.getDefaultToolkit();
Image i=tk.getImage("rso.png");
f2.setIconImage(i);
f2.setBackground(Color.yellow);
DefaultTableModel  model=new DefaultTableModel();
model.setColumnIdentifiers(str);
JTable jt=new JTable(model);
jt.setModel(model);
jt.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
jt.setFillsViewportHeight(true);
jt.setVisible(true);
f2.add(jt);
JScrollPane jsp=new JScrollPane(jt);
jsp.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
jsp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
f2.add(jsp);
	String UNAME="";
	String UPASS="";
	String CONTACT="";
	String CITY="";
	String ADDRESS="";
	
try
{
Class.forName("com.mysql.cj.jdbc.Driver");
String db_url="jdbc:mysql://localhost:3306/rit?useSSL=false&allowPublicKeyRetrieval=true";
String db_uname="root";
String db_upass="root";
Connection con=DriverManager.getConnection(db_url,db_uname,db_upass);
Statement st=con.createStatement();
	// String s8=jp.ins.tx1.getText();
String q="select * from student1  ";
ResultSet rs=st.executeQuery(q);


			while(rs.next())
			{
		    UNAME= rs.getString("UNAME");	
			UNAME="p";
		     UPASS=rs.getString("UPASS");	
		     CONTACT=rs.getString("CONTACT");	
		     CITY=rs.getString("CITY");	
		    ADDRESS=rs.getString("ADDRESS");
model.addRow(new Object[]{UNAME,UPASS,CONTACT,CITY,ADDRESS});			
 jt.setModel(model);
			}		
	System.out.println("show student data");	

con.close();
// jp.show.tx1.setText("");

// card.show(cn,"p1");
}
catch(Exception e4)
		{
			
			System.out.println(e4);
		}

}

public void showdata2()
{
	JFrame f3=new JFrame("show all data");
	f3.setLayout(new BorderLayout());
	f3.setLocation(100,100);
f3.setVisible(true);
f3.setSize(1000,1000);
Toolkit tk= Toolkit.getDefaultToolkit();
Image i=tk.getImage("rso.png");
f3.setIconImage(i);

DefaultTableModel  model=new DefaultTableModel();
model.setColumnIdentifiers(str);
JTable jt=new JTable(model);
jt.setModel(model);
jt.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
jt.setFillsViewportHeight(true);
jt.setVisible(true);
f3.add(jt);
JScrollPane jsp=new JScrollPane(jt);
jsp.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
jsp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
f3.add(jsp);
	String UNAME="";
	String UPASS="";
	String CONTACT="";
	String CITY="";
	String ADDRESS="";
	
try
{
Class.forName("com.mysql.cj.jdbc.Driver");
String db_url="jdbc:mysql://localhost:3306/rit?useSSL=false&allowPublicKeyRetrieval=true";
String db_uname="root";
String db_upass="root";
Connection con=DriverManager.getConnection(db_url,db_uname,db_upass);
Statement st=con.createStatement();
	// String s8=jp.ins.tx1.getText();
String q="select * from accountant1  ";
ResultSet rs=st.executeQuery(q);


			while(rs.next())
			{
		    UNAME= rs.getString("UNAME");	
		     UPASS=rs.getString("UPASS");	
		     CONTACT=rs.getString("CONTACT");	
		     CITY=rs.getString("CITY");	
		    ADDRESS=rs.getString("ADDRESS");
model.addRow(new Object[]{UNAME,UPASS,CONTACT,CITY,ADDRESS});			
 jt.setModel(model);
			}		
	System.out.println("show accountant data");	

con.close();
// jp.show.tx1.setText("");

// card.show(cn,"p1");
}
catch(Exception e5)
		{
			
			System.out.println(e5);
		}

}
public void showdata3()
{
	JFrame f5=new JFrame("search accountant data");
	f5.setLayout(new BorderLayout());
	f5.setLocation(100,100);
f5.setVisible(true);
f5.setSize(1000,1000);
Toolkit tk= Toolkit.getDefaultToolkit();
Image i=tk.getImage("rso.png");
f5.setIconImage(i);

DefaultTableModel  model=new DefaultTableModel();
model.setColumnIdentifiers(str);
JTable jt=new JTable(model);
jt.setModel(model);
jt.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
jt.setFillsViewportHeight(true);
jt.setVisible(true);
f5.add(jt);
JScrollPane jsp=new JScrollPane(jt);
jsp.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
jsp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
f5.add(jsp);
	String UNAME="";
	String UPASS="";
	String CONTACT="";
	String CITY="";
	String ADDRESS="";
	
try
{
Class.forName("com.mysql.cj.jdbc.Driver");
String db_url="jdbc:mysql://localhost:3306/rit?useSSL=false&allowPublicKeyRetrieval=true";
String db_uname="root";
String db_upass="root";
Connection con=DriverManager.getConnection(db_url,db_uname,db_upass);
Statement st=con.createStatement();
	String s8=jp1.src1.tx1.getText();
String q="select * from accountant1 where  UNAME LIKE'%"+s8+"%'";
ResultSet rs=st.executeQuery(q);


			while(rs.next())
			{
		    UNAME= rs.getString("UNAME");	
		     UPASS=rs.getString("UPASS");	
		     CONTACT=rs.getString("CONTACT");	
		     CITY=rs.getString("CITY");	
		    ADDRESS=rs.getString("ADDRESS");
model.addRow(new Object[]{UNAME,UPASS,CONTACT,CITY,ADDRESS});			
 jt.setModel(model);
			}		
	System.out.println("search accountant data");	

con.close();
jp1.src1.tx1.setText("");

// card.show(cn,"p1");
}
catch(Exception e3)
		{
			
			System.out.println(e3);
		}

}


}



class Demo200{
public static void main(String []ar)
{
	int x,y,w=700,h=400;
Fd f=new Fd();
f.setLocation(100,100);
f.setVisible(true);
Toolkit tk= Toolkit.getDefaultToolkit();
Image i=tk.getImage("rso.png");
f.setIconImage(i);
Dimension d=tk.getScreenSize();
x=(d.width-w)/2;
y=(d.height-h)/2;
 f.setSize(w,h);
 f.setLocation(x,y);
}

}