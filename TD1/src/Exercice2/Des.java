package Exercice2;

import java.util.Random;

public class Des {

    public int lancer(){
        Random rand = new Random();
        return rand.nextInt(6)+1;
    }

}
