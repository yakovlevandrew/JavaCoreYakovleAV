package Homework6;

import okhttp3.*;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class MainHW6 {

    public static void main(String[] args) throws IOException {

        OkHttpClient client = new OkHttpClient();

        HttpUrl url = new HttpUrl.Builder()
                .scheme("http")
                .host("dataservice.accuweather.com")
                .addPathSegment("forecasts")
                .addPathSegment("v1")
                .addPathSegment("daily")
                .addPathSegment("5day")
                .addPathSegment("2-289349_1_AL")
                .addQueryParameter("apikey", "GICVAnT6jW7mJwGTGA1UISsI5jsRVFjb")
                .addQueryParameter("language", "ru-RU")
                .addQueryParameter("details", "false")
                .addQueryParameter("metric", "true")
                .build();


        Request request = new Request.Builder()
                .addHeader("accept" ,"application/json")
                .url(url)
                .build();

        String jsonAnswer = client.newCall(request).execute().body().string();

        System.out.println(jsonAnswer);


    }
}
