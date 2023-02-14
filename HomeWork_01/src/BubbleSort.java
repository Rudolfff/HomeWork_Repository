public class BubbleSort {
    public BubbleSort() {
    }

    public static void Ascending(int[] array) {
        boolean x = true;
        while (x) {
            int temp = 0;
            for (int i = 1; i < array.length; i++) {
                if (array[i - 1] > array[i]) {
                    temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                }
            }
            if (temp == 0) {
                x = false;
            }
        }
    }

    public static void Descending(int[] array) {
        boolean x = true;
        while (x) {
            int temp = 0;
            for (int i = 1; i < array.length; i++) {
                if (array[i] > array[i - 1]) {
                    temp = array[i - 1];
                    array[i - 1] = array[i];
                    array[i] = temp;
                }
            }
            if (temp == 0) {
                x = false;
            }
        }
    }
}
