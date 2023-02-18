public class Statistics {
    private int EnterNORD;
    private int EnterTORD;
    private double EnterStat;
    private int CookNORD;
    private int CookTORD;
    private double CookStat;
    private int StockNORD;
    private int StockTORD;
    private double StockStat;

    public Statistics() {
        EnterNORD = 0;
        EnterTORD = 0;
        EnterStat = 0;
        CookNORD = 0;
        CookTORD = 0;
        CookStat = 0;
        StockNORD = 0;
        StockTORD = 0;
        StockStat = 0;
    }

    public void newEnterOrd(Order x) {
        this.EnterNORD++;
        this.EnterTORD += x.getTimeIsGone();
    }
    public void newCookOrd(Order x) {
        this.CookNORD++;
        this.CookTORD += x.getTimeIsGone();
    }
    public void newStockOrd(Order x) {
        this.StockNORD++;
        this.StockTORD += x.getTimeIsGone();
    }
    public void SumUp() {
        this.EnterStat = EnterTORD / EnterNORD;
        this.CookStat = (CookTORD - EnterTORD) / CookNORD;
        this.StockStat = (StockTORD - CookTORD - EnterTORD) / StockNORD;
    }

    public double getEnterStat() {
        return EnterStat;
    }

    public double getCookStat() {
        return CookStat;
    }

    public double getStockStat() {
        return StockStat;
    }
}
