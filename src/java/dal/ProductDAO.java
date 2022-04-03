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
public class ProductDAO extends DBContext {

    public ArrayList<Product> get8Product() {
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
                        rs.getFloat(10)
                );
                pros.add(pro);
            }
            pre.close();
        } catch (SQLException ex) {
            Logger.getLogger(AccountDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return pros;
    }

    public ArrayList<Product> getAllProduct() {
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
                        rs.getFloat(10)
                );
                pros.add(pro);
            }
            pre.close();
        } catch (SQLException ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return pros;
    }

    public Product getProductByID(String pid) {
        String sql = "select * from Product where pid =?";
        Product product = new Product();
        try {
            PreparedStatement pre = connection.prepareStatement(sql, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            pre.setString(1, pid);
            ResultSet rs = pre.executeQuery();
            while (rs.next()) {
                product.setPid(pid);
                product.setPname(rs.getString(2));
                product.setQuantity(rs.getInt(3));
                product.setPrice(rs.getFloat(4));
                product.setImage(rs.getString(5));
                product.setDescription(rs.getString(6));
                product.setStatus(rs.getInt(7));
                product.setCateID(rs.getInt(8));
                product.setPromotion(rs.getInt(9));
                product.setMeasure(rs.getFloat(10));
            }
            pre.close();
        } catch (SQLException ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return product;
    }
    
    public ArrayList<Product> getProductByCate(int cateID) {
        String sql = "select * from Product Where cateID = ?";
        ArrayList<Product> pros = new ArrayList<>();
        try {
            PreparedStatement pre = connection.prepareStatement(sql, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            pre.setInt(1, cateID);
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
                        rs.getFloat(10)
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
