package Collections.SortedColllection;

public class Main {
    private static StockList stockList = new StockList();

    public static void main(String[] args) {
        StockItem temp = new StockItem("bread", 1, 100);
        stockList.addStock(temp);

        temp = new StockItem("coca cola", 2, 50);
        stockList.addStock(temp);

        String chicken_legs = "chicken legs";
        temp = new StockItem(chicken_legs, 20, 5);
        stockList.addStock(temp);
        temp = new StockItem(chicken_legs, 5, 6);
        stockList.addStock(temp);

        String lamb_shoulder = "lamb shoulder";
        temp = new StockItem(lamb_shoulder, 60, 32);
        stockList.addStock(temp);

        System.out.println(stockList);

        Basket mosBasket = new Basket("Mo");
        sellItem(mosBasket, chicken_legs, 10);
        System.out.println(mosBasket);

        sellItem(mosBasket, lamb_shoulder, 30);
        System.out.println(mosBasket);

        sellItem(mosBasket, "dont exist", 2);
        System.out.println(mosBasket);
    }

    public static int sellItem(Basket basket, String item, int quantity){
        StockItem stockItem = stockList.get(item);

        if(stockItem == null){
            System.out.println("Don't sell this here: " + item);
            return 0;
        }

        if(stockList.sellStock(item, quantity) != 0){
            basket.addToBasket(stockItem, quantity);
            return quantity;
        }

        return 0;
    }
}
