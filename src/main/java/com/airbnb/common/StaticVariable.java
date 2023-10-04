package com.airbnb.common;

public class StaticVariable {

    static String url;

    public static String getUrl() {
        return url;
    }

    public static void setUrl(String url) {
        StaticVariable.url = url;
    }
}
