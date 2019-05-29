// Шейкер
public class Shaker {
    // Охлаждён
    private boolean cooled;
    // Пуст
    private boolean empty;

    Shaker() {
        this.cooled = false;
        this.empty = false;
    }

    public boolean isCooled() {
        return cooled;
    }

    public void setCooled(boolean cooled) {
        this.cooled = cooled;
    }

    public boolean isEmpty() {
        return empty;
    }

    public void setEmpty(boolean empty) {
        this.empty = empty;
    }
}
