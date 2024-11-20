// Шаг 2: создать абстрактный клас и реализовать интерфейс
public abstract class Hero implements HavingSuperAbility {
    private int health; // Здоровье
    private int damage; // Урон
    private final String superAbilityType; // Тип суперспособности

    @Override
    public abstract void applySuperAbility(); // Абстрактная реализация метода из интерфейса

    public Hero(int health, int damage, String superAbilityType) {
        setHealth(health);
        setDamage(damage);
        this.superAbilityType = superAbilityType;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = Math.max(health, 0);
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = Math.max(damage, 0);
    }

    public String getSuperAbilityType() {
        return superAbilityType;
    }

}
