package cartes;

public class Main {

    //Une interface ICarte + classe abstraite Carte (dos visible/cachée) + une fille concrète carte32 + une classe paquet générique.
    // 2 énumérations pour la couleur et les valeurs avec une relation d'ordre sur les cartes liée à leur valeur.

    public static void main(String[] args) {
	    Game game = new Game();
	    game.start();
    }
}
