package ru.kalmychkov;

/**
 * Создание массива из двух отсортированных одномерных массивов.
 * @author Алексей Калмычков
 * @since 30.11.2016
 * @version 1.0
 */
public class SortingArrays {
    /**
     * Метод создания массива из двух отсортированных массивов.
     * @param arrayOne - первый массив
     * @param arrayTwo - второй массив
     * @return result - сохраняем созданный третий массив
     */
    public int[] sorting(int[] arrayOne, int[] arrayTwo) {
        int indexOne = 0;
        int indexTwo = 0;
        int[] result = new int[arrayOne.length + arrayTwo.length];

        for (int i = 0; i < result.length; i++) {
            if (indexOne >= arrayOne.length) {
                result[i] = arrayTwo[indexTwo];
                indexTwo++;
            } else if (indexTwo >= arrayTwo.length) {
                result[i] = arrayOne[indexOne];
                indexOne++;
            } else if (arrayOne[indexOne] < arrayTwo[indexTwo]) {
                result[i] = arrayOne[indexOne];
                indexOne++;
            } else {
                result[i] = arrayTwo[indexTwo];
                indexTwo++;
            }
        }
        return result;
    }
}