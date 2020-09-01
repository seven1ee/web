package day3.dao;

import day3.domain.User;

import java.sql.SQLException;

public interface UserDao
{
    public abstract  User login(User loginUser) throws SQLException;
}
