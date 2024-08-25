package bank.management.system;

import java.sql.*;

public class Connn {
    Connection connection;
    Statement statement;

    public Connn() {
        try {
            // Update the JDBC URL for MariaDB
            connection = DriverManager.getConnection("jdbc:mariadb://localhost:3306/bankSystem", "root", "nopass");
            statement = connection.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
