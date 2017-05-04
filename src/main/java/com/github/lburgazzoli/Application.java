package com.github.lburgazzoli;


import org.apache.camel.spring.Main;

public class Application {
    public static void main(String... args) throws Exception {
        Main main = new Main();
        main.setApplicationContextUri("classpath:camel.xml");
        main.run(args);
    }
}
