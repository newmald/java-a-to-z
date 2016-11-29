package ru.kalmychkov;

import org.junit.Assert;
import org.junit.Test;
import static org.hamcrest.core.Is.is;

/**
 * Тест поиска подстроки.
 * @author Алексей Калмычков
 * @since 23.11.2016
 * @version 1.0
 */
public class SubStringTest {
    /**
     * whenStringThenSubstringTrue - метод проверки поиска подстроки. Результат true
     */
    @Test
    public void whenStringThenSubstringTrue() {
        String origin = "string";
        String sub = "rin";
        SubString subString = new SubString();
        boolean result = subString.contains(origin, sub);
        Assert.assertThat(result, is(true));
    }

    /**
     * whenStringThenSubstringFalse - метод проверки поиска подстроки. Результат false
     */
    @Test
    public void whenStringThenSubstringFalse() {
        String origin = "string";
        String sub = "rik";
        SubString subString = new SubString();
        boolean result = subString.contains(origin, sub);
        Assert.assertThat(result, is(false));
    }
}