package eu.reply.academy.lesson5;

public class Palindrome {
    public static void main(String[] args) {

//        System.out.println("Enter value: ");
//        Scanner sc = new Scanner(System.in);
//        String str = sc.nextLine();
//
//        boolean isPalindrome = true;
//        for (int i = 0, j = str.length() -1; i < j; i++, j--) {
//            if (str.charAt(i) == str.charAt(j)) {
//                continue;
//            }
//            isPalindrome = false;
//            break;
//        }
//        System.out.println(isPalindrome ? "is palindrome" : "is not palindrome");

        int[] a = {1};
        int n = a.length;


            System.out.print( isPalindromeRecursive(a, 0, n - 1));

    }




    public static String palindromeMethod(int[] ints) {
        boolean isPalindrome = true;

        for (int i = 0, j = ints.length - 1; i < j; i++, j--) {
            if (ints[i] == ints[j]) {
                continue;
            }
            isPalindrome = false;
            break;
        }

        return isPalindrome ? "is palindrome" : "is not palindrome";
    }

    public static boolean isPalindromeRecursive(int[] ints, int i, int j) {

        if (i >= j) {
            return true;
        }

        if (ints[i] == ints[j]) {
            return isPalindromeRecursive(ints,i +1,j -1);
        } else {
            return false;
        }
    }
}

//public static boolean estePalindromRecursiv(int[] vector, int i) {
//    if (vector.length == 1) {
//        return true;
//    }
//    if (i < vector.length / 2) {
//        if (vector[i] != vector[vector.length - 1 - i]) {
//            return false;
//        }
//    }
//    if (i == vector.length / 2) {
//        return true;
//    }
//    return estePalindromRecursiv(vector, i + 1);
//}
