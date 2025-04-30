package proxiad.rhamdi.kata;

public class Context {
    private IStrategy strategy;

    public void setStrategy(IStrategy strategy) {
        this.strategy = strategy;
    }

    public void process(){
        System.out.println("Etape 1 ce l'algorithme");
        //C'est cette etape qui est trés dynamique
        strategy.appliquerStrategy();
        System.out.println("Etape finale de l'algorithme");
    }
}
