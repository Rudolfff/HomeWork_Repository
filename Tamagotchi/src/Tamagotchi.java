import java.util.Scanner;

public class Tamagotchi {
    private SomeCat cat;

    private SomeDog dog;

    private SomeHamster hamster;

    public Tamagotchi() {
        this.cat = new SomeCat("Барсик", 3.5, 4, 2, 4);
        this.dog = new SomeDog("Дружок", 3.1, 6, 1, 2);
        this.hamster = new SomeHamster("Иисуслик", 0.1, 1, 1, 1);
    }

    private void isDead() {
        if (this.hamster.getLife() == false) {
            System.out.println("Вы не достаточно заботились о вашем хомяке. " + this.hamster.getName() + " умер");
        }
        if (this.cat.getLife() == false) {
            System.out.println("Вы не достаточно заботились о вашем коте. " + this.cat.getName() + " умер");
        }
        if (this.dog.getLife() == false) {
            System.out.println("Вы не достаточно заботились о вашей собаке. " + this.dog.getName() + " умер");
        }
    }

    private void givEat(Someone x) {
        x.setHunger(1);
    }

    private void givFun(Someone x) {
        x.setHappy(1);
    }

    private void allAlive() {
        if (this.dog.getLife()) {
            System.out.println(this.dog.toString());
            System.out.println();
        }
        if (this.cat.getLife()) {
            System.out.println(this.cat.toString());
            System.out.println();
        }
        if (this.hamster.getLife()) {
            System.out.println(this.hamster.toString());
            System.out.println();
        }
    }

    private void round() {
        System.out.println("У вас есть:");
        this.allAlive();
        System.out.println("Чтобы провести время с собакой, нажмите 1, чтобы провести время с котом, нажмите 2, чтобы провести время с хомяком, нажмите 3");
        int yt = new Scanner(System.in).nextInt();
        this.spendTimeWith(yt);
        this.isDead();
    }

    public void play() {
        while (this.hamster.getLife() || this.dog.getLife() || this.cat.getLife()) {
            this.round();
            System.out.println();
        }
        System.out.println("Пора покупать новых питомцев!");
    }
    private void spendTimeWith(int x /*1 это пес, 2 кот, 3 хомяк*/) {
        int op = 0;
        if (x == 1 && this.dog.getLife()) {
            this.whatCanDo();
            op = new Scanner(System.in).nextInt();
            if (op == 1) {
                this.dog.setHunger(1);
                this.dog.timeIsGone(true, false);
                this.hamster.timeIsGone(false, false);
                this.cat.timeIsGone(false, true);
            }
            if (op == 2) {
                this.dog.setHappy(1);
                this.dog.timeIsGone(false, true);
                this.hamster.timeIsGone(false, false);
                this.cat.timeIsGone(false, true);
            }
            if (op == 3) {
                this.dog.voice();
                this.dog.timeIsGone(false, false);
                this.cat.timeIsGone(false, true);
                this.hamster.timeIsGone(false, false);
            }
        }
        if (x == 2 && this.cat.getLife()) {
            this.whatCanDo();
            op = new Scanner(System.in).nextInt();
            if (op == 1) {
                this.cat.setHunger(1);
                this.cat.timeIsGone(true, false);
                this.dog.timeIsGone(false, false);
                this.hamster.timeIsGone(false, false);
            }
            if (op == 2) {
                this.cat.setHappy(1);
                this.cat.timeIsGone(false, true);
                this.dog.timeIsGone(false, false);
                this.hamster.timeIsGone(false, false);
            }
            if (op == 3) {
                this.cat.voice();
                this.cat.timeIsGone(false, false);
                this.dog.timeIsGone(false, false);
                this.hamster.timeIsGone(false, false);
            }
        }
        if (x == 3 && this.hamster.getLife()) {
            this.whatCanDo();
            op = new Scanner(System.in).nextInt();
            if (op == 1) {
                this.hamster.setHunger(1);
                this.hamster.timeIsGone(true, false);
                this.dog.timeIsGone(false, false);
                this.cat.timeIsGone(false, true);
            }
            if (op == 2) {
                this.hamster.setHappy(1);
                this.hamster.timeIsGone(false, true);
                this.dog.timeIsGone(false, false);
                this.cat.timeIsGone(false, true);
            }
            if (op == 3) {
                this.hamster.voice();
                this.hamster.timeIsGone(false, false);
                this.dog.timeIsGone(false, false);
                this.cat.timeIsGone(false, true);
            }
        }
    } // Взаимодействуем с одним из животных
    private void whatCanDo() {
        System.out.println("Вы можете:" +
                "\n1. Покормить" +
                "\n2. Поиграть" +
                "\n3. Потренировать команду *голос*");
    }
}
