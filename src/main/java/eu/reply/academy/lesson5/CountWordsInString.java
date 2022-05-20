package eu.reply.academy.lesson5;

public class CountWordsInString {
    public static void main(String[] args) {



        CountWordsInString c = new CountWordsInString();
        System.out.println(c.countWords("Ana are mere"));
        System.out.println(c.countWords1("Ana are mere"));





    }


    public static int countWords(String s) {
        int wordCount = 0;

        boolean word = false;
        int endOfLine = s.length() - 1;

        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetter(s.charAt(i)) && i != endOfLine) {
                word = true;
            } else if (!Character.isLetter(s.charAt(i)) && word) {
                wordCount++;
                word = false;
            } else if (Character.isLetter(s.charAt(i)) && i == endOfLine) {
                wordCount++;
            }
        }


        return wordCount;
    }

    public static int countWords1(String s) {
        if(s == null || s.isEmpty()){
            return 0;
        }
        String[] words = s.split("\\s+");
        return words.length;
    }
}
