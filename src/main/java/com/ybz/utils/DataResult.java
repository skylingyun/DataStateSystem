package com.ybz.utils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 返回数据
 *
 * @author zhangybt
 * @email zhangybt@yonyou.com
 * @date 2017年8月1日 下午9:59:27
 */
public class DataResult extends HashMap<String, Object> {
    private static final long serialVersionUID = 1L;

    public DataResult() {
        put("code", 0);
        put("totalnum", 20);
        put("success", true);
        put("page", 1);
        put("pagenum", 2);
    }

    public static DataResult error() {
        return error(500, "未知异常，请联系管理员");
    }

    public static DataResult error(String msg) {
        return error(500, msg);
    }

    public static DataResult error(int code, String msg) {
        DataResult dataResult = new DataResult();
        dataResult.put("code", code);
        dataResult.put("msg", msg);
        dataResult.put("success", false);
        return dataResult;
    }

    public static DataResult ok(String msg) {
        DataResult dataResult = new DataResult();
        dataResult.put("msg", msg);
        return dataResult;
    }

    public static DataResult ok(Map<String, Object> map) {
        DataResult dataResult = new DataResult();
        dataResult.putAll(map);
        return dataResult;
    }

    public static DataResult ok() {
        return new DataResult();
    }

    public DataResult put(String key, Object value) {
        super.put(key, value);
        return this;
    }

}
