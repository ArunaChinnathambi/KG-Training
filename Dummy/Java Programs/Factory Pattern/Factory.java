public class Factory {
    Phone ph;

    Phone getPhone(String temp) {
        switch (temp) {
        case Data.iPhone:
            ph = new Phone().setModel(Data.iPhone).setPrice(300.00).setScreen(4.7);
            break;
        case Data.samsung:
            ph = new Phone().setModel(Data.samsung).setPrice(7000);
            break;
        case Data.sony:
            ph = new Phone().setModel(Data.sony);
            break;
        }
        return ph;
    }
}