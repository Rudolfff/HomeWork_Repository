import javax.swing.plaf.PanelUI;

public class Cook {
    private String name;
    private int orderForOur;
    private int salary;
    private int orderNowDoing;
    private OrderList arrayOrderCook;

    public Cook() {
        this.randomCook();
    } // Создает случайного повара

    public Cook(String name, int orderForOur, int salary) {
        this.name = name;
        this.orderForOur = orderForOur;
        this.salary = salary;
        this.orderNowDoing = 0;
        this.arrayOrderCook = new OrderList(orderForOur);
    }

    public String getName() {
        return name;
    }

    public int getOrderForOur() {
        return orderForOur;
    }

    public int getSalary() {
        return salary;
    }

    public int getOrderNowDoing() {
        return orderNowDoing;
    }

    public OrderList getArrayOrderCook() {
        return arrayOrderCook;
    }

    public void setOrderNowDoing(int orderNowDoing) {
        this.orderNowDoing = orderNowDoing;
    }

    public void setNewOrder(Order x) {
        arrayOrderCook.orderPlus(x);
    }

    public Cook randomCook() {
        String h = "Вася №" + (int) (Math.random() * 100);
        Cook x = new Cook(h, (int) (1 + Math.random() * 4), (int) (1500 + Math.random() * 1000));
        return x;
    } // передать число поваров, которые уже есть
}
