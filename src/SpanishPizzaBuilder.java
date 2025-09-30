// Spanish Pizza Builder
public class SpanishPizzaBuilder implements IPizzaBuilder {
    private Pizza pizza = new Pizza();

    @Override
    public void makeDough() {
        pizza.setDough("Regular Crust");
    }

    @Override
    public void makeSauce() {
        pizza.setSauce("Spicy Tomato");
    }

    @Override
    public void makeTopping() {
        pizza.addIngredient("Olive oil");
        pizza.addIngredient("Spanish Herbes");
        pizza.addIngredient("Extra Paprika");
    }

    @Override
    public Pizza getPizza() {
        return pizza;
    }
}
