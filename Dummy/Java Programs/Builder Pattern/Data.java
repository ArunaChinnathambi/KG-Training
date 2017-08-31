public class Data {
    private int phone, age;
    private double height;
    private String name;
    private boolean hasEyeSite;

    Data setPhone(int temp) {
        phone = temp;
        return this;
    }

    Data setAge(int temp) {
        age = temp;
        return this;
    }

    Data setHeight(double temp) {
        height = temp;
        return this;
    }

    Data setName(String temp) {
        name = temp;
        return this;
    }

    Data setHasEyeSighData(boolean temp) {
        hasEyeSite = temp;
        return this;
    }

    public String toString() {
        return "Name : " + name + "\nAge : " + age + "\nHeight : " + height + "\nPhone : " + phone
                + "\nEye Sight Status : " + hasEyeSite + "\n\n***************\n";
    }

    void details() {
        System.out.println(this);
    }

}