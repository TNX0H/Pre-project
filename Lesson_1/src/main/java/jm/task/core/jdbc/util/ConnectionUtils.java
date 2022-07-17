package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.SQLException;
public class ConnectionUtils {

    public static Connection getMyConnection() throws SQLException,
        ClassNotFoundException {
        return Util.getMySQLConnection();
    }

    public static void main(String[] args) throws SQLException,
            ClassNotFoundException {

        System.out.println("Get connection ... ");

        // Get a Connection object
        Connection conn = ConnectionUtils.getMyConnection();

        System.out.println("Get connection " + conn);

        System.out.println("Done!");
    }

}
