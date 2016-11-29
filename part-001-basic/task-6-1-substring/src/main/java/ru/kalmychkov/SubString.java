package ru.kalmychkov;

/**
 * Поиск подстроки в строке.
 * @author Алексей Калмычков
 * @since 29.11.2016
 * @version 1.0
 */
public class SubString {
    /**
     * contain - метод, принимающий две строки. Преобразовывает их в массивы символов и ищет подстроку.
     * @param origin - строка
     * @param sub - подстрока
     * @return result - сохраняем булево значение, которое подтверждает наличие подстроки
     */
    public boolean contains(String origin, String sub) {
        char[] charOrigin = origin.toCharArray();
        char[] charSub = sub.toCharArray();
        boolean result = false;
        int counter = 0;

        for (int i = 0; i < charOrigin.length; i++) {
            for (int j = 0; j < charSub.length; j++) {
                if (counter == charSub.length) {
                    result = true;
                }
                if (charSub[j] == charOrigin[i]) {
                    counter++;
                }
            }
        }
        return result;
    }
}