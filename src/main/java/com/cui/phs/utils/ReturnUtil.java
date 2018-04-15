//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.cui.phs.utils;

import java.util.HashMap;
import java.util.Map;

public class ReturnUtil {
    private static final String SUCCESS = "success";
    private static final String RESULT = "resultMsg";
    private static final String CODE = "code";

    public ReturnUtil() {
    }

    public static Map<String, Object> getSuccessMap(String method, String key, Object pd) {
        HashMap result = new HashMap();

        try {
            if (method.equals("addOne")) {
                result.put("resultMsg", "添加成功");
            } else {
                result.put("resultMsg", "修改成功");
            }

            if (key != null && key != "") {
                result.put(key, pd);
            }

            result.put("code", Integer.valueOf(200));
            result.put("success", true);
        } catch (Exception var5) {
            result.put("code", Integer.valueOf(500));
            result.put("success", false);
            var5.printStackTrace();
        }

        return result;
    }

    public static Map<String, Object> getListMap(Object varList, String size) {
        HashMap result = new HashMap();

        try {
            if (varList != null) {
                result.put("resultMsg", varList);
                result.put("code", Integer.valueOf(200));
                result.put("success", true);
            } else {
                result.put("resultMsg", "读取失败");
                result.put("code", Integer.valueOf(300));
                result.put("success", false);
            }
        } catch (Exception var4) {
            result.put("resultMsg", var4.getMessage());
            result.put("code", Integer.valueOf(500));
            result.put("success", false);
        }

        return result;
    }
}
