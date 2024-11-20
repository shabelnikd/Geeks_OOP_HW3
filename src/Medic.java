// Наследование реализовано метод реализован
public class Medic extends Hero {
    // Новое поле для медика
    private double healPoints;

    public Medic(int health, int damage, String superAbilityType, double healPoints) {
        super(health, damage, superAbilityType);
        setHealPoints(healPoints);
    }

    public double getHealPoints() {
        return healPoints;
    }

    public void setHealPoints(double healPoints) {
        this.healPoints = Math.max(healPoints, 0);
    }

    // Метод повышения единиц лечения на 10%
    public void increaseExperience() {
        this.healPoints += this.healPoints * 0.1;
    }

    @Override
    public void applySuperAbility() {
        System.out.println("Medic used: " + this.getSuperAbilityType());
    }
}
