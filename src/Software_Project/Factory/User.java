package Software_Project.Factory;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class User {
    public static void main(String[] args) throws SQLException {

        MySQLConnection mysql_c = new MySQLConnection();
        MySQLStatement mysql_s = new MySQLStatement();
        Connection c = mysql_c.getMysqlConnection();
        Statement statement = mysql_s.getMysqlStatement(c);
        System.out.println("调用MySQL的连接对象："+c);
        System.out.println("调用MySQL的语句对象："+statement);

        SQLServerConnection sqlserver_c  = new SQLServerConnection();
        SQLServerStatement sqlserver_s = new SQLServerStatement();
        Connection c1 = sqlserver_c.getSqlServerConnection();
        Statement statement2 = sqlserver_s.getSqlServerStatement(c1);

        System.out.println("调用SQLServer的连接对象："+c1);
        System.out.println("调用SQLServer的语句对象："+statement2);
    }
}
