package eu.reply.academy.lesson8;

public class ReverseString {
    public static void main(String[] args) {
        System.out.println(reverseStringRecursive("alucard"));
    }

    public static String reverseStrings(String word) {
        StringBuilder result = new StringBuilder();
        for (int i = word.length() - 1; i >= 0; i--) {
            result.append(word.charAt(i));
        }
        return "Reverse word: " + result;
    }

    public static String reverseStringRecursive(String word) {

        if (word == null || word.length() == 0 ) {
            return "";
        } else {
            return word.substring(word.length()-1)+reverseStringRecursive(word.substring(0,word.length()-1));
        }
    }

}
