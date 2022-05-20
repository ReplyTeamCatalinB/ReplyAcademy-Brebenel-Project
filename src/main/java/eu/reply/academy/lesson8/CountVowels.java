package eu.reply.academy.lesson8;

public class CountVowels {
    public static void main(String[] args) {

        String str = "restaurant";
        System.out.println(countVowels(str));
    }

    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return (c == 'a' ||
                c == 'e' ||
                c == 'i' ||
                c == 'o' ||
                c == 'u');
    }

    public static int countVowels(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (isVowel(str.charAt(i))) {
                count++;
            }
        }
            return count;
    }
}

//Angela Stanciu3:06 PMprivate static String vocale = "aeiou";
//public static int calculeazaVocaleRecursiv(String cuvant) {
//    if (cuvant == null || cuvant.length() == 0) {
//        return 0;
//    } else {
//        if (vocale.contains(String.valueOf(cuvant.substring(0, 1)))) {
//            return 1 + calculeazaVocaleRecursiv(cuvant.substring(1));
//        } else {
//            return calculeazaVocaleRecursiv(cuvant.substring(1));
//        }
//    }
//
//}