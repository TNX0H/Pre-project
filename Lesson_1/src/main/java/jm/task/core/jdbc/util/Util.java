package jm.task.core.jdbc.util;

import com.mysql.cj.xdevapi.SessionFactory;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String HOST = "jdbc:mysql://localhost:3306/test?useSSL=false&allowMultiQueries=true&serverTimezone=UTC";
    private static final String LOGIN = "root";
    private static final String PASSWORD = "root";
    private static SessionFactory sessionFactory = null;
    // Connect to MySQL
    public static Connection getMySQLConnection() throws SQLException,
        ClassNotFoundException {
        String hostName = "localhost";
        String dbName = "pre_project";
        String userName = "root";
        String password = "admin";

        return getMySQLConnection(hostName, dbName, userName, password);
    }

    public static Connection getMySQLConnection(String hostName, String dbName,
                                                String userName, String password) throws SQLException,
        ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");

        String connectionURL = "jdbc:mysql://" + hostName + ":3306/" + dbName;

        Connection conn = DriverManager.getConnection(connectionURL, userName,
                password);

        return conn;
    }
}


