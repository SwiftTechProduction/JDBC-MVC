package util;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.SQLException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Lukas
 */
public class Conn 
{

    private static Connection conn;

    public static Connection getConnection() throws SQLException 
    {
        MysqlDataSource sqlDataSource = new MysqlDataSource();
        sqlDataSource.setServerName("localhost");
        sqlDataSource.setDatabaseName("db_mhs");
        sqlDataSource.setUser("root");
        sqlDataSource.setPassword("");
        conn = (Connection) sqlDataSource.getConnection();

        return conn;
    }
}
