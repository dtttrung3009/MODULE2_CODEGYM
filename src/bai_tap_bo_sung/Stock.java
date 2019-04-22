package bai_tap_bo_sung;

public class Stock {
    private String symbol,name;
    private double previousClosingPrice, currentPrice;

    public Stock(String symbol, String name) {
        this.symbol = symbol;
        this.name = name;
    }

    public double getPreviousClosingPrice() {
        return previousClosingPrice;
    }

    public void setPreviousClosingPrice(double previousClosingPrice) {
        this.previousClosingPrice = previousClosingPrice;
    }

    public double getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice;
    }
    public double getChangePercent(){
        double percent=Math.abs(getCurrentPrice()-getPreviousClosingPrice())/getPreviousClosingPrice()*100;
        return percent;
    }
}
