package denis.korchagin;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;

public class TestSumBetweenPrimeNumbers {

    @Test
    public void testGetSumBetweenPrimeNumbers1() {
        SumBetweenPrimeNumbers sumBetweenPrimeNumbers = new SumBetweenPrimeNumbers();
        int result = sumBetweenPrimeNumbers.calcSumBetweenPrimeNumbers(new int[]{10, 3, 6, 7, 9, 4, 7, 6, 11, 24});
        assertEquals(16,result);
    }

    @Test
    public void testGetSumBetweenPrimeNumbers2() {
        SumBetweenPrimeNumbers sumBetweenPrimeNumbers = new SumBetweenPrimeNumbers();
        int result = sumBetweenPrimeNumbers.calcSumBetweenPrimeNumbers(new int[]{2, 7, 14, 51, 8, 23, 6, 10, 12, 15});
        assertEquals(22,result);
    }

    @Test
    public void testGetSumBetweenPrimeNumbers3() {
        SumBetweenPrimeNumbers sumBetweenPrimeNumbers = new SumBetweenPrimeNumbers();
        int result = sumBetweenPrimeNumbers.calcSumBetweenPrimeNumbers(new int[]{0, 4, 6, 58, 11, 8, 6, 3, 10, 1, 12});
        assertEquals(82,result);
    }

    @Test
    public void testGetSumBetweenPrimeNumbers4() {
        SumBetweenPrimeNumbers sumBetweenPrimeNumbers = new SumBetweenPrimeNumbers();
        int result = sumBetweenPrimeNumbers.calcSumBetweenPrimeNumbers(new int[]{-5, -14, 0, 12, 10, -11, -1, 41, 4});
        assertEquals(8,result);
    }

    @Test
    public void testGetSumBetweenPrimeNumbers5() {
        SumBetweenPrimeNumbers sumBetweenPrimeNumbers = new SumBetweenPrimeNumbers();
        int result = sumBetweenPrimeNumbers.calcSumBetweenPrimeNumbers(new int[]{1, 10, 14, 7, 52, 33, 48, 56});
        assertEquals(0,result);
    }

    @Test
    public void testGetSumBetweenPrimeNumbers6() {
        SumBetweenPrimeNumbers sumBetweenPrimeNumbers = new SumBetweenPrimeNumbers();
        int result = sumBetweenPrimeNumbers.calcSumBetweenPrimeNumbers(new int[]{13, 10, -1, 8, -16, 23, 6, -7});
        assertEquals(8,result);
    }

    @Test
    public void testGetSumBetweenPrimeNumbers7() {
        SumBetweenPrimeNumbers sumBetweenPrimeNumbers = new SumBetweenPrimeNumbers();
        int result = sumBetweenPrimeNumbers.calcSumBetweenPrimeNumbers(new int[]{115, 16, 26, 91, 77, 46});
        assertEquals(0,result);
    }

    @Test
    public void testGetSumBetweenPrimeNumbers8() {
        SumBetweenPrimeNumbers sumBetweenPrimeNumbers = new SumBetweenPrimeNumbers();
        int result = sumBetweenPrimeNumbers.calcSumBetweenPrimeNumbers(new int[]{2, 2, 2, -2, 2, 2, 2});
        assertEquals(6,result);
    }

    @Test
    public void testGetSumBetweenPrimeNumbers9() {
        SumBetweenPrimeNumbers sumBetweenPrimeNumbers = new SumBetweenPrimeNumbers();
        int result = sumBetweenPrimeNumbers.calcSumBetweenPrimeNumbers(new int[]{10, 16, 93, 12, 17, 23, 40, 96});
        assertEquals(0,result);
    }

    @Test
    public void testGetSumBetweenPrimeNumbers10() {
        SumBetweenPrimeNumbers sumBetweenPrimeNumbers = new SumBetweenPrimeNumbers();
        int result = sumBetweenPrimeNumbers.calcSumBetweenPrimeNumbers(new int[]{-2, 3, 41, -67, 19, 47, -53, 2, 0});
        assertEquals(2,result);
    }
}
