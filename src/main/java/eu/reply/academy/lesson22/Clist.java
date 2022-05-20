package eu.reply.academy.lesson22;

public abstract class Clist {

    public int compareTo(Clist clist) {
        if (sumOfElements() == clist.sumOfElements()) {
            return 0;
        }else if (sumOfElements() > clist.sumOfElements()) {
            return 1;
        }else
            return -1;
    }

    public abstract int sumOfElements();

}
