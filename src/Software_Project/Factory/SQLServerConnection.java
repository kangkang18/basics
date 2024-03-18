package Software_Project.Factory;

import java.sql.Connection;

public class SQLServerConnection implements AbstractConnection{


    @Override
    public Connection getMysqlConnection() {
       return null;


    }

    @Override
    public Connection getSqlServerConnection() {
        SQLServerFactory SqlServer = new SQLServerFactory();
        return SqlServer.createConnection();
    }


}
