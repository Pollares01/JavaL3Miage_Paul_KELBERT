import java.util.ArrayList;
import java.util.HashSet;

public class Exercice1 {

    public static HashSet<Integer> indexSet(ArrayList<String> list, String element){
        HashSet<Integer> res = new HashSet<Integer>();
        int i = 0;
        for(String s : list){
            if(s.equalsIgnoreCase(element)){
                res.add(i);
            }
            i++;
        }
        return res;
    }

    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<>();
        a.add("det");
        a.add("adj");
        a.add("noum");
        a.add("adj");
        a.add("verb");
        a.add("det");
        a.add("verb");
        a.add("det");
        a.add("adj");
        a.add("noum");
        a.add("adj");
        a.add("punc");
        HashSet<Integer> hs = indexSet(a, "adj");
        for (Integer h : hs) {
            System.out.println(h);
        }
    }
}
