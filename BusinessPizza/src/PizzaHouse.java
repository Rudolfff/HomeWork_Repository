public class PizzaHouse {
    private int numberOfOrder;
    private int hoursOfWork;
    private Cook[] CookArray = new Cook[10];
    private Stock stock_1;
    private Deliveryman[] DeliverymanArray = new Deliveryman[10];
    private OrderList EnterOrders;
    private double orderMultiply;
    private int bank;

    private Statistics Stat;

    public PizzaHouse(int hoursOfWork) {
        this.numberOfOrder = 0;
        this.hoursOfWork = hoursOfWork;
        this.CookArray[0] = new Cook();
        this.stock_1 = new Stock(6, 60);
        this.DeliverymanArray[0] = new Deliveryman();
        this.EnterOrders = new OrderList(300);
        this.orderMultiply = 1.0;
        this.bank = 1000;
        this.Stat = new Statistics();
    }

    public void workHour() {
        for (int i = 0; i < (int) (5 + Math.random() * (25 * this.orderMultiply)); i++) {
            this.numberOfOrder++;
            Order x = new Order(this.numberOfOrder, (int) (250 + Math.random() * 1250));
            this.EnterOrders.orderPlus(x);
            Stat.newEnterOrd(x);
            System.out.println("В работу принят " + x.toString());
        } // Добавляет в очередь заказы
        EnterOrders.Sort(); // перемещает в конец списка самые старые заказы
        for (Cook x : this.CookArray) {
            for (int i = 0; i <= x.getOrderForOur() - x.getOrderNowDoing(); i++) {
                if (EnterOrders.haveOrder()) {
                    Order temp = EnterOrders.orderMinus();
                    x.setNewOrder(temp);
                    x.setOrderNowDoing(x.getOrderNowDoing() + 1);
                    Stat.newCookOrd(temp);
                    System.out.println("Передан на кухню " + temp.toString());
                }
            }
        } // Распределяет входящие заказы по поварам
        for (Cook x : this.CookArray) {
            x.getArrayOrderCook().Sort();
            if (x.getArrayOrderCook().haveOrder()) {
                if (this.stock_1.getNowFull() < this.stock_1.getSize()) {
                    Order temp = x.OrderToStock();
                    stock_1.PlaceOrderInStock(temp);
                    Stat.newStockOrd(temp);
                    System.out.println("Передан на склад " + temp.toString());
                }
            }
        } // Сортируем заказы у поваров и передаем их на склад
        stock_1.getArrayOrder().Sort();
        for (Deliveryman x : this.DeliverymanArray) {
            for (int i = 0; i < x.getSize(); i++) {
                if (stock_1.getArrayOrder().haveOrder()) {
                    Order temp = stock_1.OrderToDelivery();
                    x.PlaceOrderInDelivery(temp);
                    System.out.println("Передан в доставку " + temp.toString());
                }
            }
        } // Сортирует заказы на складе и передает их в доставку
        for (Deliveryman x : this.DeliverymanArray) {
            if (x.getOrdersArray().haveOrder()) {
                for (int i = 0; i < x.getSize(); i++) {
                    if (x.getOrdersArray().getArray()[i].getTimeIsGone() <= 3) {
                        this.bank += x.getOrdersArray().getArray()[i].getCoast();
                        System.out.println("Доставлен " + x.getOrdersArray().getArray()[i].toString());
                    } else {
                        System.out.println("Доставлен бесплатно " + x.getOrdersArray().getArray()[i].toString());
                    }
                    x.getOrdersArray().getArray()[i] = null;
                }
            }
        } // Если время исполнения заказа 3 часа или меньше, то записывает цену заказа в банк как прибыль. Очищает ячейки мест.
    }

    public void TimeIsGone() {
        this.EnterOrders.TimeIsGone();
        for (Cook x : this.CookArray) {
            x.getArrayOrderCook().TimeIsGone();
        }
        this.stock_1.getArrayOrder().TimeIsGone();
    } // Время прошло для входящих заказов, заказов у поваров и на складе

    public void ClearArrays() {
        this.EnterOrders.ClearArray();
        for (Cook x : this.CookArray) {
            x.getArrayOrderCook().ClearArray();
        }
        this.stock_1.getArrayOrder().ClearArray();
    }

    public void WorkDay() {
        for (int i = 0; i < this.hoursOfWork; i++) {
            this.workHour();
            this.TimeIsGone();
        }
        this.PayForAll();
        this.bankruptcy();
        this.ClearArrays();
    }

    public void bankruptcy() {
        if (this.bank < 0) {
            throw new RuntimeException("Наступило банкротство");
        }
    }

    public void PayForAll() {
        int x = 0;
        for (Cook man : this.CookArray) {
            x += man.getSalary();
        }
        x += this.stock_1.getSize() * this.stock_1.payForStockInDay();
        for (Deliveryman man : this.DeliverymanArray) {
            x += man.getSalary();
        }
        this.bank -= x;
        System.out.println("Оплачено " + x + ". \nОсталось на счету: " + bank);
    }

    public void hireNewCook() {
        for (int i = 1; i < 10; i++) {
            if (this.CookArray[i] == null) {
                this.CookArray[i] = new Cook();
                break;
            } else {
                System.out.println("Невозможно нанять нового повара. Достигнут лимит.");
            }
        }
    }
    public void hireNewDeliveryman() {
        for (int i = 1; i < 10; i++) {
            if (this.DeliverymanArray[i] == null) {
                this.DeliverymanArray[i] = new Deliveryman();
                break;
            } else {
                System.out.println("Невозможно нанять нового курьера. Достигнут лимит.");
            }
        }
    }
    public void fireCook() {
        for (int i = 9; i > 0; i--) {
            if (this.CookArray[i] != null) {
                this.CookArray[i] = null;
                break;
            } else {
                System.out.println("Невозможно нанять уволить повара. Достигнут лимит.");
            }
        }
    }
    public void fireDeliveryman() {
        for (int i = 9; i > 0; i--) {
            if (this.DeliverymanArray[i] != null) {
                this.DeliverymanArray[i] = null;
                break;
            } else {
                System.out.println("Невозможно нанять уволить курьера. Достигнут лимит.");
            }
        }
    }

    public void resetStat() {
        this.Stat = new Statistics();
    }

    public Statistics getStat() {
        return Stat;
    }

    public Stock getStock_1() {
        return stock_1;
    }
    public void ChangeOrderMultiply(double change) {
        this.orderMultiply += change;
    }
}
