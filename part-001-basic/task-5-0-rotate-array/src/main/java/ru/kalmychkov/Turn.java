package ru.kalmychkov;

/**
 * Поворот массива.
 * @author Алексей Калмычков
 * @since 19.11.2016
 * @version 1.0
 */
public class Turn {
    /**
     * back - метод поворота массива.
     * @param values - массив, который необходимо повернуть
     * @return - сохраняется массив
     */
    public int[] back(int[] values) {
        for (int i = 0; i < values.length / 2; i++) {
            int tmp = values[i];
            values[i] = values[values.length - i - 1];
            values[values.length - i - 1] = tmp;
        }
        return values;
    }
}