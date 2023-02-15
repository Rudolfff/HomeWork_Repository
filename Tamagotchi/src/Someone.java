public class Someone {
    private String name;

    private String toSay;
    private double weight;
    private int age;
    private int hunger;

    private int indexHunger;
    private int happy;

    private int indexHappy;

    private boolean life;

    public Someone() {
        this.name = "Найденыш";
        this.weight = 5.0;
        this.age = 1;
        this.hunger = 100;
        this.happy = 100;
        this.life = true;
        this.indexHappy = 1;
        this.indexHunger = 1;
    }

    public Someone(String name, double weight, int age, int indexHappy, int indexHunger, String toSay) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.hunger = 100;
        this.happy = 100;
        this.life = true;
        this.indexHappy = indexHappy;
        this.indexHunger = indexHunger;
        this.toSay = toSay;
    }

    private void death() {
        if (this.happy <= 0 || this.hunger <= 0) {
            this.life = false;
        } else if (Math.random() * 10 == 0) {
            this.life = false;
        }
    } // Смерть от голода и скуки или по случайности

    public void setHunger(int x) {
        if (x > 0) {
            this.hunger = this.hunger + (int) ((Math.random() * 10) * this.indexHunger);
            if (this.hunger > 100) {
                this.hunger = 100;
            }
        } else {
            this.hunger = this.hunger - (int) ((Math.random() * 10) * this.indexHunger);
            if (this.hunger <= 0) {
                this.death();
            }
        }
    } // x > 1 кормим, x < 0 уменьшаем. Изменить значение параметра голод. Не больше 100. В случае 0 и меньше - убить.

    public void setHappy(int x) {
        if (x > 0) {
            this.happy = this.happy + (int) ((Math.random() * 10) * this.indexHappy);
            if (this.happy > 100) {
                this.happy = 100;
            }
        } else {
            this.happy = this.happy - (int) ((Math.random() * 10) * this.indexHappy);
            if (this.happy <= 0) {
                this.death();
            }
        }
    } // x > 1  веселим, x < 0 уменьшаем. Изменить значение параметра голод. Не больше 100. В случае 0 и меньше - убить.

    public void setAge() {
        this.age++;
    }

    public int getHunger() {
        return this.hunger;
    }

    public int getHappy() {
        return this.happy;
    }

    public String getName() {
        return this.name;
    }

    public boolean getLife() {
        return life;
    }

    public void voice() {
        System.out.println(toSay);
    }

    public void timeIsGone(boolean eat, boolean fun) {
        this.setAge();
        if (eat == false) {
            this.setHunger(-1);
        }
        if (fun == false) {
            this.setHappy(-1);
        }
    }
}
