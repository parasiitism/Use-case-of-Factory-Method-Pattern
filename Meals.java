package FactoryDesignPatter;

public class Meals extends RegularOrders{
    public String name="Meals";
    public int price =4532;

    @Override 
    public void printOrder() {
        System.out.printf("%-15s %10s %n", name, price);
    }
}