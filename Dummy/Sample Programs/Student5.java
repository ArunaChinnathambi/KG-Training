class Student5{  
 int rollno;  
 String name;  
 String city;  
 int phon;
 int clgno;
  
 Student5(int rollno, String name, String city,int phon,int clgno){  
 this.rollno=rollno;  
 this.name=name;  
 this.city=city;  
 this.phon=phon;
 this.clgno=clgno;
 }  
   
public String toString()
{ 
  return rollno;
  //return rollno+" "+name+" "+city+" "+phon+" "+clgno;  
 }  

 public static void main(String args[]){  
   Student5 s1=new Student5(101,"Raj","lucknow",89889,1682);  
    
     
  System.out.println(s1);
  //System.out.println(s1.rollno);

   
 }  
}  