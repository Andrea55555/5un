import org.junit.*;

import static org.junit.Assert.*;

public class SelectionSortExampleTest {

    @Test
    public void testSortingSorted() {
        int[] array = {1, 2, 3};
        int[] act = SelectionSortExample.selectionSort(array);
        int[] exp = {1, 2, 3};
        Assert.assertArrayEquals(act, exp);
    }
    @Ignore
    @Test(timeout = 1000)
    public void infinity() {
        while (true);
    }
    @Test(expected = NullPointerException.class)
    public void testToHexStringWrong() {
        SelectionSortExample.selectionSort(null);
    }
    @Test
    public void numbers() {
        System.out.println("сравнить цифры вручную");
        assertEquals("2 3 9 11 14 22 43 58 ", SelectionSortExample.selectionSort(array));
    }

        @Test
        public void checkExpectedException () {
            final int factorialOf = -5;
            System.out.println(factorialOf + "! = " + SelectionSortExample.selectionSort(array));
        }
    }