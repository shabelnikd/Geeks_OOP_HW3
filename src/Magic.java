// Наследование реализовано метод реализован
public class Magic extends Hero{

    public Magic(int health, int damage, String superAbilityType) {
        super(health, damage, superAbilityType);
    }

    @Override
    public void applySuperAbility() {
        System.out.println("Magic used: " + this.getSuperAbilityType());
    }
}
