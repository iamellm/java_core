package exercises;

import java.util.Arrays;

public class Array {
    public static int[] mergeArrays(int[] a1, int[] a2) {
        int[] rsl = new int[a1.length + a2.length];
        int n = a1.length;
        int m = a2.length;
        int i = 0, j = 0, k = 0;

        while (i < n && j < m) {
            if (a1[i] <= a2[j]) {
                rsl[k] = a1[i];
                i++;
            } else {
                rsl[k] = a2[j];
                j++;
            }
            k++;
        }
        while (i < n) {
            rsl[k] = a1[i];
            i++;
            k++;
        }
        while (j < m) {
            rsl[k] = a2[j];
            j++;
            k++;
        }
        return rsl;
    }

    public static void main(String[] args) {

        int[] arr1 = {1, 3, 4, 5, 6, 7};
        int[] arr2 = {1, 2, 3, 6};
        int[] rst = mergeArrays(arr1, arr2);
        System.out.println(Arrays.toString(rst));
    }
}
