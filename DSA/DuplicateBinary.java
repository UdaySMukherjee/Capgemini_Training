package DSA;

import java.util.Arrays;

public class DuplicateBinary {
    public static int[] findIndex(int[] array, int target) {
        int start = 0;
        int end = array.length - 1;
        int first = -1, last = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (array[mid] == target) {
                first = mid;
                last = mid;
                // Expand left
                while (first > 0 && array[first - 1] == target) {
                    first--;
                }
                // Expand right
                while (last < array.length - 1 && array[last + 1] == target) {
                    last++;
                }
                break;
            } else if (array[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return new int[] { first, last };
    }

    public static void main(String[] args) {
        int[] array = {5, 7, 7, 8, 8, 10};
        int target = 8;
        int[] result = findIndex(array, target);
        System.out.print(Arrays.toString(result));  // Output: [3, 4]
    }
}
