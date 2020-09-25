package Exercice2;

public abstract class Animal {

    protected String nom;
    protected TypeAnimal type;
    protected double poids;
    /**
     * true = femelle
     * false = male
     */
    protected boolean sexe;

    public Animal(String nom, double poids, boolean sexe) {
        this.nom = nom;
        this.poids = poids;
        this.sexe = sexe;
    }

    public String getNom() {
        return nom;
    }

    public TypeAnimal getType() {
        return type;
    }

    public double getPoids() {
        return poids;
    }

    public boolean isSexe() {
        return sexe;
    }
}
