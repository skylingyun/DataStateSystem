package com.ybz;

import com.ybz.utils.DataBaseUtils;
import com.yonyou.iuap.context.InvocationInfoProxy;
import org.apache.ibatis.io.Resources;
import org.junit.Test;

import java.sql.*;
import java.util.*;

/**
 * 获取数据库接口
 *
 * @author zhangybt
 * @create 2017年08月09日 15:05
 **/
public class DatabaseTest {

    @Test
    public void databaseTest() throws Exception {
        int count = 0;
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
        //我知道这个只用一列,因此直接加载
        while (rs.next()) {
//            list.add(rs.getString(1));
            Map<Integer, String> map = new HashMap<Integer, String>();
            map.put(count++, rs.getString(1));
            System.out.println(map);
        }
        rs.close();
        stmt.close();
        conn.close();
    }

    @Test
    public void test(){
        try {
            List<Map<String, String>> dataBasesList = DataBaseUtils.getDataBasesList();
            for (Map<String, String> map : dataBasesList)
            {
                for (String k : map.keySet())
                {
                    System.out.println(map.get(k));
                }

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void getTableNameByCon() {
        Connection con = null;
        try {
            DatabaseMetaData meta = con.getMetaData();
            ResultSet rs = meta.getTables(null, null, null,
                    new String[] { "TABLE" });
            while (rs.next()) {
                System.out.println("表名：" + rs.getString(3));
                System.out.println("表所属用户名：" + rs.getString(2));
                System.out.println("------------------------------");
            }
            con.close();
        } catch (Exception e) {
            try {
                con.close();
            } catch (SQLException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            }
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @Test
    public void queryDataBasesList(){
        int key = 1;
        List<Map<String,String>> mapList = new ArrayList<Map<String, String>>();
        try {
            List<String> list = DataBaseUtils.queryDataBasesList();
            for (int i = 0; i < list.size(); i++) {
                Map<String,String> map = new HashMap<String, String>();
                map.put(String.valueOf(key++),list.get(i));
                mapList.add(map);
            }
            System.out.println(mapList);


//            String[] strings = new String[list.size()];
//            list.toArray(strings);
//            System.out.println(list);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
