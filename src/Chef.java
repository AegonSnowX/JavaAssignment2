public class Chef {
    private IPizzaBuilder pizzaBuilder;

    public Chef(IPizzaBuilder pizzaBuilder) {
        this.pizzaBuilder = pizzaBuilder;
    }

    private void constructPizza() {
        pizzaBuilder.makeDough();
        pizzaBuilder.makeSauce();
        pizzaBuilder.makeTopping();
    }

    public Pizza getPizza() {
        constructPizza();
        return pizzaBuilder.getPizza();
    }
}
