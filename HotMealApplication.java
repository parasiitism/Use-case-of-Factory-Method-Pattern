public class HotMealApplication {
    public static void main(String[] args){
        Combos combos= ComboCreator.createCombos(ComboCode.LITE);
        combos.printOrder();

        Combos combos1=ComboCreator.createCombos(ComboCode.FAMILY);
        combos1.printOrder();

        Combos combos2=ComboCreator.createCombos(ComboCode.Mega);
        combos2.printOrder();
    }
}