package eu.reply.academy.lesson26.shape;

public abstract class Patrulater {
    private double lungime;
    private double latime;

    public Patrulater(double lungime, double latime) {
        this.lungime = lungime;
        this.latime = latime;
    }

    public abstract double getArea();

    public double getLungime() {
        return lungime;
    }

    public double getLatime() {
        return latime;
    }
}
