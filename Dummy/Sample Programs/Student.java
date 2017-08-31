class Student{  
    int id;  
    String name;  
    int age;  
    Student(int i,String n){  
    id = i;  
    name = n;  
    }  
    
    Student(int a,String b,int c)
    {
        id=a;
        name=b;
        age=c;
    }
    void display(){System.out.println(id+" "+name+" "+age);}  
   
    public static void main(String args[]){  
    Student s1 = new Student(111,"Karan");  
  //  Student  s2 = new Student(222,"Aryan",25);  
    Student  s3= new Student(2,"Aryan",5);  
    s1.display();  
   // s2.display(); 
    s3.display(); 
   }  
}  