package boissons;

import decorator.Caramel;
import decorator.Chocollat;

public class Test {
    public static void main(String[] args) {
        Boisson b=new Espresso();
        System.out.println("***************************");
        System.out.println(b.getDescription());
        System.out.println(b.cout());
        System.out.println("***************************");
        b=new Chocollat(b);
        System.out.println(b.getDescription());
        System.out.println(b.cout());
        System.out.println("*****************************");

        b=new Caramel(b);
        System.out.println("******************************");
        System.out.println(b.getDescription());
        System.out.println(b.cout());
        System.out.println("*******************************");

        b=new Caramel(b);
        System.out.println("******************************");
        System.out.println(b.getDescription());
        System.out.println(b.cout());
        System.out.println("*******************************");

    }
}
