package denis.korchagin.ConcoleMain;

import denis.korchagin.utils.ArrayUtils;
import denis.korchagin.SumBetweenPrimeNumbers;

public class Main {

    public static void main(String[] args) {
            int[] arr = ArrayUtils.readIntArrayFromConsole();
            System.out.printf("Sum between first and last prime numbers = %d\n", SumBetweenPrimeNumbers.calcSumBetweenPrimeNumbers(arr));
    }
}
