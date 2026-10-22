public class Potion extends Item{
    
    Integer statChangeValue;

    public Potion(String name, Integer statChangeValue){
        super(name);
        this.statChangeValue = statChangeValue;
    }
}