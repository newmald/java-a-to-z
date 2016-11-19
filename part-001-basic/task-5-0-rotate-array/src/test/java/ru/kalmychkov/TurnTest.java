package ru.kalmychkov;

import org.junit.Assert;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;

/**
 * Тест поворота массива.
 * @author Алексей Калмычков
 * @since 19.11.2016
 * @version 1.0
 */
public class TurnTest {
    /**
     * whenAddArrayThenRotateArray - метод проверки поворота.
     */
    @Test
    public void whenAddArrayThenRotateArray() {
        final int[] values = {1, 2, 3, 4};
        Turn turn = new Turn();
        final int[] resultArray = turn.back(values);
        final int[] expectArray = {4, 3, 2, 1};
        Assert.assertThat(resultArray, is(expectArray));
    }
}