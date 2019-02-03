package mergingArrays;

public class Main {


    public static void main(String[] args) {



    }

    public static int[] mergeArrays(int[] a1, int[] a2) {

        int[] resArr = new int[a1.length + a2.length];


        for (int i = 0; i < resArr.length; i++) {

            if (a1[i] < a2[i]) {
                resArr[0] = a1[i];
            } else {resArr[0] = a2[i]};


            }

        return resArr; // your implementation here
    }
}
