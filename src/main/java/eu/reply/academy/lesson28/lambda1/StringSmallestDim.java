package eu.reply.academy.lesson28.lambda1;

public class StringSmallestDim {

    public String smallestString(String str1, String str2) {

        if (str1.length() < str2.length()) {
            return str1;
        }else
            return str2;
    }
}
