package me.hifancy.im;

import java.sql.*;

public class putSc {
    private static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    private static final String DB_URL = "jdbc:mysql://localhost:3306/school?serverTimezone=UTC &amp characterEncoding=utf-8";
    private static final String USER = "root";
    private static final String PASSWORD = "";
    private String sql;

    public static Connection getConn(){
        Connection conn = null;
//        Statement stet = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("get connection");
            conn = DriverManager.getConnection(DB_URL,USER,PASSWORD);
            System.out.println("succssfuly");

        }catch (Exception se){
            se.printStackTrace();
        }
        return conn;
    }

    public String getSql() {
        return sql;
    }

    public void setSql(String sql) {
        this.sql = sql;
    }

    public void doSth(String sql) throws Exception{
        System.out.println("Creating statement....");
        Statement stmt = getConn().createStatement();
         stmt.executeUpdate(sql);
        stmt.close();
        getConn().close();
    }

    public void read(String sql) throws Exception{
        Statement stmt = getConn().createStatement();
        ResultSet rs = stmt.executeQuery(sql);
        while (rs.next()){
            System.out.println(rs.getInt("s_no"));
            System.out.println(rs.getString("s_name"));
            System.out.println(rs.getString("s_sex"));
            System.out.println(rs.getDate("s_birthday"));
            System.out.println(rs.getInt("class"));
        }
        rs.close();
        stmt.close();
        getConn().close();
    }
}
