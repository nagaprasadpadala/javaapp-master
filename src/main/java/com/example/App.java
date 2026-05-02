package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}

@RestController
class HelloController {

    @GetMapping("/")
    public String hello() {
        return """
            <!DOCTYPE html>
            <html>
            <head>
                <title>Title</title>
                <style>
                    body {
                        background: linear-gradient(to right, #4facfe, #00f2fe);
                        color: white;
                        font-family: Arial, sans-serif;
                        display: flex;
                        justify-content: center;
                        align-items: center;
                        height: 100vh;
                        margin: 0;
                    }
                    h1 {
                        background: rgba(0, 0, 0, 0.3);
                        padding: 20px 40px;
                        border-radius: 15px;
                        box-shadow: 0px 4px 15px rgba(0, 0, 0, 0.2);
                        text-align: center;
                    }
                </style>
            </head>
            <body>
                <h1>Hello from <br>Welcome to Website!!!</h1>
            </body>
            </html>
        """;
    }
}
