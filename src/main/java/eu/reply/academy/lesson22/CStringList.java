package eu.reply.academy.lesson22;

import java.util.ArrayList;
import java.util.List;

public class CStringList {

    public List<String> stringElements = new ArrayList<>();


    public void addItem(String input) {
        stringElements.add(input);
    }

    public void printList() {
        for (String element : stringElements) {
            System.out.println(element + " ");

        }
    }

    public int sumOfElements() {

        int sum = 0;
        for (String element : stringElements) {
            sum += element.length();
        }
        return sum;
    }

    public int compareToString(CStringList stringList) {
        if (sumOfElements() == stringList.sumOfElements()) {
            return 0;
        }else if (sumOfElements() > stringList.sumOfElements()) {
            return 1;
        }else
            return -1;
    }


}
