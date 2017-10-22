import java.util.Arrays;

public class Task1ArraySwapElements {

	public static void main(String[] args) {
		double[] array = new double[] { 0.92, 1.00, 0.42, 0.40, 0.48 };
		System.out.println(Arrays.toString(array));

		double min = findMin(array);
		double max = findMax(array);

		int index_min = 0;
		int index_max = 0;

		for (int i = 0; i < array.length; i++) {

			if (array[i] == min) {
				index_min = i;
			}
			if (array[i] == max) {
				index_max = i;
			}
		}

		System.out.println(min + " " + max);

		double temp = 0;
		temp = array[index_min];
		array[index_min] = array[index_max];
		array[index_max] = temp;

		System.out.println(Arrays.toString(array));

	}

	public static double findMax(double[] array) {
		double temp = array[0];
		for (int i = 0; i < array.length; i++) {
			if (temp < array[i]) {
				temp = array[i];
			}
		}
		return temp;
	}

	public static double findMin(double[] array) {
		double temp = array[0];
		for (int i = 0; i < array.length; i++) {
			if (temp > array[i]) {
				temp = array[i];
			}
		}
		return temp;
	}
}
