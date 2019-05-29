// Коктейль
public class Cocktail {
    // Готов
    private boolean ready;
    // Смешан
    private boolean mixed;
    // Налит
    private boolean poured;
    // Составлен
    private boolean draw;

    Cocktail() {
        this.ready = false;
        this.mixed = false;
        this.poured = false;
        this.draw = false;
    }

    public boolean isReady() {
        return ready;
    }

    public void setReady(boolean ready) {
        this.ready = ready;
    }

    public boolean isMixed() {
        return mixed;
    }

    public void setMixed(boolean mixed) {
        this.mixed = mixed;
    }

    public boolean isPoured() {
        return poured;
    }

    public void setPoured(boolean poured) {
        this.poured = poured;
    }

    public boolean isDraw() {
        return draw;
    }

    public void setDraw(boolean draw) {
        this.draw = draw;
    }
}
