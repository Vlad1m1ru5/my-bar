// Бар
public class Bar {
    // Бармэн
    private Barman barman;

    private  Bar() {
        barman = new Barman();
    }

    // Приготоать
    private void ready(Barman barman) {
        if (!barman.getCocktail().isMixed() || !barman.getCocktail().isPoured()) {
            // Смешать коктейль
            mix(barman.getCocktail());
            // Налить коктейль в стакан
            pour(barman.getGlass());
        }

        barman.getCocktail().setReady(true);
        System.out.println("Коктейль готов");
    }

    // Смешать
    private void mix(Cocktail cocktail) {
        if (!cocktail.isDraw() || !cocktail.isPoured()) {
            // Составить коктейль
            draw(cocktail, this.barman.getIngredient());
            // Налить коктейль в шейкер
            pour(barman.getShaker());
        }

        cocktail.setMixed(true);
        System.out.println("Коктейль смешан");
    }

    // Налить в стакан
    private void pour(Glass glass) {
        clean(glass);
        drain(this.barman.getIce());

        glass.setFilled(true);
        System.out.println("Коктейль налит в стакан");
    }

    // Налить в шейкер
    private  void pour(Shaker shaker) {
        if (!shaker.isCooled()) {
            take(this.barman.getIce());
            cool(shaker);
        }

        shaker.setEmpty(false);
        System.out.println("Коктейль налит в шейкер");
    }

    // Составить
    private void draw(Cocktail cocktail, Ingredient ingredient) {
        cocktail.setDraw(true);
        if (cocktail.isDraw() || ingredient.isPrepared()) {
            prepare(ingredient);
        }

        cocktail.setDraw(true);
        System.out.println("Бармен составил коктейль");
    }

    // Охладить
    private void cool(Shaker shaker) {
        if (!shaker.isEmpty()) {
            shaker.setCooled(true);
        }

        shaker.setCooled(true);
        System.out.println("Бармен охладил шейкер");
    }

    // Слить
    private void drain(Ice ice) {
        if (ice.isInGlass()) {
            ice.setInGlass(false);
        } else if (ice.isInShaker()) {
            ice.setInShaker(false);
        }

        ice.setDrained(true);
        System.out.println("Бармен слсл лёд");
    }

    // Чистить
    private void clean(Glass glass) {
        if (!glass.isClean() && glass.isFilled()) {
            glass.setFilled(false);
            glass.setClean(true);
        }

        glass.setClean(true);
        System.out.println("Стакан чист");
    }

    // Взять
    private void take(Ice ice) {
        if (!ice.isInGlass() && !ice.isInShaker()) {
            ice.setTaken(true);
        }

        ice.setTaken(true);
        System.out.println("Бармен взял лёд");
    }

    // Подготовить
    private void  prepare(Ingredient ingredient) {
        if (!ingredient.isPlaced() || !ingredient.isCounted() || !ingredient.isSorted()) {
            ingredient.setPlaced(true);
            ingredient.setCounted(true);
            ingredient.setSorted(true);
        }

        ingredient.setPrepared(true);
        System.out.println("Ингредиенты подготовлены");
    }

    public static void main(String[] args) {
        Bar bar = new Bar();

        while (!bar.barman.getCocktail().isReady()) {
            bar.ready(bar.barman);
        }

        System.out.println(bar.barman.getCocktail().isReady());
    }
}
