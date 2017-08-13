package com.ybz.utils;

import org.apache.ibatis.io.Resources;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;

/**
 * 获取所有的数据库名称
 *
 * @author zhangybt
 * @create 2017年08月09日 15:09
 **/
public class DataBaseUtils {

    /**
     * 获取数据库名称(List<Map<String,String>)
     * @return
     * @throws Exception
     */
    public static List<Map<String,String>> getDataBasesList() throws Exception {
        int key = 0;
        List<Map<String,String>> mapList = new ArrayList<Map<String, String>>();
        try {
            List<String> list = DataBaseUtils.queryDataBasesList();
            for (int i = 0; i < list.size(); i++) {
                Map<String,String> map = new HashMap<String, String>();
                map.put(String.valueOf(key++),list.get(i));
                mapList.add(map);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return mapList;
    }
    /**
     * 获取数据库名称(List<String>)
     * @return
     * @throws Exception
     */
    public static List<String> queryDataBasesList() throws Exception {
        Connection conn = null;
        Statement stmt = null;
        Properties props = Resources.getResourceAsProperties("db.properties");
        String url = props.getProperty("jdbc.url");
        String driver = props.getProperty("jdbc.driver");
        String username = props.getProperty("jdbc.username");
        String password = props.getProperty("jdbc.password");

        Class.forName(driver).newInstance();
        conn = DriverManager.getConnection(url, username, password);
        stmt = conn.createStatement();
        stmt.execute("show databases");
        ResultSet rs = stmt.getResultSet();
        List<String> list = new ArrayList<String>();
        while (rs.next()) {
            list.add(rs.getString(1));
        }
        rs.close();
        stmt.close();
        conn.close();
        return list;
    }
}
