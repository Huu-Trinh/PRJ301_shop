package model;

/**
 *
 * @author HuuTrinh
 */
public class BillDetail {

    private String pid, oID;
    private int quantity;
    private double price, total;

    public BillDetail() {
    }

    public BillDetail(String pid, String oID, int quantity, double price) {
        this.pid = pid;
        this.oID = oID;
        this.quantity = quantity;
        this.price = price;
        this.total = price*quantity;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getoID() {
        return oID;
    }

    public void setoID(String oID) {
        this.oID = oID;
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

    public double getTotal() {
        return getQuantity()*getPrice();
    }

    public void setTotal(double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "BillDetail{" + "pid=" + pid + ", oID=" + oID + ", quantity=" + quantity + ", price=" + price + ", total=" + total + '}';
    }
    
}
