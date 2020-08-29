package Collections.SortedColllection;

import java.util.Objects;

public class StockItem implements Comparable<StockItem>{
    private final String name;
    private double price;
    private int quantityStock;

    public StockItem(String name, double price) {
        this.name = name;
        this.price = price;
        this.quantityStock = 0;
    }

    public StockItem(String name, double price, int quantityStock) {
        this.name = name;
        this.price = price;
        this.quantityStock = quantityStock;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price > 0) {this.price = price;};
    }

    public int getQuantityInStock() {
        return quantityStock;
    }

    public void adjustStock(int quantityStock) {
        int neeQuantity = this.quantityStock + quantityStock;
        if(neeQuantity >=0){this.quantityStock = neeQuantity;}
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StockItem stockItem = (StockItem) o;
        return name.equals(stockItem.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public int compareTo(StockItem o) {
        System.out.println("entering compareTo method");
        if(this == o){return 0;}

        if(o != null){
            return this.name.compareTo(o.getName());
        }

        throw new NullPointerException();
    }

    @Override
    public String toString() {
        return this.name + " : price " + this.price;
    }
}
