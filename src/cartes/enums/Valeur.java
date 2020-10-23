package cartes.enums;

public enum Valeur {
    SEPT("7"), HUIT("8"), NEUF("9"), DIX("10"), VALET("V"), DAME("D"), ROI("R"), AS("A");

    private final String trigramme;

    private Valeur(String trigramme) {
        this.trigramme = trigramme;
    }

    @Override
    public String toString() {
        return trigramme;
    }
}
