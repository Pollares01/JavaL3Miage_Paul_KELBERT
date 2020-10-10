package Exo2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

import static java.util.stream.Collectors.toMap;

public class Main {

    private static final String TEXTE1 = "Un jeune et timide 'Hobbit', Frodon Sacquet, hérite d'un anneau magique. Bien loin d'être une simple babiole, il s'agit d'un instrument de pouvoir absolu qui permettrait à Sauron, le 'Seigneur des ténèbres', de régner sur la 'Terre du Milieu' et de réduire en esclavage ses peuples. Frodon doit parvenir jusqu'à la 'Crevasse du Destin' pour détruire l'anneau.";
    private static final String TEXTE2 = "Après la mort de Boromir et la disparition de Gandalf, la 'Communauté' s'est scindée en trois. Perdus dans les collines d''Emyn Muil', Frodon et Sam découvrent qu'ils sont suivis par Gollum, une créature versatile corrompue par l'anneau magique. Gollum promet de conduire les 'Hobbits' jusqu'à la 'Porte Noire' du 'Mordor'. A travers la 'Terre du Milieu', Aragorn, Legolas et Gimli font route vers le 'Rohan', le royaume assiégé de Theoden.";
    private static final String TEXTE3 = "Les armées de Sauron ont attaqué 'Minas Tirith', la capitale de 'Gondor'. Jamais ce royaume autrefois puissant n'a eu autant besoin de son roi. Cependant, Aragorn trouvera-t-il en lui la volonté d'accomplir sa destinée ? Tandis que Gandalf s'efforce de soutenir les forces brisées de Gondor, Théoden exhorte les guerriers de Rohan à se joindre au combat. Cependant, malgré leur courage et leur loyauté, les forces des Hommes ne sont pas de taille à lutter contre les innombrables légions d'ennemis.";

    public static void main(String[] args) {
        Mapping m = new Mapping(TEXTE1);
        m.start();
        Mapping m2 = new Mapping(TEXTE2);
        m2.start();
        Mapping m3 = new Mapping(TEXTE3);
        m3.start();
        while (m.isAlive() || m2.isAlive() || m3.isAlive()) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        ArrayList<Map<String, Integer>> a = new ArrayList<>();
        a.add(m.getOutput_map());
        a.add(m2.getOutput_map());
        a.add(m3.getOutput_map());
        Reduce r = new Reduce(a);
        r.start();
        while(r.isAlive()){
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        Map<String, Integer> sorted = r.getOutput_map()
                .entrySet()
                .stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .collect(
                        toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2,
                                LinkedHashMap::new));
        System.out.println(sorted);
    }

}
