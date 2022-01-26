package com.coolweather.android.gson;

/**
 * Created by LiangB on 2022/1/25.
 */

public class AQI {

    public AQICity city;

    public class AQICity{
        public String aqi;

        public String pm25;
    }
}
