package eu.reply.academy.lesson30;

import java.io.*;
import java.net.URL;

public class JsonParser {

    public static String getJSONFromUrl(String strUrl) {
        String jsonText = "";
        try {

            URL url = new URL(strUrl);
            InputStream is = url.openStream();

            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(is));

            String line;
            while ((line = bufferedReader.readLine()) != null) {

                jsonText += line + "\n";

            }
            is.close();
            bufferedReader.close();

        }catch (Exception e) {
            e.printStackTrace();
        }
        return jsonText;
    }
}

