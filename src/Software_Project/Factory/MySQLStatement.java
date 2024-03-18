package Software_Project.Factory;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class MySQLStatement implements AbstractStatement{

    @Override
    public Statement getMysqlStatement(Connection c) throws SQLException {
        MySQLFactory mysql = new MySQLFactory();
        return mysql.createStatement(c);
    }

    @Override
    public Statement getSqlServerStatement(Connection c) {
        return null;
    }
}
