package com.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import com.Db.DbConnection;
import com.register.register;

public class registerDaoImpl implements registerDao {
    @Override
    public int create(List<register> lst) {
        int i = 0;
        Connection con = DbConnection.getDbConnection();
        try {
            for (register c : lst) {
                PreparedStatement pstate = con.prepareStatement("insert into employee values(?,?,?,?)");
                pstate.setString(1, c.getfName());
                pstate.setString(2, c.getlName());
                pstate.setString(3, c.getEmail());
                pstate.setString(4, c.getPassword());
                i = pstate.executeUpdate();
                if(i>0)
                {
                	System.out.println("<h1>Registration Successfully</h1>");
                }
                else
                {
                	System.out.println("Try again");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return i;
    }
}
