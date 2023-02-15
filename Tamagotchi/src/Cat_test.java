import java.util.Scanner;

public class Cat_test {
    public static void main(String[] arg) {
        Cat[] cats = new Cat[10];
        for (int i = 0; i < cats.length; i++) {
            cats[i] = new Cat();
            cats[i].randomCat();
            cats[i].catInfo();
            System.out.println();
        }
    }
}
