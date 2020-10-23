package cartes.paquet;

import cartes.carte.ICarte;

import java.util.ArrayList;

public class Paquet<T extends ICarte>{
    public ArrayList<T> paquet;

    public Paquet(ArrayList<T> paquet) {
        this.paquet = paquet;
    }

    public void add(T element) {
        paquet.add(element);
    }

    public void remove(T element) {
        paquet.remove(element);
    }

    public T getFirst() {
        paquet.get(0).tourner();
        return paquet.get(0);
    }
}
