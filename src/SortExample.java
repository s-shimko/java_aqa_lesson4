import java.util.Arrays;

//1.Алгоритм "Сортировка выбором".
public class SortExample {

	public static void main(String[] args) {

		int a[] = new int[] { 1, 55, 6, 7, 6, 79, 88, 33 };

		int min, temp;
		for (int i = 0; i < a.length - 1; i++) {
			min = i;
			for (int j = i + 1; j < a.length; j++) {
				if (a[j] < a[min]) {
					min = j;
				}
				temp = a[min];
				a[min] = a[i];
				a[i] = temp;
			}
		}
		System.out.println(Arrays.toString(a));
	}
}
