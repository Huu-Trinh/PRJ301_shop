package model;

/**
 *
 * @author HuuTrinh
 */
public class Bill {
    private String oID;
    private String dateCreate;
    private String cname,cphone,cAddress;
    private double total;
    private int status;
    private int cid;

    public Bill() {
    }

    public Bill(String oID, String dateCreate, String cname, String cphone, String cAddress, double total, int status, int cid) {
        this.oID = oID;
        this.dateCreate = dateCreate;
        this.cname = cname;
        this.cphone = cphone;
        this.cAddress = cAddress;
        this.total = total;
        this.status = status;
        this.cid = cid;
    }

    public String getoID() {
        return oID;
    }

    public void setoID(String oID) {
        this.oID = oID;
    }

    public String getDateCreate() {
        return dateCreate;
    }

    public void setDateCreate(String dateCreate) {
        this.dateCreate = dateCreate;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getCphone() {
        return cphone;
    }

    public void setCphone(String cphone) {
        this.cphone = cphone;
    }

    public String getcAddress() {
        return cAddress;
    }

    public void setcAddress(String cAddress) {
        this.cAddress = cAddress;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    @Override
    public String toString() {
        return "Bill{" + "oID=" + oID + ", dateCreate=" + dateCreate + ", cname=" + cname + ", cphone=" + cphone + ", cAddress=" + cAddress + ", total=" + total + ", status=" + status + ", cid=" + cid + '}';
    }
    
}
