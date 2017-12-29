package gui;

public class ViewProducts {

    private String productName;
    private int productPrice,productID,productQuantity;

    public ViewProducts(String productName,int productPrice,int productID,int productQuantity){
        this.productName=productName;
        this.productPrice=productPrice;
        this.productID=productID;
        this.productQuantity=productQuantity;
    }

    public String getProductName() {
        return productName;
    }

    public int getProductPrice() {
        return productPrice;
    }

    public int getProductID() {
        return productID;
    }

    public int getProductQuantity() {
        return productQuantity;
    }
}
