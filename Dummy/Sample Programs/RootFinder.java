public class RootFinder {

	public static void main(String[] args) {

		Double num = new Double(81), root = new Double(5), start = new Double(0), end = num, i, number, tmpVar,
				result = (start + end) / 2;

		for (i = 1.0; i < 1000000; i++) {

			number = (start + end) / 2;
			result = number;
			tmpVar = Math.pow(number, root);

			if (tmpVar == num) {
				result = number;
				break;
			} else if (tmpVar < num) {
				start = (start + end) / 2;
			} else if (tmpVar > num) {
				end = (start + end) / 2;
			}

		}

		System.out.println(root + " root of " + num + " is " + result);

		double check = Math.pow(result, root);

		System.out.println("(" + result + ")^" + root + " = " + check);

	}
}