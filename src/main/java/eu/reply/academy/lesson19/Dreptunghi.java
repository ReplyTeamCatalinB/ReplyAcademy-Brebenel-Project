package eu.reply.academy.lesson19;

public class Dreptunghi extends Paralelogram {

    private double width;
    private double length;


    public Dreptunghi(Punct a, double width, double length) {

        super(a, new Punct(a.getX() + width, a.getY()),
                new Punct(a.getX() + width, a.getY() + length),
                new Punct(a.getX(), a.getY() + length));
        this.width = width;
        this.length = length;

    }


    public double getLength() {
        return getDimensiuni()[1];
    }

    public void setLength(double length) {
        this.getDimensiuni()[1] = length;
        this.getDimensiuni()[2] = length;
    }
}
