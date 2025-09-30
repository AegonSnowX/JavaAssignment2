public class Main {
    public static void main(String[] args) {
        Chef chef1 = new Chef(new ItalianPizzaBuilder());
        Pizza italian = chef1.getPizza();
        italian.display();

        Chef chef2 = new Chef(new SpanishPizzaBuilder());
        Pizza spanish = chef2.getPizza();
        spanish.display();

        Chef chef3 = new Chef(new SenegalPizzaBuilder());
        Pizza senegal = chef3.getPizza();
        senegal.display();
    }
}
