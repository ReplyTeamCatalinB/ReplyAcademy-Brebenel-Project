package eu.reply.academy.lesson25.tools;

public class StringUtils {

    public static final String UNKNOWN = "unknown";

    public static String getKey(String pair) {
        String key = UNKNOWN;
        if (pair == null) {
            return key;
        }
        int poz = pair.indexOf("=");
        if(poz > -1) {
         key=pair.substring(0,poz);
        }
        return key;
    }

    public static String getValue(String pair){
        String value = UNKNOWN;
        if (pair == null) {
            return value;
        }
        int poz = pair.indexOf("=");
        if (poz > -1) {
            value = pair.substring(poz + 1);
        }
        return value;
    }

}
