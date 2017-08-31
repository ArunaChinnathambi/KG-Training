import java.util.Random;

public class RandSkip {
	public static void main(String... args) {
		Random rand = new Random();
		int a, i = 0;
		while (((a = rand.nextInt(10)) != 5) && i < 100) {
			i++;
			System.out.println(a);
		}
	}
}