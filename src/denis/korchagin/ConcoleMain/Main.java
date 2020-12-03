package denis.korchagin.ConcoleMain;

import denis.korchagin.utils.ArrayUtils;
import denis.korchagin.SumBetweenPrimeNumbers;

public class Main {

    public static void main(String[] args) {
        System.out.println("----------Tests----------");
        boolean testsPassed = runTests();
        if (testsPassed) {
            int[] arr = ArrayUtils.readIntArrayFromConsole();
            System.out.printf("Sum between first and last prime numbers = %d\n", SumBetweenPrimeNumbers.calcSumBetweenPrimeNumbers(arr));
        }
    }

    static boolean runTests() {
        TestCases[] testsArr = {
                new TestCases(16, new int[] {10, 3, 6, 7, 9, 4, 7, 6, 11, 24}),
                new TestCases(22, new int[] {2, 7, 14, 51, 8, 23, 6, 10, 12, 15}),
                new TestCases(82, new int[] {0, 4, 6, 58, 11, 8, 6, 3, 10, 1, 12}),
                new TestCases(8, new int[] {-5, -14, 0, 12, 10, -11, -1, 41, 4}),
                new TestCases(0, new int[] {1, 10, 14, 7, 52, 33, 48, 56}),
                new TestCases(8, new int[] {13, 10, -1, 8, -16, 23, 6, -7}),
                new TestCases(0, new int[] {15, 16, 26, 91, 77, 46}),
                new TestCases(6, new int[] {2, 2, 2, -2, 2, 2, 2}),
                new TestCases(0, new int[] {10, 16, 93, 12, 17, 23, 40, 96}),
                new TestCases(2, new int[] {-2, 3, 41, -67, 19, 47, -53, 2, 0})
        };

        boolean result = true;
        for (int i = 0; i < testsArr.length; i++) {
            if (SumBetweenPrimeNumbers.calcSumBetweenPrimeNumbers(testsArr[i].getTestArr()) == testsArr[i].getCurrentResult()) {
                printTest(testsArr, i, "correct");
            } else {
                printTest(testsArr, i, "incorrect");
                result = false;
            }
        }
        return result;
    }

    static void printTest(TestCases[] testsArr, int i, String result) {
        System.out.print("For arr {");
        printIntArray(testsArr[i].getTestArr());
        System.out.printf("} sum between first and last prime numbers = %d %s\n", testsArr[i].getCurrentResult(), result);
    }

    static void printIntArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i != 0) {
                System.out.print(" ");
            }
            System.out.print(arr[i]);
        }
    }
}
