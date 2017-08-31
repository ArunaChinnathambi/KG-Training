public class DosCommand {
    public static void main(String a[]) {
        try {
            Runtime.getRuntime().exec("cmd /c start calc");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}