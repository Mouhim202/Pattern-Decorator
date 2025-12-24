import composants.Boisson;
import composants.Espresso;
import composants.Sumatra;

public class Test {
    public static void main(String[] args) {
        Boisson boisson;
        boisson=new Sumatra();
        System.out.println(boisson.getDescription());
        System.out.println(boisson.cout());
        boisson=new Espresso();
        System.out.println(boisson.getDescription());
        System.out.println(boisson.cout());
    }
}
