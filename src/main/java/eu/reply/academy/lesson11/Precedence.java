package eu.reply.academy.lesson11;

public class Precedence {

    public static void main(String[] args) {
        long thatNumber = 5 >= 5 ? 1 + 2 : 1 * 1;
        if (thatNumber++ > 4) {
            thatNumber *= 3;
        }

        thatNumber++;
        System.out.println(thatNumber);
        // thatNumber = 5>=5 ? 1+2 : 1;
        // thatNumber = 5>=5 ? 3 : 1;
        // thatNumber = true ? 3 : 1;
        // thatNumber = 3
        // thatNumber = thatNumber + 1;
        // if(thatNumber < 4)
        //  thatNumber +1 = 1;
        //int thatNumber = 4;
//        if(++thatNumber < 4) {
//            System.out.println("A");
//        }
//        appearances[j++] = v[--i].length;
        // appearances[1] = v[-2].length;
        //
        //if(thatNumber<4)
//        if(thatNumber++ >= 5) {
//            System.out.println("That number in a doua conditie" + thatNumber);
//            System.out.println("B");
//        }
//        System.out.println(thatNumber);
    }
}

