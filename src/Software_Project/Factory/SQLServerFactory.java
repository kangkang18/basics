package Software_Project.Factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class SQLServerFactory implements AbstractDatebaseFactory{

    Connection con; // 声明Connection对象
    public static String user;
    public static  String password;
    @Override
    public Connection createConnection() {

        String driverName = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
        String dbURL = "jdbc:sqlserver://localhost:1433;DatabaseName=test2" ;
        user = "sa";
        password = "kcy010705";
        Connection con = null;

        try {
            // 注册驱动
            Class.forName(driverName);
            // 获取数据库连接
            con = DriverManager.getConnection(dbURL, user, password);
            System.out.println("连接数据库成功");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.print("连接失败");
        }
        return con;
    }

    @Override
    public Statement createStatement(Connection c) throws SQLException {
        return c.createStatement();
    }
}
