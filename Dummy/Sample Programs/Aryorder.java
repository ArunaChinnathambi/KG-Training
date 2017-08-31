import java.util.Scanner;
import java.util.Arrays;

public class Aryorder {
	
	static int i, size, ins, pos, current, updt, del, count = 0;
	static Integer arr[] = new Integer[50];

	public static void main(String args[]) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("enter the size:");
		
		size = s.nextInt();
		
		System.out.println("Enter ur choice:");
		System.out.println("1.insert \n 2.delete\n3.update");
		
		int c = s.nextInt();
		
		switch (c) {
		case 1: {
			System.out.println("Enter ur Elements:");
			for (i = 0; i < size; i++) {
				arr[i] = s.nextInt();
			}
			System.out.println("position?:");
			pos = s.nextInt();
			System.out.println("new Element:");
			ins = s.nextInt();

			for (i = size; i > pos; i--) {
				arr[i] = arr[i - 1];
					}
			arr[pos] = ins;
			for (int x = 0; x < 50; x++) {
				if (arr[x] != null)
					System.out.print(arr[x] + " ");
			}
			break;
		}
		case 2: {
			System.out.println("position?:");
			pos = s.nextInt();
			System.out.println("current Element:");
			current = s.nextInt();
			System.out.println("update Element:");
			updt = s.nextInt();

			for (i = size; i > pos; i--) {
				if (arr[i] == current) {
					arr[i] = updt;
				}
			}
			arr[pos] = ins;
			for (int x = 0; x < size + 1; x++) {
				System.out.println(arr[x]);
			}

		}
		case 3: {
			int count = 0;
			System.out.print("Enter Element to be Delete : ");
			del = s.nextInt();
			for (i = 0; i < size; i++) {
				if (arr[i] == del) {
					for (int j = i; j < (size - 1); j++) {
						arr[j] = arr[j + 1];
					}
					count++;
					break;
				}
			}
			System.out.println(Arrays.toString(arr));
		}
		}
	}

}