class Product{
    String productID;
    String productName;
    double price;
    int stock;
    String category;

    void displayProduct () {
        System.out.println("Product ID: "+ productID);
        System.out.println("Product Name: "+ productName);
        System.out.println("Price: "+price);
        System.out.println("Stock: " + stock);
        System.out.println("Category" + category);
    }
}

public class prdct {
    public static void main(String[]args){
        Product p1 = new Product();
        p1.productID = "P101";
        p1.productName ="Laptop";
        p1.price = 100000 ;
        p1.stock = 10 ;
        p1.category = "Electronics";

        p1.displayProduct();
    }
   
}
