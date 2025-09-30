// Italian Pizza Builder
public class ItalianPizzaBuilder implements IPizzaBuilder {
    private Pizza pizza = new Pizza();

    @Override
    public void makeDough() {
        pizza.setDough("Thin Crust");
    }

    @Override
    public void makeSauce() {
        pizza.setSauce("Tomato Basil");
    }

    @Override
    public void makeTopping() {
        pizza.setToppings("Mozzarella");
        pizza.addIngredient("Olive oil");
        pizza.addIngredient("Italian Herbes");
    }

    @Override
    public Pizza getPizza() {
        return pizza;
    }
}


