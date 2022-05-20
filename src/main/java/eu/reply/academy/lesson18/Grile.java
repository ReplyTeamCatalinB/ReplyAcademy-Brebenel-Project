package eu.reply.academy.lesson18;

import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Grile {
    public static void main(String[] args) {
        List<Integer> ages = new ArrayList<>();
        ages.add(Integer.parseInt("5"));
        int a = 7;
        ages.add(Integer.valueOf("6"));
        ages.add(a);
        for (int age : ages) System.out.print(age);


    }

}



