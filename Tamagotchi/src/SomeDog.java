public class SomeDog extends Someone{
    public SomeDog(String name, double weight, int age, int indexHappy, int indexHunger) {
        super(name, weight, age, indexHappy, indexHunger, "Гав-гав-гав");
    }
    public String toString() {
        return "Пес по имени: " + this.getName() +"\nЕго голод составляет: " + this.getHunger() + "\nЕго уровень счастья: " + this.getHappy();
    }
}
