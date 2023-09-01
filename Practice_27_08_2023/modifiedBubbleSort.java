package Practice_27_08_2023;

public class modifiedBubbleSort {
    public static int[] optimizeBubbleSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }

                if (swapped == false) {
                    break;
                }
            }
        }
        return arr;
    }

    public static void main(String args[]) {
        int arr[] = { 1, 2, 58, 6, 4, 5, 47, 2 };
        int[] ans = optimizeBubbleSort(arr);
        System.out.println(ans);

    }
    // showing wrong output need to check
}
