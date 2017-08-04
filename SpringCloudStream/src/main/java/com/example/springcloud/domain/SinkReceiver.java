package com.example.springcloud.domain;

import org.apache.log4j.Logger;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;

/**
 * Created by wenxiangzhou on 2017/6/19.
 */
@EnableBinding(Sink.class)
public class SinkReceiver {
    private Logger log = Logger.getLogger(SinkReceiver.class);

    @StreamListener(Sink.INPUT)
    public void receive(Object payload) {
        log.info("Received: " + payload);
    }
}
