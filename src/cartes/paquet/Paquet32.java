package cartes.paquet;

import cartes.carte.Carte32;
import cartes.enums.Couleur;
import cartes.enums.Valeur;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Paquet32 extends Paquet<Carte32> {
    public Paquet32() {
        super(new ArrayList<Carte32>());
        Arrays.asList(Couleur.values())
                .forEach(couleur -> Arrays.asList(Valeur.values())
                        .forEach(valeur -> this.paquet.add(new Carte32(couleur, valeur))));
    }

    public void shuffle() {
        Collections.shuffle(Arrays.asList(this.paquet));
    }

    public Carte32 pick() {
        return this.getFirst();
    }
}
