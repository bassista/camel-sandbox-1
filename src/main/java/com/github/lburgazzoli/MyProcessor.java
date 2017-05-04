package com.github.lburgazzoli;

import java.util.concurrent.atomic.AtomicInteger;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class MyProcessor implements Processor {
    private final String message;
    private final AtomicInteger counter;

    public MyProcessor(String message) {
        this.message = message;
        this.counter = new AtomicInteger();
    }

    @Override
    public void process(Exchange exchange) throws Exception {
        exchange.getIn().setBody(message + " (" + this.counter.incrementAndGet() + ")");
    }
}
