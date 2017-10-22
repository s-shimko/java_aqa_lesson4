import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Task6TwoDimCountX {

	public static void main(String[] args) throws Exception {
		int m[][] = { { 1, 2, 8, 45 }, { 3, 1, 9, 55 }, { 9, 1, 17, 4 }, { 5, 6, 7, 2 } };
		for (int i = 0; i < m.length; i++) {
			System.out.println(Arrays.toString(m[i]));
		}

		System.out.println("We have twoDim array, choose number to count:");
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int x = Integer.parseInt(in.readLine());

		int count = 0;
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				if (x == m[i][j]) {
					count++;
				}
			}

		}
		System.out.println("Number " + x + " count: " + count);
	}

}
