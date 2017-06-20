package com.stream.twitter.util;

import org.apache.http.impl.nio.client.CloseableHttpAsyncClient;
import org.apache.http.impl.nio.client.HttpAsyncClients;

/**
 * Created by pradeep.kaushal on 20/06/17.
 */
public class HttpClient {
    private static HttpClient ourInstance = new HttpClient();
    private CloseableHttpAsyncClient httpclient = HttpAsyncClients.createDefault();

    public static HttpClient getInstance() {
        return ourInstance;
    }

    private HttpClient() {
        httpclient.start();
    }


}
