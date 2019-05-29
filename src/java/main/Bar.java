package java.main;

// Бар
public class Bar {
    // Бармэн
    private Barman barman;

    private  Bar() {
        barman = new Barman();
    }

    // Приготоать
    private void ready(Barman barman) {
        if (!barman.getCocktail().isReady()) {

            barman.getCocktail().setReady(true);
        }

        System.out.println("Коктейль готов");
    }

    // Смешать
    private void mix(Barman barman, Cocktail cocktail) {
        System.out.println("Коктейль смешан");
    }

    // Налить
    private void pour(Barman barman, Cocktail cocktail) {
        System.out.println("Коктейль налит в стакан");
    }

    // Составить
    private void draw(Barman barman, Cocktail cocktail) {
        System.out.println("Бармен составил коктейль");
    }

    // Охладить
    private void cool(Barman barman, Shaker shaker) {
        System.out.println("Бармен охладил шейкер");
    }

    // Слить
    private void drain(Barman barman, Ice ice) {
        System.out.println("Бармен лил лёд");
    }

    // Чистить
    private void clean(Barman barman, Glass glass) {
        System.out.println("Стакан чист");
    }

    // Взять
    private void take(Barman barman, Ice ice) {
        System.out.println("Бармен взял лёд");
    }

    // Подготовить
    private void  prepare(Barman barman, Ingredient ingredient) {
        System.out.println("Ингредиенты подготовлены");
    }

    public static void main(String[] args) {
        Bar bar = new Bar();
        bar.ready(bar.barman);
    }
}
