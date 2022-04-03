package model;

/**
 *
 * @author HuuTrinh
 */
public class BillDetail {

    private String pid, oID;
    private int quantity,size;
    private double price, total;

    public BillDetail() {
    }

    public BillDetail(String pid, String oID, int quantity, int size, double price, double total) {
        this.pid = pid;
        this.oID = oID;
        this.quantity = quantity;
        this.size = size;
        this.price = price;
        this.total = total;
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

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "BillDetail{" + "pid=" + pid + ", oID=" + oID + ", quantity=" + quantity + ", size=" + size + ", price=" + price + ", total=" + total + '}';
    }

    
    
}
