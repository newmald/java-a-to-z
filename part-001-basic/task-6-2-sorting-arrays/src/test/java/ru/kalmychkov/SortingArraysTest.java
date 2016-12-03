package ru.kalmychkov;

import org.junit.Assert;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;

/**
 * Тест создания массива из двух отсортированных одномерных массивов.
 * @author Алексей Калмычков
 * @version 1.0
 * @since 30.11.2016
 */
public class SortingArraysTest {
    /**
     * whenAddTwoArraysThenCreateArray - метод проверки создания массива из двух отсортированных массивов.
     */
    @Test
    public void whenAddTwoSortedArraysThenCreateArray() {
        final int[] arrayOne = {0, 2, 4, 6, 8};
        final int[] arrayTwo = {1, 3, 5, 7, 9};
        final int[] expected = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        SortingArrays sortingArrays = new SortingArrays();
        int[] result = sortingArrays.sorting(arrayOne, arrayTwo);
        Assert.assertThat(result, is(expected));
    }
}