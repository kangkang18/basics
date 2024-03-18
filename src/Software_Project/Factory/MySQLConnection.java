package Software_Project.Factory;

import java.sql.Connection;

public class MySQLConnection implements AbstractConnection{
    @Override
    public Connection getMysqlConnection() {
        MySQLFactory mysql = new MySQLFactory();
       // Connection c = mysql.createConnection();
        return mysql.createConnection();
    }

    @Override
    public Connection getSqlServerConnection() {
        return null;
    }
}
