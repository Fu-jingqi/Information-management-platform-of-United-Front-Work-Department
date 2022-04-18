package com.util;

import java.math.BigDecimal;
import java.sql.*;

public class ConnUtil {
    private static final String driver = "com.mysql.jdbc.Driver";// 数据库驱动
    private static final String url = "jdbc:mysql://localhost:3306/empinfor?useUnicode=true&characterEncoding=utf8&serverTimezone=GMT";   //"login"是指你的数据库名称 3306是端口
    private static final String username = "root";         //  数据库用户名
    private static final String password = "fjq72110902";
//    private static final Connection conn = null ;

    public static Connection getConn()  {
        Connection conn = null ;
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, username, password);
//            Statement statement = conn.createStatement();//获取操作数据库的对象
//            String sql="select * from person";
//            ResultSet resultSet = statement.executeQuery(sql);//执行sql，获取结果集
//
//            while(resultSet.next()){ //遍历结果集，取出数据
//                int pid = resultSet.getInt("pid");
//                String pname = resultSet.getString("pname");
//                int page = resultSet.getInt("page");
//                Date pbirth= resultSet.getDate("pbirth");
//                String pwd = resultSet.getString("pwd");
//                //输出数据
//                System.out.print("编号："+pid);
//                System.out.print("，名称：" + pname);
//                System.out.print("，价格"+page);
//                System.out.print("，出版日期"+pbirth);
//                System.out.print(",库存"+pwd);
//                System.out.println();
//            }
//            //4、关闭结果集、数据库操作对象、数据库连接
//            resultSet.close();
//            statement.close();
//            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn ;
    }
}
