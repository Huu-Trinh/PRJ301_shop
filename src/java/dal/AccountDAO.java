package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Account;

/**
 *
 * @author HuuTrinh
 */
public class AccountDAO extends DBContext {

    public ArrayList<Account> getAllAccount() {
        String sql = "select * from Account";
        ArrayList<Account> accs = new ArrayList<>();
        try {
            PreparedStatement pre = connection.prepareStatement(sql, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = pre.executeQuery();
            while (rs.next()) {
                Account acc = new Account(rs.getInt("accountID"),
                        rs.getString("username"),
                        rs.getString("password"),
                        rs.getInt("role_id"));
                accs.add(acc);
            }
            pre.close();
        } catch (SQLException ex) {
            Logger.getLogger(AccountDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return accs;
    }

    public Account getAccountByID(int accountID) {
        String sql = "select * from Account where accountID=?";
        Account accs = new Account();
        try {
            PreparedStatement pre = connection.prepareStatement(sql, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            pre.setInt(1, accountID);
            ResultSet rs = pre.executeQuery();
            while (rs.next()) {
                accs.setId(rs.getInt("accountID"));
                accs.setUsername(rs.getString("username"));
                accs.setPassword(rs.getString("password"));
                accs.setRole_id(rs.getInt("role_id"));
            }
            pre.close();
        } catch (SQLException ex) {
            Logger.getLogger(AccountDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return accs;
    }

    public Account login(String userName, String password) {
        String sql = "select * from account "
                + "where username=? and password=?";
        try {
            PreparedStatement pre = connection.prepareStatement(sql, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            pre.setString(1, userName);
            pre.setString(2, password);
            ResultSet rs = pre.executeQuery();
            while (rs.next()) {
                if (rs.getString(2).equals(userName) && rs.getString(3).equals(password)) {
                    Account cus = new Account(rs.getInt("accountID"),
                            rs.getString("username"),
                            rs.getString("password"),
                            rs.getInt("role_id"));
                    return cus;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(AccountDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public void insert(String userName, String password) {
        String sql = "INSERT INTO ACCOUNT (username,password, role_id)"
                + " values(?,?,?)";
        try {
            PreparedStatement pre = connection.prepareStatement(sql, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            pre.setString(1, userName);
            pre.setString(2, password);
            pre.setInt(3, 2);
            pre.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(AccountDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Account getNewAccount() {
        String sql = "SELECT TOP 1 * FROM ACCOUNT"
                + " ORDER BY accountID DESC";
        try {
            PreparedStatement pre = connection.prepareStatement(sql, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = pre.executeQuery();
            while (rs.next()) {
                Account cus = new Account(rs.getInt("accountID"),
                        rs.getString("username"),
                        rs.getString("password"),
                        rs.getInt("role_id"));
                return cus;
            }
        } catch (SQLException ex) {
            Logger.getLogger(AccountDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public boolean checkUnique(String username) {
        String sql = "SELECT * FROM ACCOUNT WHERE username=?";
        boolean flag=false;
        try {
            PreparedStatement pre = connection.prepareStatement(sql, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            pre.setString(1, username);
            ResultSet rs = pre.executeQuery();
            while (rs.next()) {
                flag=true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(AccountDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return flag;
    }
}
