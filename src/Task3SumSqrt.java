import java.util.ArrayList;
import java.util.Arrays;

public class Task3SumSqrt {

	public static void main(String[] args) {
		int[] a = new int[] { 3, 8, 1, 9, 8, 7, 3, 6, 6, -3, -8, -1, -9, -8, -7, -3, -6, -6, 6, -3 };
		ArrayList<Integer> b = new ArrayList<>();

		for (int i = 2; i < a.length; i = i + 2) {
			if(a[i] > 0 ) {
				b.add(a[i]);
			}
		}
		
		int sum = 0;
		for (int i =0; i < b.size(); i++) {
			sum = sum + b.get(i) * b.get(i);
		}
		
		System.out.println(sum);
	}

}
