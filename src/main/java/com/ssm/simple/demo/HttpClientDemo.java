package com.ssm.simple.demo;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

/**
 * Created by peanutnowing on 2019/3/24.
 */
public class HttpClientDemo {

    public static void main(String[] args) throws IOException {
        CloseableHttpClient httpClient = HttpClients.createDefault();//初始化Httpclient
        HttpGet httpGet=new HttpGet("http://www.peanutplan.com");
        CloseableHttpResponse response = null;
        try {
            response = httpClient.execute(httpGet);
        } catch (IOException e) {
            e.printStackTrace();
        }
        String entity = EntityUtils.toString (response.getEntity(),"utf-8");
        System.out.println(entity);
        response.close();
    }

}
