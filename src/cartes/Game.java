package cartes;

import cartes.paquet.Paquet32;

import java.util.Scanner;

public class Game {
    Paquet32 paquet = new Paquet32();

    public Game() {
        this.paquet.shuffle();
    }

    private void drawCard() {
        System.out.println(paquet.pick().getFace());
    }

    private int respond() {
        try ( Scanner scanner = new Scanner( System.in ) ) {
            return scanner.nextInt();
        }
    }

    public void start() {
        System.out.println("Start playing");
        do {
            this.drawCard();
            this.respond();
        } while(this.paquet.isEmpty());

    }
}
