public class SomeHamster extends Someone{
    public SomeHamster(String name, double weight, int age, int indexHappy, int indexHunger) {
        super(name, weight, age, indexHappy, indexHunger, "*Вы слышите хруст*");
    }
    public String toString() {
        return "Хомяк по имени: " + this.getName() +"\nЕго голод составляет: " + this.getHunger() + "\nЕго уровень счастья: " + this.getHappy();
    }
}
