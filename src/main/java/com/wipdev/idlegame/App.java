/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.wipdev.idlegame;

import io.javalin.Javalin;

public class App {

    private Javalin app;
    private final int port = 7777;

    public App(){
        app = Javalin.create(
                javalinConfig -> javalinConfig.addStaticFiles("public")
              ).start(port);

        app.post("/hallo",ctx -> {
            ctx.result("Das ist die Antwort!");
        });
    }




    public static void main(String[] args) { new App(); }
}
