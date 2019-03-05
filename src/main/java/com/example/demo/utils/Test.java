package com.example.demo.utils;

import com.google.gson.JsonObject;

/**
 * @Author: fwb
 * @Date: 2019/2/28  10:36
 */
public class Test {

    private static String ACTION_INDEX_TMPL = "{ \"index\" : { \"_index\" : \""+"test"+"\", \"_type\" : \"sug_key\", \"_id\" : \"%s\" } }";


    public static void main(String[] args) {

        JsonObject object = new JsonObject();
        object.addProperty("one", "hello");
        object.addProperty("two", "end");
        StringBuffer stringBuffer = new StringBuffer(String.format(ACTION_INDEX_TMPL, "999"))
                .append("\n").append(object.toString());

        System.out.println(stringBuffer);
    }
}
