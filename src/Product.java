import java.io.Serializable;

public class Product implements Serializable {
    private int productCode;
    private String productName;
    private float price;

    public Product() {
    }

    public Product(int productCode, String productName, float price) {
        this.productCode = productCode;
        this.productName = productName;
        this.price = price;
    }

    public int getProductCode() {
        return productCode;
    }

    public void setProductCode(int productCode) {
        this.productCode = productCode;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
    @Override
    public String toString(){
        return "name "+ getProductName()+",code "+getProductCode()+", price "+getPrice();
    }
    public void display(){
        System.out.println(toString());
    }
}
