package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Account;
import model.Customer;

/**
 *
 * @author HuuTrinh
 */
public class CustomerDAO extends DBContext{
    
    public Customer getCustomer(Account account){
            String sql = "select * from Customer join account on Customer.accountID = account.accountID"
                    + " where account.accountID=?";
           Customer cus = new Customer();
        try {
            PreparedStatement pre = connection.prepareStatement(sql, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            pre.setInt(1,account.getId());
            ResultSet rs = pre.executeQuery();
            while (rs.next()) {
                cus.setCid(rs.getInt("cid"));
                cus.setName(rs.getString("cname"));
                cus.setPhone(rs.getString("cphone"));
                cus.setAddress(rs.getString("cAddress"));
                cus.setEmail(rs.getString("email"));
                cus.setAccount(account);
                cus.setStatus(rs.getInt("status")); 
            }
            pre.close();
        } catch (SQLException ex) {
            Logger.getLogger(CustomerDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cus;
    }
    public void insertCustomer(Customer cus){
            String sql = "INSERT INTO CUSTOMER(cname,cphone,cAddress,accountID,email,status)"
                      + " VALUES(?,?,?,?,?,?)";
        try {
            PreparedStatement pre = connection.prepareStatement(sql, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);

            pre.setString(1,cus.getName());
            pre.setString(2,cus.getPhone());
            pre.setString(3,cus.getAddress());
            pre.setInt(4,cus.getAccount().getId());
            pre.setString(5,cus.getEmail());
            pre.setInt(6,1);
            pre.executeUpdate();
            pre.close();
        } catch (SQLException ex) {
            Logger.getLogger(CustomerDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
    
    public static void main(String[] args) {
        new CustomerDAO().insertCustomer(new Customer(1, "John Wick", "0987654321", "Bac Ninh", "trinh@gmail.com", new Account(3, "tobaco", "12345678", 1), 1));
    }
}
