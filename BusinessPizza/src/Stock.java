public class Stock {
    private int nowFull;
    private int size;
    private int payForOnePlace;
    private OrderList arrayOrder;

    public Stock(int size, int payForOnePlace) {
        this.size = size;
        this.arrayOrder = new OrderList(size);
        this.payForOnePlace = payForOnePlace;
        this.nowFull = 0;
    }

    public int getNowFull() {
        return nowFull;
    }

    public int getSize() {
        return size;
    }

    public int getPayForOnePlace() {
        return payForOnePlace;
    }


    public void setSize(int size) {
        if (size > 0) {
            this.size = size;
        } else {
            System.out.println("Недопустимый размер склада");
        }
    }

    public OrderList getArrayOrder() {
        return arrayOrder;
    }

    public int payForStockInDay() {
        return this.size * this.payForOnePlace;
    }

    public void PlaceOrderInStock(Order x) {
        this.arrayOrder.orderPlus(x);
    }

    public Order OrderToDelivery() {
        return this.arrayOrder.orderMinus();
    }
    public void ChangeStockSize(int ChangeSize) {
        this.size += ChangeSize;
        this.arrayOrder.sizeExpend(this.size);
    }
}
