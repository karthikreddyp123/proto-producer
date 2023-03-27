package com.test.protobuf.server;

import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class GrpcServer {
    public static Server server;

    public static void main(String[] args) throws IOException, InterruptedException {
        start();
    }

    public static void start() throws IOException, InterruptedException {
        server = ServerBuilder.forPort(8080)
                .addService(new HelloServiceImpl())
                .addService(new CalculatorImpl()).build();

        System.out.println("Starting server...");
        server.start();
        System.out.println("Server started!");
        server.awaitTermination();
    }

    public static void stop() {
        server.shutdown();
    }

    public static int serverPort() {
        return server.getPort();
    }

}
