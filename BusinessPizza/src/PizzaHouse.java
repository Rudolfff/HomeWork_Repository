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

    public void workHour() {
        for (int i = 0; i < (int) (5 + Math.random() * (25 * this.orderMultiply)); i++) {
            this.numberOfOrder++;
            Order x = new Order(this.numberOfOrder, (int) (250 + Math.random() * 1250));
            this.EnterOrders.orderPlus(x);
        } // Добавляет в очередь заказы
        EnterOrders.Sort(); // перемещает в конец списка самые старые заказы
        for (Cook x : this.CookArray) {
            for (int i = 0; i <= x.getOrderForOur() - x.getOrderNowDoing(); i++) {
                if (EnterOrders.haveOrder()) {
                    x.setNewOrder(EnterOrders.orderMinus());
                    x.setOrderNowDoing(x.getOrderNowDoing() + 1);
                }
            }
        } // Распределяет входящие заказы по поварам
        for (Cook x : this.CookArray) {
            x.getArrayOrderCook().Sort();
            if (x.getArrayOrderCook().haveOrder()) {
                if (this.stock_1.getNowFull() < this.stock_1.getSize()) {
                    stock_1.PlaceOrderInStock(x.OrderToStock());
                }
            }
        } // Сортируем заказы у поваров и передаем их на склад
        stock_1.getArrayOrder().Sort();
        for (Deliveryman x : this.DeliverymanArray) {
            for (int i = 0; i < x.getSize(); i++) {
                if (stock_1.getArrayOrder().haveOrder()) {
                    x.PlaceOrderInDelivery(stock_1.OrderToDelivery());
                }
            }
        } // Сортирует заказы на складе и передает их в доставку
        for (Deliveryman x : this.DeliverymanArray) {
            if (x.getOrdersArray().haveOrder()) {
                for (int i = 0; i < x.getSize(); i++) {
                    x.getOrdersArray().getArray()[i]
                }
            }
        }


        //время прошло для входях и тех что на руках
    }
}
