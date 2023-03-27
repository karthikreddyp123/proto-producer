package com.test.protobuf.server;

import area_calculator.AreaCalculator;
import area_calculator.CalculatorGrpc;

public class CalculatorImpl extends CalculatorGrpc.CalculatorImplBase {

    @Override
    public void calculateOne(area_calculator.AreaCalculator.ShapeMessage request,
                             io.grpc.stub.StreamObserver<area_calculator.AreaCalculator.AreaResponse> responseObserver) {
        System.out.println("Request received from client:\n" + request);

        AreaCalculator.AreaResponse response = AreaCalculator.AreaResponse.newBuilder().addValue((float)request.getRectangle().getLength() * request.getRectangle().getWidth()).build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
