package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Category;

/**
 *
 * @author HuuTrinh
 */
public class CategoryDAO extends DBContext{
    public ArrayList<Category> getAllCategory(){
        String sql = "select * from Category";
        ArrayList<Category> pros = new ArrayList<>();
        try {
            PreparedStatement pre = connection.prepareStatement(sql, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = pre.executeQuery();
            while (rs.next()) {
                Category pro = new Category(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getInt(3)
                );
                pros.add(pro);
            }
            pre.close();
        } catch (SQLException ex) {
            Logger.getLogger(AccountDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return pros;
    }
}
