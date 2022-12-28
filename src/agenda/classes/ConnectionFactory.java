package agenda.classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    public static Connection getConnection() throws SQLException {

        try {

            Class.forName("com.mysql.jdbc.Driver");

            String url = "jdbc:mysql://localhost:3306/agenda?useSSL=false";
            String user = "root";
            String password = "";

            
            return DriverManager.getConnection(url, user, password);

        } catch (ClassNotFoundException ex) {
            throw new SQLException(ex.getMessage());
            
        }
    }
}
