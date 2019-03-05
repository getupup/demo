package com.example.demo.utils;

import org.elasticsearch.client.Client;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.TransportAddress;
import org.elasticsearch.transport.client.PreBuiltTransportClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;
import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @Author: fwb
 * @Date: 2019/2/27  10:22
 */
@Configuration
public class EsUtlis {

    private static Logger LOG = LoggerFactory.getLogger(EsUtlis.class);
    private final static String HOST = "127.0.0.1";
    private final static int PORT = 9306;
    private static TransportClient client = null;

    @Bean(name = "client")
    public static TransportClient getClient(){
        try {
            TransportAddress address = new TransportAddress(
                    InetAddress.getByName(HOST), PORT);
            client = new PreBuiltTransportClient(Settings.EMPTY);
            client.addTransportAddress(address);
        }catch (UnknownHostException e){
            LOG.info("获取ES客户端失败！！！");
        }
        return client;
    }

    public static void closeClient(Client client){

        if (null != client){
            try {
                client.close();
            }catch (Exception e){
                LOG.info("关闭ES客户端失败！！！");
            }
        }
    }
}
