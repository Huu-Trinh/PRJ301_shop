package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Customer;

/**
 *
 * @author HuuTrinh
 */
public class CustomerDAO extends DBContext{
    
    public Customer login(String userName, String password){
        String sql="select * from customer "
                + "where username=? and password=?";
        try {
            PreparedStatement pre = connection.prepareStatement(sql,ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
            pre.setString(1, userName);
            pre.setString(2, password);
            ResultSet rs = pre.executeQuery();
            while(rs.next()){
                if(rs.getString(5).equals(userName)&&rs.getString(6).equals(password)){
                    Customer cus = new Customer(rs.getInt("cid"),
                            rs.getString("cname"),
                            rs.getString("cphone"),
                            rs.getString("cAddress"),
                            rs.getString("username"),
                            rs.getString("password"),
                            rs.getInt("status"));
                    return cus;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(CustomerDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
