package model;

/**
 *
 * @author HuuTrinh
 */
public class Customer {

    private int cid;
    private String name, phone, address, email;
    private Account account;
    private int status;

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Customer(int cid, String name, String phone, String address, String email, Account account, int status) {
        this.cid = cid;
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.email = email;
        this.account = account;
        this.status = status;
    }

    public Customer() {
    }

    @Override
    public String toString() {
        return "Customer{" + "cid=" + cid + ", name=" + name + ", phone=" + phone + ", address=" + address + ", email=" + email + ", account=" + account + ", status=" + status + '}';
    }

}
