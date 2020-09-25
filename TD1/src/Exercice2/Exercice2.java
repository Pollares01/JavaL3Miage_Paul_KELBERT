package Exercice2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Exercice2 {

    public static HashMap<Integer[], Integer> histogramme(ArrayList<Integer> list, int pas){
        HashMap<Integer[], Integer> res = new HashMap<>();
        int count=0;
        Integer[] tbl = new Integer[pas];
        for(Integer i : list){
            if (count >= pas) {
                res.put(tbl, pas);
                tbl = new Integer[pas];
                count = 0;
            }
            tbl[count] = i;
            count++;
        }
        res.put(tbl, pas);
        return res;
    }




    //question 2

//    public static void main(String[] args) {
//        ArrayList<Integer> arraylist = new ArrayList<>();
//        Random rand = new Random();
//        for(int i = 0; i<300; i++){
//            arraylist.add((rand.nextInt(101)));
//        }
//        HashMap<Integer[], Integer> res = histogramme(arraylist, 5);
//
//        for (Map.Entry mapentry : res.entrySet()) {
//            Integer[] tbl = (Integer[]) mapentry.getKey();
//            for(Integer i : tbl){
//                System.out.print(i + " ");
//            }
//            System.out.println("-> " + mapentry.getValue());
//        }
//    }


    // question 3
    public static void main(String[] args) {
        ArrayList<Integer> arraylist = new ArrayList<>();
        for(int i =0;i<3;i++){
            Des d= new Des();
            for(int j=0; j<200; j++){
                arraylist.add(d.lancer());
            }
        }
        HashMap<Integer[], Integer> res = histogramme(arraylist, 5);

        for (Map.Entry mapentry : res.entrySet()) {
            Integer[] tbl = (Integer[]) mapentry.getKey();
            for(Integer i : tbl){
                System.out.print(i + " ");
            }
            System.out.println("-> " + mapentry.getValue());
        }
    }
}
