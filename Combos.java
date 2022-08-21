import java.util.ArrayList;
import java.util.List;

public abstract class Combos {
    protected List<RegularOrders> regularOrders= new ArrayList<>();

    public Combos() {
        combosDetails();
    }
    protected abstract void combosDetails(); // abstract method details
    public void printOrder() {
        System.out.printf("%-15s %10s %n","Type", "Price");
        for(int i=1;i<regularOrders.size();i++){
            regularOrders.get(i).printOrder();
        }
        System.out.println("______________________________\n");
    }
}