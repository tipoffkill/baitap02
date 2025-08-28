package webanime.dao;

import java.sql.*;
import webanime.models.User;
import webanime.controllers.DBConnection;

public class UserDaoImpl implements UserDao {
    private Connection conn;
    private PreparedStatement ps;
    private ResultSet rs;

    @Override
    public User get(String username) {
        String sql = "SELECT * FROM [User] WHERE username = ?";
        try {
            conn = new DBConnection().getConnection();
            ps = conn.prepareStatement(sql);
            ps.setString(1, username);
            rs = ps.executeQuery();
            if (rs.next()) {
                User u = new User();
                u.setId(rs.getInt("id"));
                u.setEmail(rs.getString("email"));
                u.setUserName(rs.getString("username"));
                u.setFullName(rs.getString("fullname"));
                u.setPassWord(rs.getString("password"));
                u.setAvatar(rs.getString("avatar"));
                u.setRoleid(rs.getInt("roleid"));
                u.setPhone(rs.getString("phone"));
                u.setCreatedDate(rs.getDate("createdDate"));
                return u;
            }
        } catch (Exception e) {
            e.printStackTrace(); // có thể log
        } finally {
            try { if (rs != null) rs.close(); } catch (Exception ignored) {}
            try { if (ps != null) ps.close(); } catch (Exception ignored) {}
            try { if (conn != null) conn.close(); } catch (Exception ignored) {}
        }
        return null;
    }
}
