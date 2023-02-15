public final class Singleton {
    private static Singleton AR;

    private Singleton() {}

    public static Singleton getAR() {
        if (AR == null) {
            AR = new Singleton();
        }
        return AR;
    }

    public static void toSay() {
        System.out.println("Я класс созданный по паттерну одиночка. Мой экземпляр на свете единственный и неповторимый, прямо как Антон!");
    }
}
