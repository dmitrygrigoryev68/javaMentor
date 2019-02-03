package mergingArrays;

import java.util.Arrays;

public class Main {


    public static void main(String[] args) {

        int[] a1 = {2, 2, 3};
        int[] a2 = {1, 1, 2, 6, 65};

        System.out.println(Arrays.toString(mergeArrays(a1, a2)));


    }

    public static int[] mergeArrays(int[] a1, int[] a2) {

        int[] resArr = new int[a1.length + a2.length];
        int i = 0, j = 0, k = 0;
        while (i < a1.length && j < a2.length) {
            if (a1[i] < a2[j]) {
                resArr[k] = a1[i];
                i++;
            } else {
                resArr[k] = a2[j];
                j++;
            }
            k++;
        }

        while (i < a1.length) {
            resArr[k] = a1[i];
            i++;
            k++;
        }

        while (j < a2.length) {
            resArr[k] = a2[j];
            j++;
            k++;
        }

        return resArr;
    }
}