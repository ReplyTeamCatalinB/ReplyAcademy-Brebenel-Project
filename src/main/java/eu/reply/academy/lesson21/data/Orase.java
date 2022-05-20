package eu.reply.academy.lesson21.data;

import eu.reply.academy.lesson21.beans.Oras;

import java.io.*;
import java.util.*;

public class Orase {

    public static List<Oras> listaOrase = new ArrayList<>();
    public final static String SEPARATOR = ",";

    public void load(String path, String fileName) {
        try {

            File file = new File(path, fileName);
            BufferedReader br = new BufferedReader(new FileReader(file));

            String linie;
            String numeColoana = br.readLine();
            while ((linie = br.readLine()) != null) {
                String[] valori = linie.split(SEPARATOR);
                //creaza constructor care pe baza variabilei valori construiecte obiectul oras
                if (valori[5].isEmpty()) {
                    valori[5] = String.valueOf(0);
                }
                    Oras oras = new Oras(valori);
                    listaOrase.add(oras);


                //plus 0 e gresit, pentru ca pop rom o sa fie x 10
                //foloseste settarul sa gestioneze aceasta exceptie, cand val de pe poz 5 este empty;



            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void sortByPopulationNumber() {

//        Collections.sort(listaOrase, (oras, o2) -> (int) (oras.getPopulatie() - oras.getPopulatie()));


        int n = listaOrase.size();
        for (int i = 0; i < n -1; i++) {
            int index = i;
            long min  = listaOrase.get(i).getPopulatie();
            for (int j = i + 1; j < n;j++) {
               if (listaOrase.get(index).getPopulatie() > listaOrase.get(j).getPopulatie())
                index = j;
                min = listaOrase.get(j).getPopulatie();
            }
            Oras oras = listaOrase.get(index);
            listaOrase.set(index, listaOrase.get(i));
            listaOrase.set(i,oras);
        }

    }

    public void writeToFile(String path, String name) {

    }
}
