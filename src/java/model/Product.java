package model;

/**
 *
 * @author HuuTrinh
 */
public class Product {
    private String pid,pname;
    private int quantity;
    private double price;
    private String image,description;
    private int status,cateID;
    private int promotion;
    private double weight;

    public Product() {
    }

    public Product(String pid, String pname, int quantity, double price, String image, String description, int status, int cateID, int promotion, double weight) {
        this.pid = pid;
        this.pname = pname;
        this.quantity = quantity;
        this.price = price;
        this.image = image;
        this.description = description;
        this.status = status;
        this.cateID = cateID;
        this.promotion = promotion;
        this.weight = weight;
    }


    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getCateID() {
        return cateID;
    }

    public void setCateID(int cateID) {
        this.cateID = cateID;
    }

    public int getPromotion() {
        return promotion;
    }

    public void setPromotion(int promotion) {
        this.promotion = promotion;
    }

    public double getMeasure() {
        return weight;
    }

    public void setMeasure(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Product{" + "pid=" + pid + ", pname=" + pname + ", quantity=" + quantity + ", price=" + price + ", image=" + image + ", description=" + description + ", status=" + status + ", cateID=" + cateID + ", promotion=" + promotion + ", weight=" + weight + '}';
    }
}
