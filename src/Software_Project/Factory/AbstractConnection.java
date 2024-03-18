package Software_Project.Factory;

import java.sql.Connection;

public interface AbstractConnection {

    public  Connection getMysqlConnection();
    public  Connection getSqlServerConnection();
}
