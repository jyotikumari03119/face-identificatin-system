import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.awt.image.*;
import javax.imageio.*;
import java.sql.*;
import java.util.*;
import static java.sql.DriverManager.*;


class operator implements ActionListener
{
Connection conn,connect;
PreparedStatement pst,pst1;
Connection connect1;

String str1[]=new String[10];
int k1=0;
String str="",fin="";
int i=0;
double count1;
ImageIcon ii;
String img1=null,img2=null,img3=null,img4=null,img5=null;
ResultSet rs;
Connection conn1=null;

JTextField t1,t2,t3,t4;
JTextArea ta;
JComboBox cb,cb1,cb2,cb3,cb4,cb5,cb6;
JButton b,b11,b12;
int counter=600;
int x=1000;
int c=1;
JLabel lface,lface1,lup5,lup6,l1,l2,l3,lbl,lbl_pic,lpic,lbl_mark,lbl1,lbl2,lup,lup1,lup2,lup3,lup4;
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

//String str="";
Container con;

operator()
{
fr=new JFrame("OPERATOR PAGE ");
fr.setLayout(null);
fr.setBounds(50,50,950,600);
lup=new JLabel();
lup.setBounds(700,200,250,300);
lup.setBorder(BorderFactory.createTitledBorder(""));
fr.add(lup);

cb1=new JComboBox();
cb1.addItem("first part");
cb1.setBounds(400,200,150,40);
cb1.setVisible(false);

cb2=new JComboBox();
cb2.addItem("second part");
cb2.setBounds(560,200,150,40);
cb2.setVisible(false);
fr.add(cb2);

cb3=new JComboBox();
cb3.addItem("third part");
cb3.setBounds(560+160,200,150,40);
cb3.setVisible(false);
fr.add(cb3);

cb4=new JComboBox();
cb4.addItem("fourth part");
cb4.setBounds(560+160+160,200,150,40);
cb4.setVisible(false);
fr.add(cb4);

cb5=new JComboBox();
cb5.addItem("fifth part");
cb5.setBounds(560+160+160+160,200,150,40);
cb5.setVisible(false);
fr.add(cb5);


cb6=new JComboBox();
cb6.addItem("six part");
cb6.setBounds(560+160+160+160+160,200,150,40);
cb6.setVisible(false);
fr.add(cb6);
try
{

Class.forName("oracle.jdbc.driver.OracleDriver");
connect1=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","a");
pst1=connect1.prepareStatement("select * from clips");
ResultSet rs=pst1.executeQuery();
while(rs.next())
{
cb1.addItem(new ImageIcon("clips\\"+rs.getString(1)));
cb2.addItem(new ImageIcon("clips\\"+rs.getString(2)));
cb3.addItem(new ImageIcon("clips\\"+rs.getString(3)));
cb4.addItem(new ImageIcon("clips\\"+rs.getString(4)));
cb5.addItem(new ImageIcon("clips\\"+rs.getString(5)));
cb6.addItem(new ImageIcon("clips\\"+rs.getString(6)));

}

connect1.close();
pst1.close();
}
catch(Exception ex)
{
}


b12=new JButton("CONSTRUCT");
b12.setBounds(700,600,200,40);
fr.add(b12);

b12.setVisible(false);
b12.addActionListener(this);

lface=new JLabel("");
lface.setBounds(700,300,300,189);
fr.add(lface);

lface1=new JLabel("");
lface1.setBounds(1130,300,300,189);
fr.add(lface1);
lface1.setVisible(false);
 
lup1=new JLabel();
lup1.setBounds(970,200,250,70);
lup1.setBorder(BorderFactory.createTitledBorder(""));
fr.add(lup1);
lup1.setVisible(false);


lup2=new JLabel();
lup2.setBounds(970,280,250,70);
lup2.setBorder(BorderFactory.createTitledBorder(""));
fr.add(lup2);
lup2.setVisible(false);

lup3=new JLabel();
lup3.setBounds(970,360,250,70);
lup3.setBorder(BorderFactory.createTitledBorder(""));
fr.add(lup3);
lup3.setVisible(false);

lup4=new JLabel();
lup4.setBounds(970,440,250,70);
lup4.setBorder(BorderFactory.createTitledBorder(""));
fr.add(lup4);
lup4.setVisible(false);

lup5=new JLabel();
lup5.setBounds(970,520,250,70);
lup5.setBorder(BorderFactory.createTitledBorder(""));
fr.add(lup5);
lup5.setVisible(false);

lup6=new JLabel();
lup6.setBounds(970,600,250,70);
lup6.setBorder(BorderFactory.createTitledBorder(""));
fr.add(lup6);
lup6.setVisible(false);


b=new JButton("UPLOAD");
b.setBounds(830,520,120,30);
b11=new JButton("Clip's Image");
b11.setBounds(700,520,120,30);
b11.addActionListener(this);
fr.add(b);
fr.add(b11);
fr.add(cb1);
b.setVisible(false);
lup.setVisible(false);
b11.setVisible(false);

fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
fr.setExtendedState(JFrame.MAXIMIZED_BOTH);

con=fr.getContentPane();
con.setBackground(Color.gray);
f=new Font("Palatino Linotype",Font.BOLD,40);
l1=new JLabel("	FACE IDENTIFICATION SYSTEM",SwingConstants.CENTER);
l1.setBounds(170,0,1200,150);
l1.setBorder(BorderFactory.createLineBorder(Color.black));
l1.setOpaque(true);
l1.setForeground(Color.red);
l1.setBackground(Color.pink);
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
public void actionPerformed(ActionEvent t8)
{
if(t8.getSource()==b12)
{
int i1=cb1.getSelectedIndex();
int i2=cb2.getSelectedIndex();
int i3=cb3.getSelectedIndex();
int i4=cb4.getSelectedIndex();
int i5=cb5.getSelectedIndex();

//String im1="img"+i1+".jpg";
//String im2="img"+i2+".jpg";
//String im3="img"+i3+".jpg";
//String im4="img"+i4+".jpg";
//String im5="img"+i5+".jpg";
try
{ 

Class.forName("oracle.jdbc.driver.OracleDriver");
conn1=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","a");
pst=conn1.prepareStatement("select * from clips");

rs=pst.executeQuery();
int x1=0,x2=0,x3=0,x4=0,x5=0;

while(rs.next())
{
if(x1==i1)
{

img1=rs.getString(1);
JOptionPane.showMessageDialog(null,"img1="+img1);
ImageIcon ii1=new ImageIcon("clips\\"+img1);
//l1.setIcon(ii1);
}
if(x2==i2)
{

img2=rs.getString(2);
JOptionPane.showMessageDialog(null,"img2="+img2);

ImageIcon ii2=new ImageIcon("clips\\"+img2);
//l2.setIcon(ii2);
}
if(x3==i3)
{

img3=rs.getString(3);
JOptionPane.showMessageDialog(null,"img3="+img3);

ImageIcon ii3=new ImageIcon("clips\\"+img3);
//l3.setIcon(ii3);
}
if(x4==i4)
{

img4=rs.getString(4);
JOptionPane.showMessageDialog(null,"img4="+img4);

ImageIcon ii4=new ImageIcon("clips\\"+img4);
//l4.setIcon(ii4);
}

if(x5==i5)
{

img5=rs.getString(5);
JOptionPane.showMessageDialog(null,"img5="+img5);

ImageIcon ii5=new ImageIcon("clips\\"+img5);
//l5.setIcon(ii5);
}

x1++;
x2++;
x3++;
x4++;
x5++;
}
conn1.close();
pst.close();

}

catch(Exception e453)
{
}
try
{


FileInputStream file1= new FileInputStream("clips\\"+img1);
FileInputStream file2= new FileInputStream("clips\\"+img2);
FileInputStream file3= new FileInputStream("clips\\"+img3);
FileInputStream file4= new FileInputStream("clips\\"+img4);
FileInputStream file5= new FileInputStream("clips\\"+img5);

BufferedImage img1=ImageIO.read(file1);
BufferedImage img2=ImageIO.read(file2);
BufferedImage img3=ImageIO.read(file3);
BufferedImage img4=ImageIO.read(file4);
BufferedImage img5=ImageIO.read(file5);


int widthImg1=img1.getWidth();
int heightImg1=img1.getHeight();
int widthImg2=img2.getWidth();
int heightImg2=img2.getHeight();
int widthImg3=img3.getWidth();
int heightImg3=img3.getHeight();
int widthImg4=img4.getWidth();
int heightImg4=img4.getHeight();
int widthImg5=img5.getWidth();
int heightImg5=img5.getHeight();

BufferedImage img=new BufferedImage(widthImg1,heightImg1+heightImg2+heightImg3+heightImg4+heightImg5,BufferedImage.TYPE_INT_RGB);
img.createGraphics().drawImage(img1,0,0,null);
img.createGraphics().drawImage(img2,0,heightImg1,null);
img.createGraphics().drawImage(img3,0,heightImg1+heightImg2,null);
img.createGraphics().drawImage(img4,0,heightImg1+heightImg2+heightImg3,null);
img.createGraphics().drawImage(img5,0,heightImg1+heightImg2+heightImg3+heightImg4,null);

fin=String.valueOf(Math.random()*100000000+234);
File final_image=new File("face\\img1d"+fin+".jpg");

boolean final_image_drawing=ImageIO.write(img,"jpeg",final_image);
lface.setIcon(new ImageIcon("face\\img1d"+fin+".jpg"));
}
catch(Exception ex)
{
JOptionPane.showMessageDialog(null,"Failedvcb:"+ex);
}
}


if(t8.getSource()==b11)
{
int id=0;

try
{

Class.forName("oracle.jdbc.driver.OracleDriver");
connect1=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","a");
pst1=connect1.prepareStatement("select id from clips");
ResultSet rs=pst1.executeQuery();
while(rs.next())
{
id++;
}

connect1.close();
pst1.close();
}
catch(Exception ex)
{
}

try{

File file=new File(str);
FileInputStream fis=new FileInputStream(file);
BufferedImage image=ImageIO.read(fis);
int rows=6;
int cols=1;
int chunks=rows*cols;
int chunkswidth=image.getWidth()/cols;
int chunksHeight=image.getHeight()/rows;
int count=0;
BufferedImage imgs[]=new BufferedImage[chunks];
for(int x=0;x<rows;x++)
{
for(int y=0;y<cols;y++)
{
imgs[count]=new BufferedImage(chunkswidth,chunksHeight,image.getType());
Graphics2D gr=imgs[count++].createGraphics();
gr.drawImage(image,0,0,chunkswidth,chunksHeight,chunkswidth*y,chunksHeight*x,chunkswidth*y+chunkswidth,chunksHeight*x+chunksHeight,null);
gr.dispose();
}
}


for(int i=0;i<imgs.length;i++)
{
Class.forName("oracle.jdbc.driver.OracleDriver");
connect=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","a");
count1=Math.random();
ImageIO.write(imgs[i],"jpg",new File("clips\\img"+count1+".jpg"));
str1[k1]="img"+count1+".jpg";
k1++;
}
pst1=connect.prepareStatement("insert into clips values(?,?,?,?,?,?,?)");
pst1.setString(1,str1[0]);
pst1.setString(2,str1[1]);
pst1.setString(3,str1[2]);
pst1.setString(4,str1[3]);
pst1.setString(5,str1[4]);
pst1.setString(6,str1[5]);
pst1.setInt(7,(id+1));
pst1.executeUpdate();
connect.close();
k1=0;

lup1.setIcon(new ImageIcon("clips\\"+str1[0]));
lup2.setIcon(new ImageIcon("clips\\"+str1[1]));
lup3.setIcon(new ImageIcon("clips\\"+str1[2]));
lup4.setIcon(new ImageIcon("clips\\"+str1[3]));
lup5.setIcon(new ImageIcon("clips\\"+str1[4]));
lup6.setIcon(new ImageIcon("clips\\"+str1[5]));

JOptionPane.showMessageDialog(null,"Splitting Done");
}
catch(Exception jh)
{
JOptionPane.showMessageDialog(null,"failed="+jh);
}

lup1.setVisible(true);
lup2.setVisible(true);
lup3.setVisible(true);
lup4.setVisible(true);

lup5.setVisible(true);
lup6.setVisible(true);

}
}


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
//Timer t=new Timer(1000,new ClockListener());
//t.start();
}

class Home extends JPanel implements ActionListener
{
JLabel lbl_picint,lbl_pic3;
int x=1000;
JButton b1,b2,b3,b4;

Home()
{
JPanel p;
p=new JPanel();
p.setLayout(new GridLayout(3,1));
p.setBounds(250,250,150,150);
p.setBorder(BorderFactory.createTitledBorder(""));	

 b1=new JButton("construct image");
b1.setBounds(200,200,200,50);
b2=new JButton("clip's image");
b2.setBounds(200,300,200,50);
b3=new JButton("match");
b3.setBounds(200,400,200,50);
b4=new JButton("Back");
b4.setBounds(200,500,200,50);
p.add(b1);
p.add(b2);
p.add(b3);
p.add(b4);
fr.add(b1);
fr.add(b2);
fr.add(b3);
fr.add(b4);

fr.add(p);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this); 
b4.addActionListener(this);
b.addActionListener(this);
}
public void actionPerformed(ActionEvent k8888)
{
if(k8888.getSource()==b1)
 {
lup.setVisible(false);
lup1.setVisible(false);
lup2.setVisible(false);
lup3.setVisible(false);
lup4.setVisible(false);
lup5.setVisible(false);
lup6.setVisible(false);

b.setVisible(false);
b11.setVisible(false);
cb1.setVisible(true);
cb2.setVisible(true);
cb3.setVisible(true);
cb4.setVisible(true);
cb5.setVisible(true);
cb6.setVisible(true);
b12.setVisible(true);
}
if(k8888.getSource()==b1)
 {
cb1.setVisible(true);
cb2.setVisible(true);
cb3.setVisible(true);
cb4.setVisible(true);
cb5.setVisible(true);
cb6.setVisible(true);
b12.setVisible(true);
}

if(k8888.getSource()==b2)
{
b.setVisible(true);
lup.setVisible(true);
b11.setVisible(true);
cb1.setVisible(false);
cb2.setVisible(false);
cb3.setVisible(false);
cb4.setVisible(false);
cb5.setVisible(false);
cb6.setVisible(false);
b12.setVisible(false);
lface.setVisible(false);
}

if(k8888.getSource()==b3)
{
int i=0,i1=0,lk=0;
float max=0.0f;
int count=0;
String ar[]=new String [100];
float f[]=new float [100];

try
{
str="face\\img1d"+fin+".jpg";

JOptionPane.showMessageDialog(null,"OK="+str);
FileInputStream files=new FileInputStream("face\\img1d"+fin+".jpg");
			
BufferedImage image=ImageIO.read(files);
int width=image.getWidth(null);
int height=image.getHeight(null);
int[][] clr=new int[width][height];
Class.forName("oracle.jdbc.driver.OracleDriver");
Connection conn1=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","a");
PreparedStatement pst=conn1.prepareStatement("select * from stu3");
ResultSet rs=pst.executeQuery();
while(rs.next())
{
String p=rs.getString(2);
ar[i]=p;
i++;
String img12=rs.getString(6);
JOptionPane.showMessageDialog(null,"path="+img12);						
FileInputStream file=new FileInputStream(img12);
JOptionPane.showMessageDialog(null,"ok2");
BufferedImage image1=ImageIO.read(file);
int width1=image1.getWidth(null);
int height1=image1.getHeight(null);
int[][] clr1=new int[width1][height1];
int iw=0,ih=0,k1=0;
//calculating the smallest value among width and height
if(width>width1)
iw=width1;
else
iw=width;
if(height>height1)
ih=height1;
else 
ih=height;
//checking number of pixels similarity
for(int a=0;a<iw;a++)
{
for(int b=0;b<ih;b++)
{
clr1[a][b]=image1.getRGB(a,b);
					
clr[a][b]=image.getRGB(a,b);
						
if(clr[a][b]==clr1[a][b])
						
{
						
k1=k1+1;
					
}
}
}
float ss=(iw*ih);
//calculating percentage
float x=(k1/ss)*100;
f[i1]=x;
i1++;
count++;
				
}
				
max=0;
				
for(lk=0;lk<i1;lk++)
				
{
					
if(max<=f[lk])

{
					
max=f[lk];

					
}
				
}

				
for(lk=0;lk<i1;lk++)
					
{
				
						
if(f[lk]==max)
						
{
							
JOptionPane.showMessageDialog(null,"your image maximum matched with MobileNo="+ar[lk]+" and percentage matched="+max+"%");
try
{
Class.forName("oracle.jdbc.driver.OracleDriver");
Connection conn11=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","a");
PreparedStatement pst1=conn1.prepareStatement("select * from stu3");
ResultSet rs1=pst.executeQuery();
while(rs1.next())
{
String p1=rs1.getString(2);
if(p1==ar[lk])
{
lface1.setVisible(true);
lface1.setIcon(new ImageIcon(rs.getString(6)));
}
}
}
catch(Exception k90)
{
System.out.println("Failed="+k90);
}							
break;
						
}
					
}
					
				
}
				
catch(Exception hj)
					
{
JOptionPane.showMessageDialog(null,"failed1:"+hj.getMessage());
					
}

}
if(k8888.getSource()==b4)
{
fr.dispose();
new design();
}
if(k8888.getSource()==b)
{
JFileChooser obj=new JFileChooser();
obj.showOpenDialog(this);
File f=obj.getSelectedFile();
 str=f.getPath();
lup.setIcon(new ImageIcon(str));
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
public static void main(String s[])
{
new operator();
//obj.fun_date();
}
}

