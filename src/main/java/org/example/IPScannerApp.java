package org.example;

import io.javalin.Javalin;

public class IPScannerApp {
    public static void main(String[] args) {
        Javalin app = Javalin.create().start(8081);

        app.get("/", ctx -> {
            ctx.contentType("text/plain;charset=utf-8");
            ctx.result("Hello Javalin");
        });
    }
}