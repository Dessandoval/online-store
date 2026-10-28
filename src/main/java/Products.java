public class Products {

    private String sku;
    private String productName;
    private double price;
    private String department;

    public Products(String sku, String productName, double price, String department) {
        this.sku = sku;
        this.productName = productName;
        this.price = price;
        this.department = department;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
    public String toString() {
        return String.format("SKU: %-8s | Name: %-30s | Price: $%-7.2f | Dept: %s",
                sku, productName, price, department);
    }
}
