package com.nhsoft.luckygold.util;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.nhsoft.luckygold.request.RequestData;
import com.nhsoft.luckygold.request.ResultData;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;


public class HttpUtil {

    private static final Logger logger = LoggerFactory.getLogger(HttpUtil.class);


    public static ResultData sendPost(String url, Map map){

        Gson gson = new Gson();
        String json = gson.toJson(map);
        CloseableHttpClient httpClient = null;
        CloseableHttpResponse response = null;
        try {
            httpClient = HttpClients.createDefault();
            HttpPost httpPost = new HttpPost(url);
            httpPost.setHeader("Authorization","Basic ZXNsOmVzbA==");
            httpPost.setHeader("Cache-Control","no-cache");
            httpPost.setHeader("X-Requested-With","XMLHttpRequest");//ajax异步请求
            httpPost.setHeader("Content-Type", "application/json;charset=utf-8");
            StringEntity stringEntity = new StringEntity(json,"utf-8");
            httpPost.setEntity(stringEntity);
            response = httpClient.execute(httpPost);
            String result = EntityUtils.toString(response.getEntity(), "utf-8");

            Type type = new TypeToken<ArrayList<ResultData>>() {}.getType();
            ArrayList<ResultData> resultDatas = gson.fromJson(result, type);
            ResultData resultData = null;
            if(resultDatas != null){
                resultData = resultDatas.get(0);
            }
            return resultData;

        } catch (Exception e) {
            logger.error(e.getMessage());
            throw new RuntimeException();
        }finally {
            try {
                if(response != null){
                    response.close();
                }
                if(httpClient != null){
                    httpClient.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }



    }


    public static ResultData sendTest(String url, List<RequestData> list){

        Gson gson = new Gson();
        String json = gson.toJson(list);
        CloseableHttpClient httpClient = null;
        CloseableHttpResponse response = null;
        try {
            httpClient = HttpClients.createDefault();
            HttpPost httpPost = new HttpPost(url);
            httpPost.setHeader("Authorization","Basic ZXNsOmVzbA==");
            httpPost.setHeader("Cache-Control","no-cache");
            httpPost.setHeader("X-Requested-With","XMLHttpRequest");//ajax异步请求
            httpPost.setHeader("Content-Type", "application/json;charset=utf-8");
            StringEntity stringEntity = new StringEntity(json,"utf-8");
            httpPost.setEntity(stringEntity);
            response = httpClient.execute(httpPost);
            String result = EntityUtils.toString(response.getEntity(), "utf-8");

            Type type = new TypeToken<ArrayList<ResultData>>() {}.getType();
            ArrayList<ResultData> resultDatas = gson.fromJson(result, type);
            ResultData resultData = null;
            if(resultDatas != null){
                resultData = resultDatas.get(0);
            }
            return resultData;

        } catch (Exception e) {
            logger.error(e.getMessage());
            throw new RuntimeException();
        }finally {
            try {
                if(response != null){
                    response.close();
                }
                if(httpClient != null){
                    httpClient.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }



    }
}
