package Exercice2;

import java.util.ArrayList;

public class Animaux extends ArrayList<Animal> {

    public Animal maxIntervalle(int index1, int index2){
        Animal res = null;
        for(int i = index1; i<=index2; i++){
            if(res == null || res.getPoids() < this.get(i).getPoids()){
                res = this.get(i);
            }
        }
        return res;
    }

    public ArrayList<Animal> genre(boolean type){
        ArrayList<Animal> res = new ArrayList<>();
        for(Animal a : this){
            if(a.isSexe() == type){
                res.add(a);
            }
        }
        return res;
    }


}
