package com.ssm.simple.demo;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * json解析
 *
 * @Author peanutnowing
 * @Date 2019/3/28
 */
public class JsonParseDemo {
    public static void main(String[] args) {

        String jsonStr = "";
        //获取jsonobject对象
        JSONObject jsonObject = (JSONObject) JSONObject.parseObject(jsonStr.toString()).getJSONObject("data");
        //获取jsonArray数组数据
        JSONArray jsonArray = (JSONArray) jsonObject.getJSONArray("list");

        List<String> idList = new ArrayList<>();
        for (Iterator iterator = jsonArray.iterator(); iterator.hasNext(); ) {
            JSONObject jo = (JSONObject) iterator.next();
            String articleId = String.valueOf(jo.get("id"));
            idList.add(articleId);
        }
    }
}
