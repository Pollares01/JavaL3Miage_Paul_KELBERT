package Exo2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Mapping extends Thread {
    private String input_string;
    private Map<String, Integer> output_map;

    public Mapping(String s){
        this.input_string = s;
        this.output_map = new HashMap<>();
    }

    public void run() {
        this.input_string = this.input_string.replaceAll(",", " ,");
        this.input_string = this.input_string.replaceAll("'", " ");
        this.input_string = this.input_string.replaceAll("\\.", " .");
        String[] decoupe = this.input_string.split(" ");



        int length = decoupe.length;
        ArrayList<String> arrayList = new ArrayList<String> ();
        for (int i = 0; i < length; ++i) {
            arrayList.add (decoupe[i]);
        }
        Collections.sort(arrayList);
//        System.out.println(arrayList);
        String [] sortedArray = new String [length];
        for (int i = 0; i < length; ++i) {
            sortedArray [i] = arrayList.get (i);
        }
        int i = 0;
        while (i < length) {
                int occ = 1;
            int j   = i + 1;
            while (j < length) {
                if (sortedArray [i].compareTo(sortedArray[j]) == 0) {
                    ++occ;
                }
                else {
                    break;
                }
                ++j;
            }
            this.output_map.put(sortedArray[i], occ);
            i = j;
        }
        this.output_map.remove("");
    }





    public Map<String, Integer> getOutput_map() {
        return output_map;
    }
}
