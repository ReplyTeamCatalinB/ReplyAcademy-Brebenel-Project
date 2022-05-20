package eu.reply.academy.lesson14;

public class WatterBottle {
    private String brand;
    private boolean empty;

    public static void main(String[] args) {
        WatterBottle wb = new WatterBottle();
        System.out.print("Empty = " + wb.empty);
        System.out.print(", Brand = " + wb.brand);
    }
}
