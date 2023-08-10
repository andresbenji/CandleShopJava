import java.util.ArrayList;
import java.util.List;

public class Inventory {
    private List<Candle> candles;

    // Constructor
    public Inventory() {
        candles = new ArrayList<>();
    }

    // Add candle to inventory
    public void addCandle(Candle candle) {
        candles.add(candle);
    }

    // Update candle stock in inventory
    public void updateCandleStock(String name, int newQuantity) {
        for (Candle candle : candles) {
            if (candle.getName().equals(name)) {
                candle.setQuantity(newQuantity);
                return;
            }
        }
        System.out.println("Candle not found in inventory.");
    }

    // View candle stock in inventory
    public void viewInventory() {
        for (Candle candle : candles) {
            System.out.println(candle.getName() + " - Quantity: " + candle.getQuantity());
        }
    }

    // Find a specific candle in inventory by name
    public Candle findCandleByName(String name) {
        for (Candle candle : candles) {
            if (candle.getName().equals(name)) {
                return candle;
            }
        }
        return null;
    }
}
