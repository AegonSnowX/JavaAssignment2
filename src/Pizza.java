public class Pizza {
    private String dough;
    private String sauce;
    private String toppings;

    public void setDough(String dough) {
        this.dough = dough;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    public void setToppings(String toppings) {
        this.toppings = toppings;
    }

    public void addIngredient(String ingredient) {
        if (this.toppings == null || this.toppings.isEmpty()) {
            this.toppings = ingredient;
        } else {
            this.toppings += ", " + ingredient;
        }
    }

    public void display() {
        System.out.println("Pizza with " + dough + " dough, "
                + sauce + " sauce, toppings: "
                + toppings);
    }
}