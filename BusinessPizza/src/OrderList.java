public class OrderList {
    private Order[] orderList;
    private int size;
    private int lastOrder;

    public OrderList(int size) {
        this.orderList = new Order[size];
        if (size >= 0) {
            this.size = size;
        } else {
            throw new RuntimeException("Введите положительное число");
        }
        this.lastOrder = -1;
    }

    public boolean orderPlus(Order order) {
        if (this.lastOrder == -1) {
            this.orderList[0] = order;
            this.lastOrder++;
            return true;
        } else if (this.freePlace()) {
            for (int i = this.lastOrder; i >= 0; i--) {
                this.orderList[i + 1] = this.orderList[i];
            }
            this.orderList[0] = order;
            this.lastOrder++;
            return true;
        } else {
            return false;
        }
    } // возвращает true если может добавить элемент и добавляет его

    public Order orderMinus() {
        Order x;
        if (this.orderList[0] != null) {
            x = this.orderList[this.lastOrder];
            this.orderList[this.lastOrder] = null;
            this.lastOrder--;
            return x;
        }
        throw new RuntimeException();
    } // Передает заказ и освобождает его место. Если массив пустой, выдает ошибку.

    public boolean freePlace() {
        if (this.orderList[this.size - 1] == null) {
            return true;
        } else {
            return false;
        }
    } // Возвращает true если последний элемент равен null

    public boolean haveOrder() {
        if (this.orderList[0] != null) {
            return true;
        } else {
            return false;
        }
    } // Возвращает true если первый элемент неравен null

    public void Sort() {
        boolean x = true;
        while (x) {
            int score = 0;
            for (int i = 0; i < this.lastOrder; i++) {
                Order temp;
                if (this.orderList[i].getTimeIsGone() > this.orderList[i + 1].getTimeIsGone()) {
                    temp = this.orderList[i + 1];
                    this.orderList[i + 1] = this.orderList[i];
                    this.orderList[i] = temp;
                    score++;
                }
            }
            if (score == 0) {
                x = false;
            }
        }
    } // В конец списка "всплывают" заказы с самым большим временем исполнения

    public int getSize() {
        return size;
    }

    public int getLastOrder() {
        return lastOrder;
    }

    private Order[] getOrderList() {
        return orderList;
    }

    private void setOrderList(Order[] orderList) {
        this.orderList = orderList;
    }

    public void sizeExpend(int newSize) {
        if (newSize >= this.lastOrder) {
            Order[] x = new Order[size];
            System.arraycopy(this.getOrderList(), 0, x, 0, this.lastOrder + 1);
            this.setOrderList(x);
        } else {
            throw new RuntimeException("Количество элементов в массиве больше чем его новый размер");
        }
    }

    public Order[] getArray() {
        return this.orderList;
    }

}
