package day3.dao.impl;


import day3.dao.UserDao;
import day3.domain.User;
import day3.util.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDaoImpl implements UserDao
{
    private Connection conn=null;
    private PreparedStatement pstm=null;
    private ResultSet rs=null;

    @Override
    public User login(User loginUser) throws SQLException
    {
        User user=null;
        String sql="select * from user where username=? and password =?";
        try{
            conn=JDBCUtils.getConnection();
            pstm=conn.prepareStatement(sql);
            pstm.setString(1,loginUser.getUsername());
            pstm.setString(2,loginUser.getPassword());
            rs=pstm.executeQuery();
            if (rs.next())
            {
               user=new User();
                user.setUsername(rs.getString("username"));
                user.setPassword(rs.getString("password"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            JDBCUtils.close(rs,pstm,conn);
        }

        return user;
    }
}
