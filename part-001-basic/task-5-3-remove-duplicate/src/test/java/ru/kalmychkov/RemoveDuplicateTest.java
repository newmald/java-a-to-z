package ru.kalmychkov;

import org.junit.Assert;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
/**
 * Тест удаления дубликатов массива.
 * @author Алексей Калмычков
 * @since 23.11.2016
 * @version 1.0
 */
public class RemoveDuplicateTest {
    /**
     * whenAddStringArrayThenRemoveDuplicate - метод проверки удаления дубликата.
     */
    @Test
    public void whenAddStringArrayThenRemoveDuplicate() {
        String[] name = {"Alex", "Alex", "Max", "Peter", "Mike", "John", "Max"};
        RemoveDuplicate removeDuplicate = new RemoveDuplicate();
        String[] result = removeDuplicate.removeCopy(name);
        String[] expected = {"Alex", "Max", "Peter", "Mike", "John"};
        Assert.assertThat(result, is(expected));
    }
}