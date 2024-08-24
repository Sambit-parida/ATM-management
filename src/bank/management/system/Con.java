package bank.management.system;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Con extends JFrame {
    Connection connection;
    Statement statement;

    public Con() {
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankSystem", "root", "Sambit@7873");
            statement = connection.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
