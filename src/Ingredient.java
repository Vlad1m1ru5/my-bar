// Ингредиент
public class Ingredient {
    // Подготовлен
    private boolean prepared;
    // Подсчитан
    private boolean counted;
    // Отсортирован
    private boolean sorted;
    // На месте
    private boolean placed;

    Ingredient() {
        this.prepared = false;
        this.counted = false;
        this.sorted = false;
        this.placed = false;
    }

    public boolean isPrepared() {
        return prepared;
    }

    public void setPrepared(boolean prepared) {
        this.prepared = prepared;
    }

    public boolean isCounted() {
        return counted;
    }

    public void setCounted(boolean counted) {
        this.counted = counted;
    }

    public boolean isSorted() {
        return sorted;
    }

    public void setSorted(boolean sorted) {
        this.sorted = sorted;
    }

    public boolean isPlaced() {
        return placed;
    }

    public void setPlaced(boolean placed) {
        this.placed = placed;
    }
}
