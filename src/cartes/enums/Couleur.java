package cartes.enums;

public enum Couleur {
    PIQUE("PIK"), COEUR("COE"), CARREAU("CAR"), TREFLE("TRE");

    private final String trigramme;

    Couleur(String trigramme) {
        this.trigramme = trigramme;
    }

    @Override
    public String toString() {
        return trigramme;
    }
}
