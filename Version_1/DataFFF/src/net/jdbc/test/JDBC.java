package net.jdbc.test;

import java.math.BigDecimal;
import java.sql.*;

public class JDBC {
    //数据库url、用户名和密码
    static final String DB_URL="jdbc:mysql://localhost:3306/book?useUnicode=true&characterEncoding=UTF-8&useSSL=false";
    static final String USER="root";
    static final String PASS="fjq72110902";
    public static void main(String[] args) {
        try {
            //1、注册JDBC驱动
            Class.forName("com.mysql.jdbc.Driver");
            //2、获取数据库连接
            Connection connection = DriverManager.getConnection(DB_URL, USER, PASS);
            //3、操作数据库
            Statement statement = connection.createStatement();//获取操作数据库的对象
            String sql="select * from bookinfo";
            ResultSet resultSet = statement.executeQuery(sql);//执行sql，获取结果集

            while(resultSet.next()){ //遍历结果集，取出数据
                int book_id = resultSet.getInt("book_id");
                String book_name = resultSet.getString("book_name");
                BigDecimal price = resultSet.getBigDecimal("price");
                Date public_date = resultSet.getDate("public_date");
                String store = resultSet.getString("store");
                //输出数据
                System.out.print("图书编号："+book_id);
                System.out.print("，图书名称："+book_name);
                System.out.print("，价格"+price);
                System.out.print("，出版日期"+public_date);
                System.out.print(",库存"+store);
                System.out.println();
            }
            //4、关闭结果集、数据库操作对象、数据库连接
            resultSet.close();
            statement.close();
            connection.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch(SQLException e){
            e.printStackTrace();
        } catch(Exception e){
            e.printStackTrace();
        }
    }
}