public class ComboCreator {
    public static Combos createCombos(ComboCode comboCode){
        switch(comboCode){
            case LITE:
            System.out.println("Selected Combo: LiteCombo \n");
            return new LiteCombo();
            case FAMILY:
            System.out.println("Selected Combo: LiteCombo \n");
            return new LiteCombo();
            case MEGA:
            System.out.println("Selected combo: MegaCombo \n");
            return new MegaCombo();
            default:
            return null;
        }
    }
}