class ShallowCopy {
    public static void main(String[] args) {
        Abc obj = new Abc();
        Abc obj1=new Abc();
       obj.i = 5;
       obj.j = 6;
        //Abc obj1 = obj;
      //obj.j = 10;
     // obj1.i=obj.i;
      obj1.j=obj.j;

        System.out.println(obj);
        System.out.println(obj1);

        obj1.i=10;
          System.out.println(obj);
        System.out.println(obj1);

    }
}

class Abc {
    int i;
int j;

    @Override
    public String toString() {
        return "Abc(" + "i=" + i + ",j=" + j + ')';
    }
}
