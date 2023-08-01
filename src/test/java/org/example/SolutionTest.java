package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void testMajorityElement() {
        Solution majorityElement = new Solution();

        // Проверка обычного случая, когда в массиве есть большинство
        assertEquals(3, majorityElement.majorityElement(new int[]{3, 3, 4}));

        assertEquals(2, majorityElement.majorityElement(new int[]{2,2,1,1,1,2,2}));

        // Проверка случая, когда в массиве нет большинства
        assertEquals(-1, majorityElement.majorityElement(new int[]{3, 3, 4, 4}));



        // Проверка случая с одним элементом
        assertEquals(1, majorityElement.majorityElement(new int[]{1}));

        // Проверка пустого массива
        assertEquals(-1, majorityElement.majorityElement(new int[]{}));

    }
}