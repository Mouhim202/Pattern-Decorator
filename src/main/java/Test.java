import composants.Boisson;
import composants.Espresso;
import composants.Sumatra;
import decorateurs.Caramel;
import decorateurs.Chocolat;
import decorateurs.Noisette;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Test {
    public static void main(String[] args) {
//        Boisson boisson;
//        boisson=new Sumatra();
//        System.out.println(boisson.getDescription());
//        System.out.println(boisson.cout());
//        System.out.println("--------------------");
//        boisson=new Chocolat(boisson);
//        System.out.println(boisson.getDescription());
//        System.out.println(boisson.cout());
//        System.out.println("-------------------------");
//        boisson=new Caramel(boisson);
//        System.out.println(boisson.getDescription());
//        System.out.println(boisson.cout());

        Boisson b;
        b = new Chocolat(new Caramel(new Chocolat(new Caramel(new Noisette(new Sumatra())))));
        System.out.println(b.getDescription());
        System.out.println(b.cout());

    }
}
