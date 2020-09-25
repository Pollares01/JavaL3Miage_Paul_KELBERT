package Exercice3;

import java.util.ArrayList;
import java.util.Comparator;

public class Anime {

    public String titre;
    public Double musique;
    public Double graphique;
    public Double storyline;
    public Double personnages;
    public Double moyenne;

    public Anime(String titre, Double musique, Double graphique, Double storyline, Double personnages) {
        this.titre = titre;
        this.musique = musique;
        this.graphique = graphique;
        this.storyline = storyline;
        this.personnages = personnages;
        this.moyenne = (this.musique+this.graphique+this.personnages+this.storyline)/4;
    }

    @Override
    public String toString() {
        return "Anime{" +
                "titre='" + titre + '\'' +
                ", musique=" + musique +
                ", graphique=" + graphique +
                ", storyline=" + storyline +
                ", personnages=" + personnages +
                '}';
    }

    public static void main(String[] args) {
        Anime a1 = new Anime("L'attaque des titans", 9.7, 9.9, 9.2, 8.5);
        Anime a2 = new Anime("Naruto Shippuden", 9.5, 9.7, 9.0, 9.9);
        Anime a3 = new Anime("Hunter x Hunter", 9.4, 8.5, 8.5, 9.7);
        Anime a4 = new Anime("Fullmetal Alchemist", 8.8, 8.9, 9.7, 9.5);
        Anime a5 = new Anime("Death note", 8.6, 9.5, 9.8, 9.3);

        ArrayList<Anime> listAnime = new ArrayList<>();
        listAnime.add(a1);
        listAnime.add(a2);
        listAnime.add(a3);
        listAnime.add(a4);
        listAnime.add(a5);
        listAnime.sort(Comparator.comparing(o -> o.titre));
        for(Anime a : listAnime){
            System.out.println(a.titre);
        }
        System.out.println("\n");

        listAnime.sort((o1, o2) -> {
            if (o1.moyenne.equals(o2.moyenne))
                return 0;
            else if (o1.moyenne > o2.moyenne)
                return -1;
            else
                return 1;
        });
        for(Anime a : listAnime){
            System.out.println(a.titre + " -> " + a.moyenne);
        }




    }
}


