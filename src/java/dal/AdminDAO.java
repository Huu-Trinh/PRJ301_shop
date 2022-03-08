package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HuuTrinh
 */
public class AdminDAO extends DBContext{
    public boolean login(String userName, String password){
        boolean flag=false;
        String sql="select username,password from admin "
                + "where username=? and password=?";
        try {
            PreparedStatement pre = connection.prepareStatement(sql,ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
            pre.setString(1, userName);
            pre.setString(2, password);
            ResultSet rs = pre.executeQuery();
            while(rs.next()){
                if(rs.getString(1).equals(userName)&&rs.getString(2).equals(password)){
                    flag=true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(AdminDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return flag;
    }
    public int changePassword(int adminID, String password) {
        int n = 0;
        String sql = "update admin set password=? where adminID= ?";
        try {
            PreparedStatement pre = connection.prepareStatement(sql);
            pre.setString(1, password);
            pre.setInt(2, adminID);
            n = pre.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(AdminDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return n;
    }
    public boolean CheckUnique(String name){
        String sql = "select username from admin";
        try {
            PreparedStatement pre = connection.prepareStatement(sql);
            ResultSet rs = pre.executeQuery();
            while(rs.next()){
                if(rs.getString(1).equals(name)){
                    return false;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(AdminDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(new AdminDAO().login("admin", "12345678"));
    }
}
