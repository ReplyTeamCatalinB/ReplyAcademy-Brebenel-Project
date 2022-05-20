package eu.reply.academy.lesson21.main;

import eu.reply.academy.lesson21.beans.Oras;
import eu.reply.academy.lesson21.data.Orase;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class RunMe {
    public static void main(String[] args) {

        Orase orase = new Orase();
        orase.load("C:\\Java","orase.csv");
        orase.sortByPopulationNumber();
        System.out.println(Orase.listaOrase);

    }
}
