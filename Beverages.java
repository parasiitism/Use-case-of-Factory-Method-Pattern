public class Beverages extends RegularOrders {
    public String name="Beverages";
    public int price =200;

    @Override
    public void printOrder() {
        System.out.printf("%-15s %10s %n", name, price);
    }
}