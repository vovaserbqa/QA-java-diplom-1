package praktikum;

/**
 * Модель ингредиента.
 * Ингредиент: начинка или соус.
 * У ингредиента есть тип (начинка или соус), название и цена.
 */
public class Ingredient {

    public IngredientType type;
    public String name;
    public int price;

    public Ingredient(IngredientType type, String name, int price) {
        this.type = type;
        this.name = name;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public IngredientType getType() {
        return type;
    }
}