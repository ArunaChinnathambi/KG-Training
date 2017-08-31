class Book {
private int id;
private String name, author, publiser;
private int quantity;

public Book(int id, String name, String author, String publiser, int quantity) {
this.id = id;
this.name = name;
this.author = author;
this.publiser = publiser;
this.quantity = quantity;
}

public void setName(String name) {
this.name = name;
}

public String getName(){
return name;
}

@Override
public String toString() {
return "id : " + id + ", name : " + name + ", author : " + author + ", publiser : " + publiser + ", quantity : "
+ quantity;
}
}
