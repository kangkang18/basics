package Software_Project.Factory;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public interface AbstractStatement {
    public Statement getMysqlStatement(Connection c) throws SQLException;
    public Statement getSqlServerStatement(Connection c) throws SQLException;
}
