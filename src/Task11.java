public class Task11 {

    public static int sum(int[] array) {
        if (array == null || array.length == 0) {
            return 0;
        }

        int sum = 0;

        for (int num : array) {
            if (num % 2 == 0) {
                sum += num;
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        int[] arr = {10, 24, 4, 4, 6};
        System.out.println(sum(arr));
    }
}