public class Task10 {

    public static int max(int[] array) {
        int maxValue = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > maxValue) {
                maxValue = array[i];
            }
        }

        return maxValue;
    }

    // Тестування
    public static void main(String[] args) {
        int[] arr = {3, 7, 2, 9, 0};
        System.out.println(max(arr));
    }
}