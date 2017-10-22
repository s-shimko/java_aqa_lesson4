import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Task4MatrixLinesChange {

	public static void main(String[] args) throws Exception {

		int twoDim[][] = { { 1, 2 }, { 3, 4 }, { 5, 6, 7 } };

		System.out.println("Two dimensional array: ");
		for (int[] arr : twoDim) {
			System.out.println(Arrays.toString(arr));
		}

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("What numbers of lines in array to swap? Enter first and second:");
		int firstLine = Integer.parseInt(in.readLine()) - 1;
		int secondLine = Integer.parseInt(in.readLine()) - 1;

		System.out.println(Arrays.toString(twoDim[0]));

		System.out.println(twoDim.length);

		int[] temp = twoDim[firstLine];
		twoDim[firstLine] = twoDim[secondLine];
		twoDim[secondLine] = temp;

		System.out.println("Two dimensional array after substitute: ");
		for (int[] arr : twoDim) {
			System.out.println(Arrays.toString(arr));
		}

	}

}
