import java.util.Arrays;

public class Task5MaxInMatrix {

	public static void main(String[] args) {
		int m[][] = { { 1, 2, 8, 45 }, { 3, 4, 9, 55 }, { 5, 6, 7, 4 }, { 5, 6, 7, 4 } };

		for (int[] p : m) {
			System.out.println(Arrays.toString(p));
		}

		for (int i = 0; i < m.length; i++) {
			int temp = m[i][0];
			for (int j = 0; j < m[i].length; j++) {
				if (temp < m[i][j]) {
					temp = m[i][j];
				}
			}
			System.out.println(temp);
		}
	}
}
