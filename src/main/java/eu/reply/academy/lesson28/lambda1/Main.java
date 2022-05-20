package eu.reply.academy.lesson28.lambda1;

public class Main {
    public static void main(String[] args) {

        StringSmallestDim smallestDim = new StringSmallestDim();
       String s1 = smallestDim.smallestString("Ana","Maria");



        Smallest smallest = (String one, String two) -> String.valueOf(Integer.compare(one.length(),two.length()));
        System.out.println(smallest.smallestStr("Ana","Maria"));




    }
}
