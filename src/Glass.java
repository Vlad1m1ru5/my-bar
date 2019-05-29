// Стакан
public class Glass {
    // Чист
    private boolean clean;
    // Заполнен
    private boolean filled;

    Glass() {
        this.clean = false;
        this.filled = false;
    }

    public boolean isClean() {
        return clean;
    }

    public void setClean(boolean clean) {
        this.clean = clean;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
}
