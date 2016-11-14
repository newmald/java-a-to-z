package ru.kalmychkov;

import org.junit.Assert;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;

/**
 * Тест пузырьковой сортировки массива.
 * @author Алексей Калмычков
 * @since 14.11.2016
 * @version 1.0
 */
public class BubbleSortTest {
	/**
	 * whenAddArrayThenBubbleSort - метод проверки сортировки.
	 */
	@Test
	public void whenAddArrayThenBubbleSort() {
		final int[] values = {5, 7, 1, 9, 2, 3, 6, 4, 8};
		BubbleSort bubbleSort = new BubbleSort();
		final int[] result = bubbleSort.sort(values);
		final int[] expected = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		Assert.assertThat(result, is(expected));
	}
}