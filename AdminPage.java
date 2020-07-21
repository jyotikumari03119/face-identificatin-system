import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.Calendar;
import java.sql.*;
import java.io.*;
class AdminPage implements ActionListener
{
Connection conn;
PreparedStatement pst;
JTextField t1,t2,t3,t4;
JTextArea ta;
JComboBox cb;
int counter=600;
int x=1000;
int c=1;
JLabel l1,l2,l3,lbl,lbl_pic,lpic,lbl_mark,lbl1,lbl2;
JLabel label1=new JLabel("This System is");
JLabel label2=new JLabel("mainly developed");
JLabel label3=new JLabel("for identifying");
JLabel label4=new JLabel("criminals in investi-");
JLabel label5=new JLabel("gation department of India");
JLabel label6=new JLabel("It is done by:-");
JLabel label7=new JLabel("1.Adding Details");
JLabel label8=new JLabel("2.Clipping Image");
JLabel label9=new JLabel("3.Constructing Image");
JLabel label10=new JLabel("4.Matching Image");
JPanel pan1;
static JFrame fr;
Font f,f5;

String str="";
Container con;

AdminPage()
{
fr=new JFrame("HOME PAGE ");
fr.setLayout(null);
fr.setBounds(50,50,950,600);

fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
fr.setExtendedState(JFrame.MAXIMIZED_BOTH);

con=fr.getContentPane();
con.setBackground(Color.gray);
f=new Font("Palatino Linotype",Font.BOLD,40);
l1=new JLabel("	FACE IDENTIFICATION SYSTEM",SwingConstants.CENTER);
l1.setBounds(170,0,1200,150);
l1.setBorder(BorderFactory.createLineBorder(Color.black));
l1.setOpaque(true);
l1.setForeground(Color.green);
l1.setBackground(Color.black);
l1.setFont(f);
con.add(l1);
pan1=new JPanel();
pan1.setLayout(null);
pan1.setBounds(0,150,170,700);
pan1.setBackground(Color.black);
label1.setForeground(Color.white);label2.setForeground(Color.white);label3.setForeground(Color.white);label4.setForeground(Color.white);
label5.setForeground(Color.white);label6.setForeground(Color.white);label7.setForeground(Color.white);label8.setForeground(Color.white);
label9.setForeground(Color.white);label10.setForeground(Color.white);
f5=new Font("Palatino Linotype",Font.BOLD,15);
label1.setFont(f5);label2.setFont(f5);label3.setFont(f5);label4.setFont(f5);label5.setFont(f5);
label1.setSize(160,40);
label2.setSize(160,40);
label3.setSize(160,40);label4.setSize(160,40);label5.setSize(160,40);label6.setSize(160,40);label7.setSize(160,40);
label8.setSize(160,40);label9.setSize(160,40);label10.setSize(160,40);
pan1.add(label1);
pan1.add(label2);
pan1.add(label3);pan1.add(label4);pan1.add(label5);
pan1.add(label6);pan1.add(label7);pan1.add(label8);pan1.add(label9);pan1.add(label10);
con.add(pan1);

lbl1=new JLabel();
lbl1.setBackground(Color.white);
lbl1.setOpaque(true);
lbl1.setBounds(0,700,1370,6);
con.add(lbl1);
lbl_mark=new JLabel();
lbl_mark.setBackground(Color.white);
lbl_mark.setOpaque(true);
lbl_mark.setBounds(170,150,2,680);
con.add(lbl_mark);
JPanel pan6=new JPanel();
pan6.setLayout(null);
pan6.setBounds(170,150,1200,550);
pan6.setBorder(BorderFactory.createLineBorder(Color.BLUE));
JTabbedPane jtp=new JTabbedPane();
pan6.add(jtp);
jtp.setBounds(0,0,1200,550);
jtp.setFont(new Font("Palatino Linotype",Font.BOLD,25));
jtp.setBackground(Color.white);
jtp.setForeground(Color.white);
jtp.addTab("Register ",new Home());
//jtp.addTab("Home",new Login());
//jtp.addTab("About Us",new About());
//jtp.addTab("Help",new Help());
con.add(pan6);


lbl_pic =new JLabel();
lbl_pic.setBounds(0,0,170,150);
lbl_pic.setIcon(new ImageIcon("images//Stu_Pro.png"));
con.add(lbl_pic);


fr.setLayout(null);
fr.setVisible(true);
}
public void actionPerformed(ActionEvent t8){}


void fun_date()
{
Font f2=new Font("Palatino Linotype",Font.BOLD,20);
 l3=new JLabel("",SwingConstants.RIGHT);
 l3.setOpaque(true);
 l3.setBounds(850,13,150,35);
 l3.setBackground(Color.white);
 l3.setForeground(Color.white);
l3.setFont(f);
 con.add(l3);
Timer t=new Timer(1000,new ClockListener());
t.start();
}

class Home extends JPanel implements ActionListener
{
JLabel lbl_picint,lbl_pic3;
int x=1000;
JButton b1,b2,b3,b4,b5;

Home()
{
JPanel p;
JLabel l11,l22,l33,l4,l6;
cb=new JComboBox();
cb.addItem("select");
cb.addItem("murder case");
cb.addItem("dowry case");
cb.addItem("roberry case");
cb.addItem("kidnapping case");
p=new JPanel();
p.setLayout(new GridLayout(7,2));
p.setBounds(300,200,700,300);
p.setBorder(BorderFactory.createTitledBorder(""));
lpic=new JLabel();
lpic.setBounds(1000,200,400,300);
lpic.setBorder(BorderFactory.createTitledBorder(""));
//fr.add(b3);		
l11=new JLabel("<html><body><font color=red>name</font></body></html>");
l22=new JLabel("mobileno");
l33=new JLabel("address");
l4=new JLabel("city");
l6=new JLabel("crime Involved");
t1=new JTextField();
t2=new JTextField();
t3=new JTextField();
ta=new JTextArea();
b1=new JButton("ADD");
b2=new JButton("BACK");
b4=new JButton("UPDATE");
b5=new JButton("DELETE");
b3=new JButton("UPLOAD PIC");
b3.setBounds(1100,500,130,20);
p.add(l11);
p.add(t1);
p.add(l22);
p.add(t2);
p.add(l33);
p.add(ta);
p.add(l4);
p.add(t3);
p.add(l6);
p.add(cb);
p.add(b1);
p.add(b2);
fr.add(b3);
p.add(b4);
p.add(b5);
fr.add(lpic);
fr.add(p);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this); 
b4.addActionListener(this);
b5.addActionListener(this); 
}
public void actionPerformed(ActionEvent k8888)
{
if(k8888.getSource()==b1)
 {
try
{
Class.forName("oracle.jdbc.driver.OracleDriver");
conn=DriverManager.getConnection("jdbc:Oracle:thin:@localhost:1521:Xe","system","a");
pst=conn.prepareStatement("insert into stu3 values(?,?,?,?,?,?)");
pst.setString(1,t1.getText());
pst.setString(2,t2.getText());
pst.setString(3,ta.getText());
pst.setString(4,t3.getText());
pst.setString(5,String.valueOf(cb.getSelectedItem()));
pst.setString(6,str);
pst.executeUpdate();
JOptionPane.showMessageDialog(null," Details Saved Successfully!");
conn.close();
pst.close();

}
catch(Exception obj1)
{
JOptionPane.showMessageDialog(null,"FAILED="+obj1);
}
}

if(k8888.getSource()==b2)
{
fr.dispose();
new design();
}

if(k8888.getSource()==b3)
{
JFileChooser obj=new JFileChooser();
obj.showOpenDialog(this);
File f=obj.getSelectedFile();
 str=f.getPath();
lpic.setIcon(new ImageIcon(str));
}
if(k8888.getSource()==b4)
{
fr.dispose();
new update2();
}
if(k8888.getSource()==b5)
{
}
}
}


class Login extends JPanel implements ActionListener
{

JPanel p;
JLabel l4,l5,l8,lbl_pic4;
JTextField t1;
JPasswordField t2;
JButton b1,b2;
JComboBox cmb;
Font f1=new Font("Palatino Linotype",Font.BOLD,25);
Login()
{
new design();
}
public void actionPerformed(ActionEvent t6){}
}

class About extends JPanel
{
}
class Help extends JPanel
{
}
class ClockListener implements ActionListener
{
public void actionPerformed(ActionEvent e)
{
Calendar now= Calendar.getInstance();
int h=now.get(Calendar.HOUR);
int m=now.get(Calendar.MINUTE);
int s=now.get(Calendar.SECOND);
l3.setText(""+h+":"+m+":"+s);
}
}

public static void main(String ak[])
{
new AdminPage();
}
}
