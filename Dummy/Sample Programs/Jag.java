public class Jag {
	public static void main(String args[]) {

		int[] OneDimensionalArray1 = { 1, 2, 3 };

		int[] oneDimensionalArray2 = { 4, 5, 6, 7 };

		int[] oneDimensionalArray3 = { 8, 9, 10, 11, 12 };

		int[][] twoDimensionalArray = { OneDimensionalArray1, oneDimensionalArray2, oneDimensionalArray3 };

		for (int i = 0; i < twoDimensionalArray.length; i++) {
			for (int j = 0; j < twoDimensionalArray[i].length; j++) {
				System.out.print(twoDimensionalArray[i][j] + "\t");
			}
			System.out.println();
		}
	}
}