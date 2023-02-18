public class Order {
    private int number = -99;
    private int coast = -99;
    private int timeIsGone = -99 ;

    public Order() {
    }

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

    public void setTimeIsGone() {
        this.timeIsGone++;
    }

    @Override
    public String toString() {
        return "Order{" +
                "number=" + number +
                ", coast=" + coast +
                ", timeIsGone=" + timeIsGone +
                '}';
    }
}
