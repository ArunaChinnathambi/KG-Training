public class Builderssss{
    public static void main(String args[]){
        thisOne t1 = new thisOne();

        t1.setA(1).setB(2).setC(3);

        System.out.println(t1.a);
        System.out.println(t1.b);
        System.out.println(t1.c);
    }
}

class thisOne{

    int a,b,c;

    thisOne setA(int i){
        a=i;
        return this;
    }

    thisOne setB(int i){
        b=i;
        return this;
    }
    
    thisOne setC(int i){
        c=i;
        return this;
    }
}