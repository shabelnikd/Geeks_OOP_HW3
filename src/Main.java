//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Массив из 3 разных героев
        Hero[] heroes = {
                new Magic(270, 25, "Darkness power"),
                new Medic(255, 10, "Health Up", 100), // Здесь было 100
                new Warrior(270, 40, "Critical Damage")
        };

        for (Hero hero : heroes) {
            // Применение суперспособности через цикл
            hero.applySuperAbility();

            // Через приведение типов увеличиваем опыт лечения медика
            if (hero instanceof Medic medic) {
                medic.increaseExperience();
            }
        }

        // Через приведение типов, проверяем увеличилось ли значение
        System.out.println(((Medic)heroes[1]).getHealPoints()); // Здесь стало 110
    }
}