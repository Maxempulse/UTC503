package cartes.carte;

public abstract class Carte implements ICarte{

    private final String DOS;
    private boolean visible = false;

    public Carte(String DOS) {
        super();
        this.DOS = DOS;
    }

    public boolean isVisible() {
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    public void tourner(){
        visible = !visible;
    }
}
