public class Stock {
    private int nowFull;
    private int size;
    private int payForOnePlace;
    private OrderList arrayOrder;

    public Stock(int size, int payForOnePlace) {
        this.size = size;
        this.arrayOrder = new OrderList(size);
        this.payForOnePlace = payForOnePlace;
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

    public void setNowFull(int nowFull) {
        if (nowFull <= size && nowFull >= 0) {
            this.nowFull = nowFull;
        } else {
            System.out.println("Такое заполнение склада невозможно");
        }
    }

    public void setSize(int size) {
        if (size > 0) {
            this.size = size;
        } else {
            System.out.println("Недопустимый размер склада");
        }
    }

    public int payForStockInDay() {
        return this.size * this.payForOnePlace;
    }
}
