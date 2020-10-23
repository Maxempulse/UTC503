package cartes.carte;

import cartes.enums.Couleur;
import cartes.enums.Valeur;

public class Carte32 extends Carte {
    private static final String DOS = "[*****]";

    private final Couleur couleur;
    private final Valeur valeur;

    public Carte32(Couleur couleur, Valeur valeur) {
        super(DOS);
        this.couleur = couleur;
        this.valeur = valeur;
    }

    public Couleur getCouleur() {
        return couleur;
    }

    public Valeur getValeur() {
        return valeur;
    }

    public boolean compareTo(ICarte carte) {
        boolean result = false;
        try {
            Carte32 carteAsCarte32 = (Carte32) carte;
            result = this.valeur.ordinal() >= carteAsCarte32.valeur.ordinal();
        } catch (ClassCastException e) {
            System.out.println("TODO DEBUG : problème de cast , ICarte comparée n'est pas une Carte 32");
        }

        return result;
    }

    public String getFace() {
        return "["+this.valeur.toString()+this.couleur.toString()+"]";

    }
}
