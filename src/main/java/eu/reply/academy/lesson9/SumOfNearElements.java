package eu.reply.academy.lesson9;

public class SumOfNearElements {
    public static void main(String[] args) {

    }

    public static int[] sumOfNearbyElements(int[] ints) {

        int[] matrix = new int[ints.length];

        for (int i = 0; i < ints.length; i++) {
            if (i == 0) {
                matrix[0] = ints[0] * 2 + ints[1];
            }

            if (i > 0 && i< ints.length-1) {
                matrix[i] = (ints[i] * 2) + ints[i -1] + ints[i-2];
            }
            if (i == ints.length-1) {
                matrix[i] = ints[i] * 2 + ints[i -1];
            }

        }

            return matrix;
    }
}

//    public static void main(String[] args) {
//        int[] var = {1, 3, 7, 9, 3, 4};
//        System.out.println(Arrays.toString(calculeaza(var)));
//    }

//    public static int[] calculeaza(int[] v) {
//        int[] result = new int[v.length];
//        for (int i = 0; i < v.length; i++) {
//            if (i == 0) {
//                result[0] = v[0] * 2 + v[1];
//            }
//            if (i > 0 && i < v.length - 1) {
//                result[i] = (v[i] * 2) + v[i - 1] + v[i + 1];
//            }
//            if (i == v.length - 1) {
//                result[i] = v[i] * 2 + v[i - 1];
//            }
//        }
//        return result;
//    }
