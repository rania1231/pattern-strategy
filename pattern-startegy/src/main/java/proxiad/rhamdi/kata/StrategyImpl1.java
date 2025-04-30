package proxiad.rhamdi.kata;

public class StrategyImpl1 implements IStrategy {
    @Override
    public void appliquerStrategy() {
        System.out.println("Etape intermidiaire avec strategie 1");
    }
}
