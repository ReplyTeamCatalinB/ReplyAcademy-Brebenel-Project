package eu.reply.academy.lesson26.shape;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Patrulater patrulater = new Dreptunghi(2,3);
        Patrulater patrulater1 = new Patrat(4);
        System.out.println(patrulater.getArea());
        System.out.println(patrulater1.getArea());



    }
}
