public class Deliveryman {
    private OrderList ordersArray;
    private int size;
    private int salary;

    public Deliveryman() {
        this.randomDeliveryman();
    } //
    public Deliveryman(int size, int salary) {
        this.size = size;
        this.ordersArray = new OrderList(size);
    }

    private Deliveryman randomDeliveryman() {
        return new Deliveryman((int)(1 + Math.random() * 6), (int)(1000 + Math.random() * 500));
    }
}
