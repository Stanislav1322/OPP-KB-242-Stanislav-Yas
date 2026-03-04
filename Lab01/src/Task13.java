import java.util.Arrays;

public class Task13 {

    public static int[] removeLocalMaxima(int[] array) {

        int count = 0;

        // Рахуємо кількість НЕ локальних максимумів
        for (int i = 0; i < array.length; i++) {
            if (!isLocalMax(array, i)) {
                count++;
            }
        }

        int[] result = new int[count];
        int index = 0;

        for (int i = 0; i < array.length; i++) {
            if (!isLocalMax(array, i)) {
                result[index++] = array[i];
            }
        }

        return result;
    }

    private static boolean isLocalMax(int[] array, int i) {
        if (i == 0 || i == array.length - 1) {
            return array[i] > array[i == 0 ? 1 : array.length - 2];
        }

        return array[i] > array[i - 1] && array[i] > array[i + 1];
    }

    public static void main(String[] args) {
        int[] arr = {18, 1, 3, 6, 7, -5};
        System.out.println(Arrays.toString(removeLocalMaxima(arr)));
    }
}