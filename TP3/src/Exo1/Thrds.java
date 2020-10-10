package Exo1;

import java.util.*;
import java.util.stream.*;
public class Thrds {


    public static class Divisible extends Thread {
        private int divisiblePar ;
        public List<Integer> list = new ArrayList<>();

        /**
         * constructeur d'un objet Divisible
         * @param divs
         * @param name
         * @param div
         */
        public Divisible(ThreadGroup divs, String name, int div) {
            super(divs, name);
            this.divisiblePar = div;
        }

        /**
         * cette methode sert a lancer les threads
         */
        public void run() {
            // creation de la liste de retour
            List<Integer> dlist = new ArrayList<>();
            // parcours de la list de l'objet
            for(Integer l:list) {
                // si l'element courant est divisible par divisiblePar
                if(l % divisiblePar == 0){
                    // ajout de l'element courant dans la liste de retour
                    dlist.add(l);
                }
            }
            // affichage console
            System.out.println(this.getName() + " est terminé :" + dlist);
        }
    }


    /**
     * methode principale
     * @param args
     */
    public static void main(String[] args) {
        // creation des listes de test
        List<Integer> list2 = IntStream.
                range(1, 11).
                boxed().
                collect(Collectors.toList());
        List<Integer> list3 = IntStream.
                range(1, 1001).
                boxed().
                collect(Collectors.toList());
        List<Integer> list5 = IntStream.
                range(1, 100001).
                boxed().
                collect(Collectors.toList());

        // creation du groupe des thread
        ThreadGroup divs = new ThreadGroup("Groupe de division");

        // creation des threads
        Divisible div2 = new Divisible(divs, "div2", 2);
        Divisible div3 = new Divisible(divs, "div3", 3);
        Divisible div5 = new Divisible(divs, "div5", 5);

        // attribution des listes
        div2.list = list2;
        div3.list = list3;
        div5.list = list5;

        // demarrage des threads
        div2.start();
        div3.start();
        div5.start();

        // tant que les 3 threads ne sont pas finis
        while (div2.isAlive() || div3.isAlive() || div5.isAlive()) {
            // on attend une milliseconde
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // stop des 3 threads quand on sort du while
        divs.stop();
        System.out.println("Division terminée");
    }
}