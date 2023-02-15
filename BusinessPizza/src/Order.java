public class Order {
    private final int number;
    private final int coast;
    private int timeIsGone;

    public Order(int number, int coast) {
        this.number = number;
        this.coast = coast;
        this.timeIsGone = 0;
    }

    public int getNumber() {
        return number;
    }

    public int getCoast() {
        return coast;
    }

    public int getTimeIsGone() {
        return timeIsGone;
    }

    public void setTimeIsGone(int timeIsGone) {
        this.timeIsGone = timeIsGone;
    }

    public Order randomOrder(int numberBefore) {
        Order x = new Order(numberBefore + 1, (int)(250 + Math.random() * 1250));
        return x;
    } // нужно указать номер предыдущего заказа
}
