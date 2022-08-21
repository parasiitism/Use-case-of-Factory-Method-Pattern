public class Salads extends RegularOrders {
    public String name="Salads";
    public int price =500;

    @Override
    public void printOrder() {
        System.out.printf("%-15s %10s %n", name, price);
    }
}