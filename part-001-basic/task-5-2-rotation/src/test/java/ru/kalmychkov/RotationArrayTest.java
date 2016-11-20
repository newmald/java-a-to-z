package ru.kalmychkov;

import org.junit.Assert;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;

/**
 * Тест поворота двумерного массива на 90 градусов.
 * @author Алексей Калмычков
 * @since 20.11.2016
 * @version 1.0
 */
public class RotationArrayTest {
    /**
     * whenAddTwoArrayThenRotate - метод поворота двумерного массива на 90 градусов.
     */
    @Test
    public void whenAddTwoArrayThenRotate() {
        final int[][] values = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        RotationArray rotationArray = new RotationArray();
        final int[][] resultArray = rotationArray.rotation(values);
        final int[][] expectArray = {
                {3, 6, 9},
                {2, 5, 8},
                {1, 4, 7}
        };
        Assert.assertThat(resultArray, is(expectArray));
    }
}