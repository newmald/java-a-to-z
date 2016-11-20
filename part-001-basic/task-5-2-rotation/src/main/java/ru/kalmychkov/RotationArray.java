package ru.kalmychkov;

/**
 * Программа поворота двухмерного квадратного массива на 90 градусов.
 * @author Алексей Калмычков
 * @since 20.11.2016
 * @version 1.0
 */
public class RotationArray {
	/**
     * rotation - метод поворота массива.
     * @param values - массив, который необходимо повернуть
     * @return - сохраняется массив
     */
	public int[][] rotation(int[][] values) {
		for (int i = 0; i < values.length / 2; i++) {
			for (int j = i; j < values.length - 1 - i; j++) {
				int temp = values[i][j];
                values[i][j] = values[j][values.length - 1 - i];
                values[j][values.length - 1 - i] = values[values.length - 1 - i][values.length - 1 - j];
                values[values.length - 1 - i][values.length - 1 - j] = values[values.length - 1 - j][i];
                values[values.length - 1 - j][i] = temp;
            }
		}
        return values;
	}
}