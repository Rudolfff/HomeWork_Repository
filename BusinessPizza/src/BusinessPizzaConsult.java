import java.util.Scanner;

public class BusinessPizzaConsult {
    private PizzaHouse PH;

    BusinessPizzaConsult(int hoursOfWork) {
        this.PH = new PizzaHouse(hoursOfWork);
    }

    public String scStr() {
        return new Scanner(System.in).nextLine();
    }

    public int scInt() {
        return new Scanner(System.in).nextInt();
    }

    public void startConsult(int numberOfDays) {
        for (int i = 0; i < numberOfDays; i++) {
            PH.WorkDay();
            if (PH.getStat().getEnterStat() > 1.2) {
                System.out.println("Среднее время заказа на этапе входящих заказов составляет " + PH.getStat().getEnterStat() + "\n" +
                        "Рекомендуем увеличить число поваров. Нажмите Y, чтобы увеличить число поваров на одного человека, или нажмите N, " +
                        "чтобы проигнорировать рекомендацию.");
                if (scStr().equals("Y")) {
                    PH.hireNewCook();
                }
            } else {
                System.out.println("Среднее время заказа на этапе входящих заказов в норме. Вы можете уволить повара для экономии. Нажмите Y, чтобы снизить число поваров на одного человека, или нажмите N, " +
                        "чтобы проигнорировать рекомендацию.");
                if (scStr().equals("Y")) {
                    PH.fireCook();
                }
            }
            if (PH.getStat().getCookStat() > 1.2) {
                System.out.println("Среднее время заказа на этапе приготовления составляет " + PH.getStat().getCookStat() + "\n" +
                        "Рекомендуем увеличить число ячеек склада. Нажмите Y, чтобы увеличить число ячеек на 5, или нажмите N, " +
                        "чтобы проигнорировать рекомендацию.");
                if (scStr().equals("Y")) {
                    PH.getStock_1().ChangeStockSize(5);
                }
            } else {
                System.out.println("Среднее время заказа на этапе приготовления в норме. Вы можете снизить количество ячеек на складе для экономии. " +
                        "Нажмите Y, чтобы снизить число ячеек на 5, или нажмите N, " +
                        "чтобы проигнорировать рекомендацию.");
                if (scStr().equals("Y")) {
                    PH.getStock_1().ChangeStockSize(-5);
                }
            }
            if (PH.getStat().getStockStat() > 1.2) {
                System.out.println("Среднее время заказа на складе " + PH.getStat().getStockStat() + "\n" +
                        "Рекомендуем увеличить число курьеров. Нажмите Y, чтобы увеличить число курьеров на одного человека, или нажмите N, " +
                        "чтобы проигнорировать рекомендацию.");
                if (scStr().equals("Y")) {
                    PH.hireNewDeliveryman();
                }
            } else {
                System.out.println("Среднее время заказа на складе в норме. Вы можете уволить курьера для экономии. Нажмите Y, чтобы снизить число курьеров на одного человека, или нажмите N, " +
                        "чтобы проигнорировать рекомендацию.");
                if (scStr().equals("Y")) {
                    PH.fireDeliveryman();
                }
            }
            PH.resetStat();
            System.out.println("Вы можете объявить акцию, чтобы увеличить поток заказов. Для этого нажмите A. \n" +
                    "Также вы можете сократить поток заказов за счет прекращения текущих акций. Для этого нажмите S");
            if (scStr().equals("A")) {
                PH.ChangeOrderMultiply(0.3);
            } else if (scStr().equals("S")) {
                PH.ChangeOrderMultiply(-0.3);
            }
        }
    }

}
