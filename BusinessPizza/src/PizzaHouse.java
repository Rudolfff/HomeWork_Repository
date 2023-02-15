public class PizzaHouse {
    private int numberOfOrder;
    private int hoursOfWork;
    private Cook[] CookArray = new Cook[10];
    private Stock stock_1;
    private Deliveryman[] DeliverymanArray;
    private OrderList EnterOrders;
    private double orderMultiply;
    private int bank;

    public PizzaHouse(int hoursOfWork) {
        this.numberOfOrder = 0;
        this.hoursOfWork = hoursOfWork;
        this.CookArray[0] = new Cook();
        this.stock_1 = new Stock(6, 60);
        this.DeliverymanArray[0] = new Deliveryman();
        this.EnterOrders = new OrderList(300);
        this.orderMultiply = 1.0;
        this.bank = 1000;
    }

    public void workDay() {
        this.EnterOrders = new OrderList(300);
        for (int i = 0; i < (int)(5 + Math.random() * (25 * this.orderMultiply)); i++) {
            this.numberOfOrder++;
            Order x = new Order(this.numberOfOrder, (int)(250 + Math.random() * 1250));
            this.EnterOrders.orderPlus(x);
        } // Добавляет в очередь заказы
        for (Cook x : this.CookArray) {

        }
    }
}
