public class FactorFinder {
	public static void main(String args[]) {
		for (int i = 1; i <= 200; i++) {
			while ((100 % i) == 0) {
				System.out.println(i);
				i++;
			}
		}
	}
}