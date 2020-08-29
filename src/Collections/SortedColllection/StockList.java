package Collections.SortedColllection;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class StockList {
    private final Map<String,StockItem> list;

    public StockList(Map<String, StockItem> list) {
        this.list = list;
    }

    public StockList() {
        this.list = new LinkedHashMap<>();
    }

    public StockItem get(String key) {
        return list.get(key);
    }

    public Map<String, StockItem> Items() {
        return Collections.unmodifiableMap(list);
    }

    public int addStock(StockItem item){
        if(item == null){return 0;}

        StockItem inStock = list.getOrDefault(item.getName(), item);
        if(inStock != item){
            item.adjustStock(inStock.getQuantityInStock());
        }

        list.put(item.getName(), item);
        return item.getQuantityInStock();
    }

    public int sellStock(String item, int quantity){
        StockItem inStock = list.getOrDefault(item, null);

        if((inStock != null) && (inStock.getQuantityInStock()>= quantity) && (quantity > 0)){
            inStock.adjustStock(-quantity);
            return quantity;
        }

        return 0;

    }

    @Override
    public String toString() {
        String s = "\nStock List\n";
        double totalCost =0;
        for (Map.Entry<String, StockItem> item: list.entrySet()){
            StockItem stockItem = item.getValue();

            double itemValue = stockItem.getPrice() * stockItem.getQuantityInStock();

            s = s + stockItem + ". THere are " + stockItem.getQuantityInStock() + " in stock. Value of items: ";
            s = s + itemValue + "\n";
            totalCost += itemValue;
        }

        return s + "Total stock value " + totalCost;
    }
}
