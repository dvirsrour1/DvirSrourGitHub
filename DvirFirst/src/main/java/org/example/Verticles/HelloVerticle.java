package org.example.Verticles;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Future;
import io.vertx.core.Vertx;

public class HelloVerticle extends AbstractVerticle {

    @Override
    public void start(Future<Void> future) {
        System.out.println("Hello World!");
    }

    public static void main(String[] args) {
        Vertx vertx = Vertx.vertx();
        vertx.deployVerticle(new HelloVerticle());
    }
}