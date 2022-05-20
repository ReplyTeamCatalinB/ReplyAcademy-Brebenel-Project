package eu.reply.academy.lesson29;

public class Shark extends Fish {

    private int noOfFins = 8;

    public Shark(int age) {
        super(age);
        this.size = 4;
    }
//    @Override
//    public void displayShark() {
//        System.out.println(super.getAge());
//        System.out.println(super.size);
//        System.out.println(this.noOfFins);
//    }
//
//    public int getNoOfFins() {
//        return noOfFins;
//    }

//    @Override
//    public String toString() {
//        return "Shark{" +
//                "size=" + size +
//                ", noOfFins=" + noOfFins + " " + this.getAge() +
//                '}';
//    }
}
