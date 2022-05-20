package eu.reply.academy.lesson22;


public class ExercitiiColectii {

    public static void main(String[] args) {


        CStringList stringList = new CStringList();
        stringList.addItem("1");
        stringList.addItem("2");
        stringList.addItem("3");

        int sum1 = stringList.sumOfElements();
        System.out.println(sum1);



        CIntList intList = new CIntList();
        intList.addItem(3);
        intList.addItem(5);
        intList.addItem(7);

       int sum2 = intList.sumOfElements();
        System.out.println(sum2);


    }

}
