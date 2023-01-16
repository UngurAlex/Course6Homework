public class Product {
    String name="Matheo";
    String price="40$";
    Integer quantity=3;
    String category="fruits";
    boolean hasStock=false;
    boolean isCategory;


    String getNamePriceQuantityCategory() {
        return name + price + quantity + category;
    }

    Product(String getName, String getPrice, Integer getQuantity, String getCategory, boolean whatStock, boolean getisCategory) {
        name = getName;
        price = getPrice;
        quantity = getQuantity;
        category = getCategory;
        hasStock=whatStock;
        isCategory=getisCategory;

    }
}
