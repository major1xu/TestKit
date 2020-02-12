package com.uudaddy.test;

public class RedisBackedCache {
    private String host;
    private int port_number;

    RedisBackedCache(String host, int port_number){}

    public void put(String input1, String input2) {host = input2;}

    public String get(String key) {return host;}
}
