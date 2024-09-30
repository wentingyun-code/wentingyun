package com.soft.book.utils;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.InputStream;
import java.util.Properties;

public class JdbcUtil {

    private static DataSource ds;

    static {
        System.out.println("执行静态代码块");
        Properties properties = new Properties();
        InputStream is = JdbcUtil.class.getClassLoader().getResourceAsStream("druid.properties");
        try {
            properties.load(is);
            ds = DruidDataSourceFactory.createDataSource(properties);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static DataSource getDataSource() {
        return ds;
    }

    public JdbcUtil(){
        System.out.println("执行构造方法");
    }

}
