/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.wipdev.idlegame;

import io.javalin.Javalin;

import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;

public class App {

    private Javalin app;
    private final int port = 7777;

    public App(){
        app = Javalin.create(
                javalinConfig -> javalinConfig.addStaticFiles("public")
              ).start(port);

        app.post("/hallo",ctx -> {
            String content = URLDecoder.decode(ctx.queryString(), StandardCharsets.UTF_8.toString());
            ctx.result("Dein PP ist"+content);
        });
    }




    public static void main(String[] args) { new App(); }
}
