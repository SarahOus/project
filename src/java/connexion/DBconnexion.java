package connexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBconnexion {

    private static Connection c = null;

    public static Connection DBconnection() throws SQLException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql://localhost/gestventes", "root", "");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return c;

    }
}

