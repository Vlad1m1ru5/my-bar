package java.main;

// Лёд
public class Ice {
    // Слит
    private boolean drained;
    // Взят
    private boolean taken;
    // В стакане
    private boolean inGlass;
    // В шейкере
    private boolean inShaker;

    Ice() {
        this.drained = false;
        this.taken = false;
        this.inGlass = false;
        this.inShaker = false;
    }

    public boolean isDrained() {
        return drained;
    }

    public void setDrained(boolean drained) {
        this.drained = drained;
    }

    public boolean isTaken() {
        return taken;
    }

    public void setTaken(boolean taken) {
        this.taken = taken;
    }

    public boolean isInGlass() {
        return inGlass;
    }

    public void setInGlass(boolean inGlass) {
        this.inGlass = inGlass;
    }

    public boolean isInShaker() {
        return inShaker;
    }

    public void setInShaker(boolean inShaker) {
        this.inShaker = inShaker;
    }
}
