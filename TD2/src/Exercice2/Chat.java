package Exercice2;

public class Chat extends Animal {

    public Chat(String nom, double poids, boolean sexe) {
        super(nom, poids, sexe);
        this.type = TypeAnimal.CHAT;
    }
}
