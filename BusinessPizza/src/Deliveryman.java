public class Deliveryman {
    private OrderList ordersArray;
    private int size;
    private int salary;

    public Deliveryman() {
       this.size = (int)(1 + Math.random() * 6);
       this.salary = (int)(1000 + Math.random() * 500);
       this.ordersArray = new OrderList(this.size);
    } //
    public Deliveryman(int size, int salary) {
        this.size = size;
        this.ordersArray = new OrderList(size);
    }

    public void PlaceOrderInDelivery(Order x) {
        this.ordersArray.orderPlus(x);
    }

    public int getSize() {
        return size;
    }

    public OrderList getOrdersArray() {
        return ordersArray;
    }

    public int getSalary() {
        return salary;
    }
}
