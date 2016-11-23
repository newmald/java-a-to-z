package ru.kalmychkov;

import java.util.Arrays;
/**
 * Удаление дубликатов в массиве.
 * @author Алексей Калмычков
 * @since 23.11.2016
 * @version 1.0
 */
public class RemoveDuplicate {
    /**
     * removeCopy - метод удаления дубликатов массива.
     * @param name - массив, в котором необходимо найти дубликаты
     * @return - сохраняется копию массива без дубликатов, количество дубликатов отсекается переменной counter
     */
    public String[] removeCopy(String[] name) {
        int counter = 0;
        for (int i = 0; i < name.length; i++) {
            for (int n = i + 1; n < name.length; n++) {
                if (name[i] != null && name[n] != null && name[n].equals(name[i])) {
                    name[n] = null;
                    counter++;
                }
            }
        }
        for (int i = name.length - 1; i > 0; i--) {
            for (int n = 0; n < i; n++) {
                if (name[n] == null) {
                    name[n] = name[n + 1];
                    name[n + 1] = null;
                }
            }
        }
        return Arrays.copyOf(name, name.length - counter);
    }
}