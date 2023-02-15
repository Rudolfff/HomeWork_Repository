import java.math.MathContext;
import java.text.DecimalFormat;
import java.util.Locale;

public class Cat {
    private int paws = 4, age = 1;
    private boolean tail = true;
    private double weight = 2.5;
    private String name = "Барсик";

    public Cat() {
    }

    public Cat(int paws, boolean tail, double weight, int age, String name) {
        this.paws = paws;
        this.tail = tail;
        this.weight = weight;
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public int getPaws() {
        return this.paws;
    }

    public boolean getTail() {
        return this.tail;
    }

    public double getWeight() {
        return this.weight;
    }

    public String getName() {
        return this.name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPaws(int paws) {
        this.paws = paws;
    }

    public void setTail(boolean tail) {
        this.tail = tail;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String randomName() {
        String[] st = {"им", "ад", "яс", "тон", "мир", "ос", "тур", "кис", "тап", "кя"};
        String name = st[(int) (Math.random() * 10)] + st[(int) (Math.random() * 10)];
        return name.substring(0, 1).toUpperCase() + name.substring(1);
    }

    public void randomCat() {
        this.weight = (0.4 + Math.random() * 15);
        this.tail = Math.random() > 0.49 ? true : false;
        this.age = (int) (Math.random() * 21);
        this.paws = (int) (Math.random() * 2 + 3);
        this.name = randomName();
    }

    public void catInfo() {
        if (this.age < 3) {
            System.out.print("Это совсем молодой кот. ");
        } else if (this.age < 7) {
            System.out.print("Это уже взрослый кот. ");
        } else {
            System.out.print("Это старый кот. ");
        }
        if (tail == false && paws != 4) {
            System.out.print("Его потрепала жизнь. У него нет хвоста и всего " + this.paws + " лапы. ");
        } else if (paws != 4) {
            System.out.print("Его потрепала жизнь. У него только " + this.paws + " лапы. ");
        } else if (tail == false) {
            System.out.print("Его потрепала жизнь. У него нет хвоста. ");
        } else {
            System.out.print("Он совершенно здоров! ");
        }
        System.out.print("Его вес составляет " + this.weight + " кило. ");
        System.out.print("И зовут этого красавца " + this.name + ".");
    }
}