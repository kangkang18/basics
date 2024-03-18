package Software_Project.Factory;

import java.sql.*;

public class Test {
    Connection con ; // 声明Connection对象
    public static String user;
    public static  String password;
    public static Connection getSqlServerConnection(){
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

    public static void main(String[] args) throws SQLException {
//        String driverName = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
//        String dbURL = "jdbc:sqlserver://localhost:1433;DatabaseName=test2" ;
//        String userName = "sa";
//        String userPwd = "kcy010705";
//        Connection dbConn = null;
//        try {
//            // 注册驱动
//            Class.forName(driverName);
//            // 获取数据库连接
//            dbConn = DriverManager.getConnection(dbURL, userName, userPwd);
//            System.out.println("连接数据库成功");
//        } catch (Exception e) {
//            e.printStackTrace();
//            System.out.print("连接失败");
//        }
        Connection c = Test.getSqlServerConnection();
        Statement statement = c.createStatement();
        System.out.println(c);
        System.out.println(statement);



    }


}
