package eu.reply.academy.lesson25.processors;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Vector;

public abstract class Core {

    public abstract void action();

    String path= "C:\\Java\\learning";

    public Vector<String> readAppFile(String fileName){


        Vector<String> vector = new Vector<>();
        String line;

        try (BufferedReader br = new BufferedReader(new FileReader(path + fileName))) {
            while ((line = br.readLine()) != null) {

                vector.add(line);
            }
        }catch (IOException e) {

        }

        return vector;
    }
}
