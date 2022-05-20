package eu.reply.academy.lesson19;

public class RunMe {
    public static void main(String[] args) {
        Punct a = new Punct(1,2);
        Punct b = new Punct(1,2);
        Punct c = new Punct(1,2);
        Punct d = new Punct(1,2);

        Patrulater patrulater = new Patrulater(a,b,c,d);
        Paralelogram paralelogram = new Paralelogram(a,b,c,d);
        Dreptunghi dreptunghi = new Dreptunghi(a,2,3);
        Patrat square = new Patrat(a,2);
//        System.out.print(p);
//        System.out.println(dreptunghi);
//        System.out.println(square);

        System.out.println(patrulater.getPerimeter());
        System.out.println(paralelogram.getPerimeter());
        System.out.println(dreptunghi.getPerimeter());
        System.out.println(square.getPerimeter());

    }
}
