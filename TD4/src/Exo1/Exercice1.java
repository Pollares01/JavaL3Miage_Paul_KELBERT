package Exo1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.stream.Collectors;

public class Exercice1 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("names.txt"));
        String ligne;
        ArrayList<String> list = new ArrayList<>();
        while ((ligne = br.readLine()) != null) {
            list.add(ligne);
        }
        br.close();
        System.out.println("====== Nombre d'éléments dans la liste =====");
        System.out.println(list.stream().count());
        System.out.println();

        System.out.println("===== Liste des mots se finissant par a =====");
        System.out.println(list.stream().filter(x -> x.endsWith("a")).collect(Collectors.toList()));
        System.out.println();

        System.out.println("===== Nombre de mots se finissant par a =====");
        System.out.println(list.stream().filter(x -> x.endsWith("a")).count());
        System.out.println();

        System.out.println("===== Listes des prénoms cités une seule fois =====");
        System.out.println(list.stream().distinct().collect(Collectors.toList()));

    }

}
