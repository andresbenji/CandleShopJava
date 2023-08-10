public class Candle {
    private String name;
    private int quantity;
    private int burnTime;
    private double price;

    // Constructor
    public Candle(String name, int quantity, int burnTime, double price) {
        this.name = name;
        this.quantity = quantity;
        this.burnTime = burnTime;
        this.price = price;
    }

    // Getters and Setters
    // ...

    // Calculate the Dollar per Burn Time
    public double getDollarPerBurnTime() {
        return price / burnTime;
    }

    // Calculate the subtotal for the candle
    public double getSubtotal() {
        return quantity * price;
    }

    // Format the candle details for receipt
    public String getReceiptEntry() {
        return String.format(
                "+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n"
                        + "%s\nAmount: %d\nBurn Time: %d hours\nDollar per Burn Time: %.2f\nPrice: $%.2f\n",
                name, quantity, burnTime, getDollarPerBurnTime(), getSubtotal());
    }
}
