public class FamilyCombo extends Combos{
    @Override
    protected void combosDetails() {
        regularOrders.add(new Meals());
        regularOrders.add(new Beverages());
        regularOrders.add(new Desserts());
    }
}