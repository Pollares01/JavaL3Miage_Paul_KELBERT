package Exo2;

import java.util.*;
public class Reduce extends Thread {

    private ArrayList<Map<String, Integer>> input_list;
    private Map<String, Integer> output_map;

    public Reduce(ArrayList<Map<String, Integer>> input_list) {
        this.input_list = input_list;
        this.output_map = new HashMap<>();
    }

    public void run() {
        for (Map<String, Integer> m : this.input_list) {
            for (Map.Entry<String, Integer> e : m.entrySet()) {
                if (this.output_map.containsKey(e.getKey())) {
                    this.output_map.replace(e.getKey(), this.output_map.get(e.getKey()) + e.getValue());
                } else {
                    this.output_map.put(e.getKey(), e.getValue());
                }
            }
        }
    }

    public Map<String, Integer> getOutput_map() {
        return output_map;
    }
}
