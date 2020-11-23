package denis.korchagin.utils;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Locale;

public class ArrayUtils {

    public static int[] toPrimitive(Integer[] arr) {
        if (arr == null) {
            return null;
        }
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            // автоматическая распаковка из объекта
            result[i] = arr[i];
        }
        return result;
    }

    public static int[] toIntArray(String str) {
        Scanner scanner = new Scanner(str);
        scanner.useLocale(Locale.ROOT);
        scanner.useDelimiter("(\\s|[,;])+");
        List<Integer> list = new ArrayList<>();
        while (scanner.hasNext()) {
            list.add(scanner.nextInt());
        }

        // из List<Integer> можно получить Integer[]
        Integer[] arr = list.toArray(new Integer[0]);
        // Integer[] -> int[]
        return ArrayUtils.toPrimitive(arr);
    }

    public static int[] readIntArrayFromConsole() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.printf("Input array:%n");
                String line = scanner.nextLine();
                return toIntArray(line);
            }
            catch(Exception e) {
                System.out.print("Вы ошиблись, попробуйте еще раз! ");
            }
        }
    }
}
