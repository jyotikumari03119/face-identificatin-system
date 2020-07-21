import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
class home1 extends JFrame implements ActionListener 
{
int counter=600;
int x=1000;
int c=1;
JLabel l1,l2,l3,lbl,lbl_pic,lbl_mark,lbl1,lbl2;
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


Container con;
JFrame fr;
JLabel ll1,ll2,ll3,ll4,ll5;
JTextField t1,t2,t4,t5;
JTextArea ta;
JPanel p;
JButton b1,b2;
home1()
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
label1.setForeground(Color.black);label2.setForeground(Color.white);label3.setForeground(Color.white);label4.setForeground(Color.white);
label5.setForeground(Color.black);label6.setForeground(Color.white);label7.setForeground(Color.white);label8.setForeground(Color.white);
label9.setForeground(Color.black);label10.setForeground(Color.white);
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
jtp.setBackground(Color.BLACK);
jtp.setForeground(Color.WHITE);
jtp.addTab("Home",new Home());
jtp.addTab("Login",new Login());
jtp.addTab("About Us",new About());
jtp.addTab("Help",new Help());
con.add(pan6);

lbl_pic =new JLabel();
lbl_pic.setBounds(0,0,170,150);
lbl_pic.setIcon(new ImageIcon("images//Stu_Pro.png"));
con.add(lbl_pic);

/*Timer t=new Timer(x,new ActionListener()
{
public void actionPerformed(ActionEvent k)
{
if(c==5)
c=1;

lbl_pic.setIcon(new ImageIcon("images//p"+c+".jpg"));
c++;
}
}
);
t.start();*/


Timer t1=new Timer(300,new ActionListener()
{
public void actionPerformed(ActionEvent ksdfg)
{
if(counter==140)
counter=600;
label1.setLocation(0,counter-100);
label2.setLocation(0,counter-80);
label3.setLocation(0,counter-60);label4.setLocation(0,counter-40);label5.setLocation(0,counter-20);
label6.setLocation(0,counter);label7.setLocation(0,counter+40);label8.setLocation(0,counter+80);
label9.setLocation(0,counter+120);label10.setLocation(0,counter+160);
counter=counter-20;
}
});
t1.start();

fr.setVisible(true);
fr.setResizable(false);
fun_date();
//fr.setResizable(false);
}
class Home extends JPanel
{
JLabel lbl_pic3;
int c=1;
int x=1000;
Home()
{
setLayout(new BorderLayout());
setBackground(new Color(135,206,250));
lbl_pic3=new JLabel();
lbl_pic3.setLayout(new FlowLayout());
add(lbl_pic3);
Timer t=new Timer(x,new ActionListener()
{
public void actionPerformed(ActionEvent k)
{
if(c==8)
c=1;

lbl_pic3.setIcon(new ImageIcon("images//homepic//img"+c+".jpg"));
c++;
}
}
);
t.start();

}
}
class Login extends JPanel implements ActionListener
{

Connection connect;
PreparedStatement pst;
JPanel p;
JLabel l4,l5,l8,lbl_pic4;
JTextField t1;
JPasswordField t2;
JButton b1,b2;
JComboBox cmb;
Font f1=new Font("Palatino Linotype",Font.BOLD,25);
Login()
{
setBackground(new Color(135,206,250));
lbl_pic4=new JLabel();
lbl_pic4.setIcon(new ImageIcon("images//loginpic.jpg"));
add(lbl_pic4);
lbl_pic4.setLayout(null);
p=new JPanel();
p.setLayout(null);
p.setBorder(BorderFactory.createLineBorder(Color.black));
p.setBorder(BorderFactory.createTitledBorder("Login Here"));
p.setBounds(270,230,400,200);
//p.setOpaque(true);
//p.setVisible(false);
p.setFont(f1);
lbl_pic4.add(p);

 l4=new JLabel("ENTER USER ID");
l4.setBounds(25,35,130,20);
 t1=new JTextField(16);
 t1.setBounds(160,35,180,20);
 l5=new JLabel("ENTER PASSWORD");
l5.setBounds(25,70,130,20);
 t2=new JPasswordField(16);
 t2.setBounds(160,70,180,20);
 l8=new JLabel("SELECT TYPE OF USER");
l8.setBounds(25,105,130,20);
cmb=new JComboBox(); 
cmb.setBounds(160,105,180,20);
cmb.addItem("-Select-");
cmb.addItem("Operator");
cmb.addItem("Administrator");
 b1=new JButton();
b1.setIcon(new ImageIcon("images\\img.jpg"));
 b1.setBounds(50,140,120,35);
 b2=new JButton();
b2.setIcon(new ImageIcon("images\\register.jpg"));
 b2.setBounds(190,140,100,35);
p.add(l4);
p.add(t1);
p.add(l5);
p.add(t2);
p.add(l8);
p.add(cmb);
p.add(b1);
p.add(b2);

 b1.addActionListener(this);
b2.addActionListener(this);
}
public void actionPerformed(ActionEvent k)
{
		

if(k.getSource()==b2)
{
fr.dispose();
new home1();
}
}

}
class About extends JPanel
{
About()
{
setBackground(new Color(135,206,250));
}
}
class Help extends JPanel
{
JLabel lbl_picHelp;
Help()
{
//setLayout(new BorderLayout());
setBackground(new Color(135,206,250));
lbl_picHelp=new JLabel();
//lbl_picHelp.setLayout(new FlowLayout());
lbl_picHelp.setIcon(new ImageIcon("images//picture.png"));
add(lbl_picHelp);

}
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


public static void main(String s[])
{
design12 obj=new design12();

obj.fun_date();

}
}
fr=new JFrame();
fr.setBounds(300,0,1000,1200);
p=new JPanel();
p.setBounds(310,10,700,400);
p.setLayout(new GridLayout(6,2));
p.setBorder(BorderFactory.createTitledBorder(""));
l1=new JLabel("name");
l2=new JLabel("mobileno");
l3=new JLabel("address");
l4=new JLabel("city");
l5=new JLabel("pincode");
t1=new JTextField();
t2=new JTextField();
t4=new JTextField();
t5=new JTextField();
ta=new JTextArea();
b1=new JButton("SAVE");
b2=new JButton("RESET");
p.add(l1);
p.add(t1);
p.add(l2);
p.add(t2);
p.add(l3);
p.add(ta);
p.add(l4);
p.add(t4);
p.add(l5);
p.add(t5);
p.add(b1);
p.add(b2);
fr.add(p);
fr.setLayout(null);
fr.setVisible(true);
}
public void actionPerformed(ActionEvent k)
{
if(k.getSource()==b1)
{
}
if(k.getSource()==b2)
{
}
}
public static void main(String k[])
{
new home1();
}

}



