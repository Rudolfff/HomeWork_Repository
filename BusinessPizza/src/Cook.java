import javax.swing.plaf.PanelUI;

public class Cook {
    private String name;
    private int orderForOur;
    private int salary;
    private int orderNowDoing;
    private OrderList arrayOrderCook;

    public Cook() {
        this.name = "Вася №" + (int) (Math.random() * 100);
        this.orderForOur = (int) (1 + Math.random() * 4);
        this.salary = (int) (1500 + Math.random() * 1000);
        this.orderNowDoing = 0;
        this.arrayOrderCook = new OrderList(orderForOur);
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
        this.arrayOrderCook.orderPlus(x);
    }

    public Order OrderToStock() {
        return this.arrayOrderCook.orderMinus();
    }
}
