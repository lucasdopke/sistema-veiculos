import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexaoDB {

    public Connection conectar() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost/test?user=minty&password=greatsqldb");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return conn;
    }
}
