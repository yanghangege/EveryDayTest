//package com.example.demo.util;
//
///**
// * @Description: 远程调用
// * @Author: GuoXT
// * @Date: 2020/4/26 15:41
// */
//
//import org.apache.commons.io.IOUtils;
//import org.apache.http.HttpEntity;
//import org.apache.http.HttpResponse;
//import org.apache.http.NameValuePair;
//import org.apache.http.client.config.RequestConfig;
//import org.apache.http.client.entity.UrlEncodedFormEntity;
//import org.apache.http.client.methods.CloseableHttpResponse;
//import org.apache.http.client.methods.HttpGet;
//import org.apache.http.client.methods.HttpPost;
//import org.apache.http.impl.client.CloseableHttpClient;
//import org.apache.http.impl.client.HttpClients;
//import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
//import org.apache.http.message.BasicNameValuePair;
//import org.apache.http.util.EntityUtils;
//
//import java.io.IOException;
//import java.io.InputStream;
//import java.nio.charset.Charset;
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//public class HttpClientUtil {
//    private static PoolingHttpClientConnectionManager connMgr;
//    private static RequestConfig requestConfig;
//    private static final int MAX_TIMEOUT = 7000;
//    private static final String CODE = "UTF-8";
//
//    static {
//        // 设置连接池
//        connMgr = new PoolingHttpClientConnectionManager();
//        // 设置连接池大小
//        connMgr.setMaxTotal(100);
//        connMgr.setDefaultMaxPerRoute(connMgr.getMaxTotal());
//
//        RequestConfig.Builder configBuilder = RequestConfig.custom();
//        // 设置连接超时
//        configBuilder.setConnectTimeout(MAX_TIMEOUT);
//        // 设置读取超时
//        configBuilder.setSocketTimeout(MAX_TIMEOUT);
//        // 设置从连接池获取连接实例的超时
//        configBuilder.setConnectionRequestTimeout(MAX_TIMEOUT);
//        // 在提交请求之前 测试连接是否可用
//        configBuilder.setStaleConnectionCheckEnabled(true);
//        requestConfig = configBuilder.build();
//    }
//
//    /**
//     * 填充请求头参数至get请求中
//     *
//     * @param httpGet
//     * @param headers
//     * @return
//     */
//    private static HttpGet setHeadersToGet(HttpGet httpGet, Map<String, String> headers) {
//        if (headers != null && headers.size() != 0) {
//            for (String key : headers.keySet()) {
//                httpGet.addHeader(key, headers.get(key));
//            }
//        }
//        return httpGet;
//    }
//
//    /**
//     * 填充请求头参数至Post请求中
//     *
//     * @param httpPost
//     * @param headers
//     * @return
//     */
//    private static HttpPost setHeadersToPost(HttpPost httpPost, Map<String, String> headers) {
//        if (headers != null && headers.size() != 0) {
//            for (String key : headers.keySet()) {
//                httpPost.addHeader(key, headers.get(key));
//            }
//        }
//        return httpPost;
//    }
//
//    /**
//     * 填充请求体参数至Post请求中
//     *
//     * @param httpPost
//     * @param params
//     * @return
//     */
//    private static HttpPost setParamsToRequest(HttpPost httpPost, Map<String, Object> params) {
//
//        List<NameValuePair> pairList = new ArrayList<NameValuePair>(params.size());
//        for (Map.Entry<String, Object> entry : params.entrySet()) {
//            NameValuePair pair = null;
//            if (entry.getValue() == null) {
//                pair = new BasicNameValuePair(entry.getKey(), null);
//            } else {
//                pair = new BasicNameValuePair(entry.getKey(), entry.getValue().toString());
//            }
//            pairList.add(pair);
//        }
//        httpPost.setEntity(new UrlEncodedFormEntity(pairList, Charset.forName("UTF-8")));
//        return httpPost;
//    }
//
//    /**
//     * 发送 GET 请求（HTTP），不带输入数据
//     *
//     * @param url
//     * @return
//     */
//    public static RequestResult doGet(String url) {
//        return doGet(url, new HashMap<String, Object>(), new HashMap<String, String>());
//    }
//
//    /**
//     * 发送 GET 请求（HTTP）,K-V形式,无请求头参数
//     *
//     * @param url
//     * @param params
//     * @return
//     */
//    public static RequestResult doGet(String url, Map<String, Object> params) {
//        return doGet(url, params, null);
//    }
//
//    /**
//     * 发送 GET 请求（HTTP），K-V形式，有请求头参数
//     *
//     * @param url     API接口URL
//     * @param params  参数map
//     * @param headers 请求头参数
//     * @return
//     */
//    public static RequestResult doGet(String url, Map<String, Object> params, Map<String, String> headers) {
//
//        CloseableHttpClient httpClient = HttpClients.custom().setDefaultRequestConfig(requestConfig).build();
//        HttpGet httpGet = null;
//        HttpResponse response = null;
//        RequestResult requestResult = new RequestResult();
//        String apiUrl = url;
//        StringBuffer param = new StringBuffer();
//        int i = 0;
//        if (params != null && params.size() > 0) {
//            for (String key : params.keySet()) {
//                if (i == 0)
//                    param.append("?");
//                else
//                    param.append("&");
//                param.append(key).append("=").append(params.get(key));
//                i++;
//            }
//        }
//        apiUrl += param;
//        String result = null;
//        try {
//            HttpEntity entity = null;
//            httpGet = new HttpGet(apiUrl);
//            httpGet = setHeadersToGet(httpGet, headers);
//            response = httpClient.execute(httpGet);
//            if (response != null) {
//                entity = response.getEntity();
//            }
//
//            if (entity != null) {
//                InputStream instream = entity.getContent();
//                result = IOUtils.toString(instream, "UTF-8");
//                requestResult.setResult(result);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            requestResult.setStatusCode(response.getStatusLine().getStatusCode());
//        }
//        return requestResult;
//    }
//
//    /**
//     * 发送 POST 请求（HTTP），不带输入数据
//     *
//     * @param url
//     * @return
//     */
//    public static RequestResult doPost(String url) {
//        return doPost(url, new HashMap<String, Object>(), new HashMap<String, String>());
//    }
//
//    /**
//     * 发送 POST 请求（HTTP）,K-V形式,无请求头参数
//     *
//     * @param url
//     * @param params
//     * @return
//     */
//    public static RequestResult doPost(String url, Map<String, Object> params) {
//        return doPost(url, params, null);
//    }
//
//    /**
//     * 发送 POST 请求（HTTP），K-V形式 ，有请求头参数
//     *
//     * @param url     API接口URL
//     * @param params  参数map
//     * @param headers 请求头参数
//     * @return
//     */
//    public static RequestResult doPost(String url, Map<String, Object> params, Map<String, String> headers) {
//        CloseableHttpClient httpClient = HttpClients.custom().setDefaultRequestConfig(requestConfig).build();
//        RequestResult requestResult = new RequestResult();
//        String httpStr = null;
//        HttpPost httpPost = new HttpPost(url);
//        CloseableHttpResponse response = null;
//
//        try {
//            httpPost.setConfig(requestConfig);
//            httpPost = setHeadersToPost(httpPost, headers);
//            httpPost = setParamsToRequest(httpPost, params);
//            response = httpClient.execute(httpPost);
//            if (response != null) {
//                HttpEntity entity = response.getEntity();
//                httpStr = EntityUtils.toString(entity, "UTF-8");
//            }
//            requestResult.setResult(httpStr);
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            if (response != null) {
//                try {
//                    EntityUtils.consume(response.getEntity());
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//            requestResult.setStatusCode(response.getStatusLine().getStatusCode());
//        }
//        return requestResult;
//    }
//
//}
