package eu.reply.academy.lesson22;

import java.util.ArrayList;
import java.util.List;


public class CIntList {

    public List<Integer> intElements = new ArrayList<>();

    public void addItem(int value) {
        intElements.add(value);
    }



    public void printList() {
        for (Integer element : intElements) {
            System.out.println(element + " ");

        }
    }

    public int sumOfElements() {
        int sum = 0;
        for (Integer i : intElements) {
            sum += i;
        }
        return sum;
    }

    public int compareToInt(CIntList cIntList) {
      if (sumOfElements() == cIntList.sumOfElements()) {
          return 0;
      }else if (sumOfElements() > cIntList.sumOfElements()) {
          return 1;
      }else
          return -1;
    }
}
