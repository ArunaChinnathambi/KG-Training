public class Phone implements PhoneDesign {
    String model;
    double price, screen;

    Phone setModel(String temp) {
        model = temp;
        return this;
    }

    @Override
    public void functionality() {
        System.out.println(model+" is created");
    }

    Phone setPrice(double temp) {
        price = temp;
        return this;
    }

    Phone setScreen(double temp) {
        screen = temp;
        return this;
    }

    public String toString() {
        return "'" + model + "'" + price + "'" + screen;
    }
}