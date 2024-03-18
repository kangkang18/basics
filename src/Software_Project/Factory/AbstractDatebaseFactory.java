package Software_Project.Factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


//抽象工厂接口
public interface AbstractDatebaseFactory {
    Connection createConnection();
    Statement createStatement(Connection c) throws SQLException;
}
