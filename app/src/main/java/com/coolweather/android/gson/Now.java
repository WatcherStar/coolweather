package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by LiangB on 2022/1/25.
 */

public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More{
        @SerializedName("text")
        public String info;
    }
}
