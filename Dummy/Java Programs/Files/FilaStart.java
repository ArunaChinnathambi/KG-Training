import java.io.*;

public class FilaStart {
    public static void main(String... a) {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        int c;

        try {
            fis = new FileInputStream("inTxt.txt");
            fos = new FileOutputStream("outTxt.txt");
            while ((c = fis.read()) != -1) {
                System.out.print((char) c);
                fos.write(c);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                    fos.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}