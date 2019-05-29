// Бармэн
public class Barman {
    // Коктейль
    private Cocktail cocktail;
    // Стакан
    private Glass glass;
    // Лёд
    private Ice ice;
    // Ингредиенты
    private Ingredient ingredient;
    // Штейкер
    private Shaker shaker;

    Barman() {
        cocktail = new Cocktail();
        glass = new Glass();
        ice = new Ice();
        ingredient = new Ingredient();
        shaker = new Shaker();
    }

    public Cocktail getCocktail() {
        return cocktail;
    }

    public void setCocktail(Cocktail cocktail) {
        this.cocktail = cocktail;
    }

    public Glass getGlass() {
        return glass;
    }

    public void setGlass(Glass glass) {
        this.glass = glass;
    }

    public Ice getIce() {
        return ice;
    }

    public void setIce(Ice ice) {
        this.ice = ice;
    }

    public Ingredient getIngredient() {
        return ingredient;
    }

    public void setIngredient(Ingredient ingredient) {
        this.ingredient = ingredient;
    }

    public Shaker getShaker() {
        return shaker;
    }

    public void setShaker(Shaker shaker) {
        this.shaker = shaker;
    }
}

