public class SomeCat extends Someone {

    public SomeCat(String name, double weight, int age, int indexHappy, int indexHunger) {
        super(name, weight, age, indexHappy, indexHunger, "Мяяяууууу");
    }

    @Override
    public String toString() {
        return "Кот по имени: " + this.getName() +"\nЕго голод составляет: " + this.getHunger() + "\nЕго уровень счастья: " + this.getHappy();
    }
}
