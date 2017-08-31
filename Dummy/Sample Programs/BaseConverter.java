public class BaseConverter {
	
	public static void main(String[] args) {
	
		System.out.println(rootFinder(32768, 2, false));
		System.out.println(rootFinder(99, 36, true));
	}

	static int rootFinder(int num, int base, boolean toDecimal) {
	
		int result = 0;
	
		if (toDecimal) {
	
			for (int i = 0; num > 0; i++, num /= 10) {
	
				result = result + (int) ((num % 10) * Math.pow(base, i));
	
			}
	
		} else {
	
			for (int i = 0; num > 0; i++, num /= base) {
	
				result = result + (int) ((num % base) * Math.pow(10, i));
	
			}
		}
		return result;
	}
}