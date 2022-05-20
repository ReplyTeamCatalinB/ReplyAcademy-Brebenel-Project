package eu.reply.academy.lesson19;

public class Patrulater {

    private Punct a;
    private Punct b;
    private Punct c;
    private Punct d;

    private double[] dimensiuni;



    public double[] getDimensiuni() {
        return dimensiuni;
    }

    public void setDimensiuni(double[] dimensiuni) {
        this.dimensiuni = dimensiuni;
    }

    public double getPerimeter() {
        double perimetru = 0;
        for (int i =0; i < dimensiuni.length;i++) {
            perimetru+= dimensiuni[i];
        }
        return perimetru;
    }

    public Patrulater(Punct a, Punct b, Punct c, Punct d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        dimensiuni = new double[4];
        dimensiuni[0] = Math.sqrt((a.getX()- b.getX()) * (a.getX()- b.getX()) + (a.getY()- b.getY()) * (a.getY()- b.getY()));
        dimensiuni[1] = Math.sqrt((b.getX()- c.getX()) * (b.getX()- c.getX()) + (b.getY()- c.getY()) * (b.getY()- c.getY()));
        dimensiuni[2] = Math.sqrt((c.getX()- d.getX()) * (c.getX()- d.getX()) + (c.getY()- d.getY()) * (c.getY()- d.getY()));
        dimensiuni[3] = Math.sqrt((d.getX()- a.getX()) * (d.getX()- a.getX()) + (d.getY()- a.getY()) * (d.getY()- a.getY()));
    }


    @Override
    public String toString() {
//        return "The points are: " + a + b + c + d;
        StringBuilder str = new StringBuilder();
        str.append("(" + a + " " + b + " " + c + " " + d + ")");
        return str.toString();
    }
}
