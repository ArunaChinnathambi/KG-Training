import java.io.*;
class Studentinfo implements Serializable 
{
 String name;
 int rid;
 static String contact;
 Studentinfo(String n, int r, String c)
 {
  this.name = n;
  this.rid = r;
  this.contact = c;
 }
}

class Ser
{
 public static void main(String[] args)
 {
 try
 {
  Studentinfo si = new Studentinfo("Abhi", 104, "110044");
  FileOutputStream fos = new FileOutputStream("student.ser");
  Objectoutputstream oos = new ObjectOutputStream(fos);
  oos.writeObject(si);
  oos.close();
  fos.close();
  }
  catch (Exception e)
  { e. printStackTrace(); }
 }
}