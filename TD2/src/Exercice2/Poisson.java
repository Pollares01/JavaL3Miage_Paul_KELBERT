package Exercice2;

public class Poisson extends Animal {

    private boolean eauxDouce;
    private int temperature;

    public Poisson(String nom, double poids, boolean sexe, boolean eauxDouce, int temperature) {
        super(nom, poids, sexe);
        this.type = TypeAnimal.POISSON;
        this.eauxDouce = eauxDouce;
        this.temperature = temperature;
    }
}
