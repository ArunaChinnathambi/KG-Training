class Function3 {
    void eat1() {
        System.out.println("1");
    }
}

class Function2 extends Function3 {
    //@Override
    void eat() {
        System.out.println("2");
    }
}

class Function1 extends Function2 {
//@Override
    void eat() {
        System.out.println("9");
    }

}

class Function extends Function1 {
    public static void main(String[] args) {
        Function fn = new Function();
        fn.eat();
    }
}
