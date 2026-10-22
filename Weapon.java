public class Weapon extends Item{

    Integer addedSkill;

    public Weapon(String name, Integer addedSkill) {
        super(name);
        this.addedSkill = addedSkill;
    }
}