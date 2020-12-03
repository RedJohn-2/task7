package denis.korchagin;

public class SumBetweenPrimeNumbers {
    public static int calcSumBetweenPrimeNumbers(int[] arr) {
        int sum = 0;
        int numberFirstPrimeMember = arr.length;
        int sumBetweenPrimeNumbers = 0;
        for (int i = 0; i < arr.length; i++) {
            if (isPrimeNumber(arr[i])) {
                if (numberFirstPrimeMember == arr.length) {
                    numberFirstPrimeMember = i;
                }
                sum += sumBetweenPrimeNumbers;
                sumBetweenPrimeNumbers = 0;
            }
            if (arr[i] % 2 == 0 && i > numberFirstPrimeMember) {
                sumBetweenPrimeNumbers += arr[i];
            }
        }
        return sum;
    }

    public static boolean isPrimeNumber(int n) {
        boolean primeNumber = true;
        for (int i = 2; i < (Math.sqrt(Math.abs(n))); i++) {
            if (n % i == 0) {
                primeNumber = false;
                break;
            }
        }
        return primeNumber && Math.abs(n) != 1;
    }
}
