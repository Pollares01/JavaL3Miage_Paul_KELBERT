package Exercice2;

public class Chien extends Animal {


    private boolean chienDeChasse;

    public Chien(String nom, double poids, boolean sexe, boolean chienDeChasse) {
        super(nom, poids, sexe);
        this.type = TypeAnimal.CHIEN;
        this.chienDeChasse = chienDeChasse;
    }
}
