import java.util.*;  
 class Book {  
int id;  
String name,author,publisher;  
int quantity;  
public Book(int id, String name, String author) {  
    this.id = id;  
    this.name = name;  
    this.author = author;  
     
}
 }
class Student extends Book
{
    int sid;
    String sname,sname2;
    Student(int sid, String sname, String sname2){
        this.sid=sid;
        this.sname=sname;
        this.sname2=sname2;
    }

}  
class Aray {  
public static void main(String[] args) {  

   ArrayList<Student> list=new ArrayList<Student>();  
    
    Student b1=new Student(101,"Let us C", "Let us C");  
   
    
    list.add(b1);  
    
  
    
    for(Book b:list){  
        System.out.println(b.id+" "+b.name+" "+b.author);  
    }  
}  
}  