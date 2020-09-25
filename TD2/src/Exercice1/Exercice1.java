package Exercice1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Exercice1{

    public static <T extends Comparable> Set<Integer> indexSet(ArrayList<T> list, T element){
        HashSet<Integer> res = new HashSet<>();
        int i = 0;
        for(T s : list){
            if(s.equals(element)){
                res.add(i);
            }
            i++;
        }
        return res;
    }

    public static void main(String[] args) {
        ArrayList a = new ArrayList<>();
        a.add(9.7);
        a.add(9.9);
        a.add(9.2);
        a.add(8.5);
        a.add(9.5);
        a.add(9.7);
        a.add(9);
        a.add(9.9);
        a.add(9.4);
        a.add(8.5);
        a.add(8.5);
        a.add(9.7);
        a.add(8.8);
        a.add(8.9);
        a.add(9.7);
        a.add(9.5);
        a.add(8.6);
        a.add(9.5);
        a.add(9.5);
        a.add(9.8);
        a.add(9.3);
        HashSet hs = (HashSet) indexSet(a, 9.7);
        for (Object h : hs) {
            System.out.println(h);
        }
    }
}
