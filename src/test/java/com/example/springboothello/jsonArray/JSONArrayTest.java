package com.example.springboothello.jsonArray;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.util.List;

public class JSONArrayTest {
    public static void main(String[] args) {
        JSONObject jsonObject1 = new JSONObject();
        jsonObject1.put("username","zhangsan");
        JSONObject jsonObject2 = new JSONObject();
        jsonObject2.put("username","lisi");

        JSONArray jsonArray = new JSONArray();
        jsonArray.add(jsonObject1);
        jsonArray.add(jsonObject2);
        List<User> users= jsonArray.toJavaList(User.class);
        System.out.println(".............");
    }
}
