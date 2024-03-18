package Software_Project.Factory;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MySQLFactory implements  AbstractDatebaseFactory{
    Connection con; // 声明Connection对象
    public static String user;
    public static  String password;
    @Override
    public Connection createConnection() {
        try { // 加载数据库驱动类
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("数据库驱动加载成功");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        user = "root";//数据库登录名
        password = "kcy010705";//密码

        Connection con = null;
        try { // 通过访问数据库的URL获取数据库连接对象
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test1?useUnicode=true&characterEncoding=gbk", user, password);
            System.out.println("数据库连接成功");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return con; // 按方法要求返回一个Connection对象


    }

    @Override
    public Statement createStatement(Connection c) throws SQLException {

        return c.createStatement();
    }
}
