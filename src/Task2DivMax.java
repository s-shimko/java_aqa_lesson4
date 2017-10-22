import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;

public class Task2DivMax {

	public static void main(String[] args) {

		int[] array = new int[] { 327, 381, 891, 918, 212, 848, 770, 363, 416, 736 };
		int max = findMax(array);

		ArrayList<Float> newArray = new ArrayList<>();
		newArray = divisionOnMax(array);

		System.out.println("Array: " + Arrays.toString(array));
		System.out.println("Max: " + max);
		System.out.println("Array after division on max: " + newArray);

	}

	public static int findMax(int[] array) {
		int temp = 0;
		for (int i = 0; i < array.length; i++) {
			if (temp < array[i]) {
				temp = array[i];
			}
		}
		return temp;
	}

	public static ArrayList<Float> divisionOnMax(int[] array) {
		float max = findMax(array);
		float result = 0.0f;
		System.out.println(max);
		ArrayList<Float> newArray = new ArrayList<Float>();

		for (int i = 0; i < array.length; i++) {
			result = array[i] / max;
			newArray.add(result);
			i++;
		}
		return newArray;
	}
}