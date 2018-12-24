
package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;


public class ConnectionManager {
    public static Connection createConnection(String url, Properties props)
            throws SQLException {
        Connection cn = DriverManager.getConnection(url, props);
        return cn;
    }
    public static void closeConnection(Connection cn) throws SQLException{
        cn.close() ;
    }
}
