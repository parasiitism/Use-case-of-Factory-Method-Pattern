public class Desserts extends RegularOrders {
    public String name="Desserts";
    public int price =100;

    @Override
    public void printOrder() {
        System.out.printf("%-15s %10s %n", name, price);
    }
}