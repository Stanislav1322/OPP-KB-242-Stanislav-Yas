import java.util.Arrays;

public class Task14 {

    public static void cycleSwap(int[] array) {
        if (array == null || array.length == 0) return;

        int last = array[array.length - 1];

        for (int i = array.length - 1; i > 0; i--) {
            array[i] = array[i - 1];
        }

        array[0] = last;
    }

    public static void cycleSwap(int[] array, int shift) {
        if (array == null || array.length == 0) return;

        shift = shift % array.length;

        for (int s = 0; s < shift; s++) {
            cycleSwap(array);
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 2, 7, 4};
        cycleSwap(arr1);
        System.out.println(Arrays.toString(arr1));

        int[] arr2 = {1, 3, 2, 7, 4};
        cycleSwap(arr2, 3);
        System.out.println(Arrays.toString(arr2));
    }
}