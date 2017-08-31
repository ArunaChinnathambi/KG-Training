import java.util.*;

public class StudentDetails{

    static Scanner scan = new Scanner(System.in);
    static ArrayList<Data> d = new ArrayList<Data>();

    public static void main(String[] args) {
        while(true){
            System.out.println("\nChoose an option\n1.Enter Details\n2.Show Details\n3.Exit");
            switch(scan.nextInt()){
                case 1:
                    setDetails();
                break;
                case 2:
                    getDetails();
                break;
                case 3:
                    System.exit(0);
                break;
                default:
                    System.out.println("Input Error, please try again");
            }
        }
    }
    static void setDetails() {

        String name;
        int age, phone;
        double height;

        name = System.console().readLine("Name : \n");

        System.out.println("Age : ");
        age = scan.nextInt();

        System.out.println("Phone : ");
        phone = scan.nextInt();

        System.out.println("Height : ");
        height = scan.nextDouble();

        d.add(new Data().setName(name).setAge(age).setPhone(phone).setHeight(height));
    }

    static void getDetails() {
        System.out.println("Total Details");
        for (Data dd : d) {
            System.out.println(dd);
        }
    }
}

class Data {
    private String name;
    private int age, phone;
    private double height;

    Data setName(String temp) {
        name = temp;
        return this;
    }

    Data setAge(int temp) {
        age = temp;
        return this;
    }

    Data setPhone(int temp) {
        phone = temp;
        return this;
    }

    Data setHeight(double temp) {
        height = temp;
        return this;
    }

    public String toString() {
        return "\nName - " + name + "\nAge - " + age + "\nPhone - " + phone + "\nHeight - " + height;
    }
}