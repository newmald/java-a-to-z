package ru.kalmychkov;

/**
 * Пузырьковая сортировка массива.
 * @author Алексей Калмычков
 * @since 14.11.2016
 * @version 1.0
 */

public class BubbleSort {
	/**
	 * sort - метод сортировки массива.
	 * @param values - массив, который необходимо отсортировать
	 * @return - сохраняется отсортированный массив
	 */
	public int[] sort(int[] values) {
		for (int i = 0; i < values.length - 1; i++) {
			for (int j = 0; j < values.length - 1 - i; j++) {
				if (values[j] > values[j + 1]) {
					int temp = values[j + 1];
					values[j + 1] = values[j];
					values[j] = temp;
				}
			}
		}
		return values;
	}
}