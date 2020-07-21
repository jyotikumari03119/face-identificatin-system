import java.sql.*;
class input
{
public static void main(string arg[])
{
Scanner s=new Scanner(System.in);
int r,f;
String name,course;
Connection conn;
PreparedStatement pst;
try
{
class.for.Name("oracle.jdbc.driver.OracleDriver");
conn=DriverManager.getConnection("jdbc:Oracle:thin:@localhost:1521:Xe","system","a");
pst=connprepareStatement("Insert into stu values(?,?,?,?);
name=s.next();
r=s.nextInt();
course=s.next();
f=s.nextInt();
pst.setString(1,name);
pst.setString(2,name);
pst.setString(3,course);
pst.setString(4,f);
pst.executeUpdate();
system.out.println("data save");
conn.close();
pst.close();
}
catch(Exception e)
{
system.out.println(e);
}
}
}
