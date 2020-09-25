package Exercice2;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Animaux a = new Animaux();
        a.add(new Chien("Max", 5.5, false, true));
        a.add(new Chat("Jupiter", 2.6, false));
        a.add(new Poisson("Lili", 0.05, true, true, 25));
        a.add(new Poisson("Dory", 0.04, true, false, 14));
        a.add(new Chien("Maya", 4, true, false));
        a.add(new Chat("Obelix", 3.2, false));

        Animal lePlusLourd = a.maxIntervalle(1,4);
        System.out.println("Animal le plus lourd : " + lePlusLourd.getNom());

        System.out.println("\n============================");
        System.out.println("Les femelles du groupe sont : ");
        ArrayList<Animal> femelles = a.genre(true);
        for(Animal f : femelles){
            System.out.println("\t" + f.getNom());
        }


        System.out.println("\n============================");
        System.out.println("Les males du groupe sont : ");
        ArrayList<Animal> males = a.genre(false);
        for(Animal m : males){
            System.out.println("\t" + m.getNom());
        }
    }

}
