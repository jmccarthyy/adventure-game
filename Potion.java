public class Potion extends Item{

    Integer statChangeValue;
    String statType;
    boolean isUseable;

    public Potion(String name, Integer statChangeValue, String statType, boolean isUseable){
        super(name);
        this.statChangeValue = statChangeValue;
        this.statType = statType;
        this.isUseable = isUseable;
    }
}