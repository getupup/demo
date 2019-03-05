package com.example.demo.utils;

import org.elasticsearch.client.transport.TransportClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.Resource;

/**
 * @Author: fwb
 * @Date: 2019/2/27  17:09
 */
public class EsTest {

    private static Logger LOG = LoggerFactory.getLogger(EsTest.class);
    @Resource(name = "client")
    private static TransportClient client;

    public static void main(String[] args) {
        System.out.println(client);
    }

}
