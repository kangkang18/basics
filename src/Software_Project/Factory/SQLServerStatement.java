package Software_Project.Factory;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class SQLServerStatement implements AbstractStatement{
    @Override
    public Statement getMysqlStatement(Connection c) throws SQLException {
        return null;
    }

    @Override
    public Statement getSqlServerStatement(Connection c) throws SQLException {
        SQLServerFactory sqlserver = new SQLServerFactory();
        return sqlserver.createStatement(c);
    }
}
