
// Senegal Pizza Builder
public class SenegalPizzaBuilder implements IPizzaBuilder {
    private Pizza pizza = new Pizza();

    @Override
    public void makeDough() {
        pizza.setDough("Senegalian Dough");
    }

    @Override
    public void makeSauce() {
        pizza.setSauce("Senegalian Sauce");
    }

    @Override
    public void makeTopping() {
        pizza.setToppings("Chicken");
        pizza.addIngredient("Senegaliano");
    }

    @Override
    public Pizza getPizza() {
        return pizza;
    }
}