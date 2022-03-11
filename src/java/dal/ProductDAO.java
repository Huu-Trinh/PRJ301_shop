package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Product;

/**
 *
 * @author HuuTrinh
 */
public class ProductDAO extends DBContext{
    public ArrayList<Product> get8Product(){
        String sql = "select top 8 * from Product";
        ArrayList<Product> pros = new ArrayList<>();
        try {
            PreparedStatement pre = connection.prepareStatement(sql, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = pre.executeQuery();
            while (rs.next()) {
                Product pro = new Product(
                        rs.getString(1),
                        rs.getString(2),
                        rs.getInt(3),
                        rs.getFloat(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getInt(7),
                        rs.getInt(8),
                        rs.getInt(9),
                        rs.getInt(10)
                );
                pros.add(pro);
            }
            pre.close();
        } catch (SQLException ex) {
            Logger.getLogger(AccountDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return pros;
    }
    public ArrayList<Product> getAllProduct(){
        String sql = "select * from Product";
        ArrayList<Product> pros = new ArrayList<>();
        try {
            PreparedStatement pre = connection.prepareStatement(sql, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = pre.executeQuery();
            while (rs.next()) {
                Product pro = new Product(
                        rs.getString(1),
                        rs.getString(2),
                        rs.getInt(3),
                        rs.getFloat(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getInt(7),
                        rs.getInt(8),
                        rs.getInt(9),
                        rs.getInt(10)
                );
                pros.add(pro);
            }
            pre.close();
        } catch (SQLException ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return pros;
    }
}
