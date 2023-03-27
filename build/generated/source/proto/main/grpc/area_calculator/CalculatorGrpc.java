package area_calculator;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.49.0)",
    comments = "Source: area_calculator.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class CalculatorGrpc {

  private CalculatorGrpc() {}

  public static final String SERVICE_NAME = "area_calculator.Calculator";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<area_calculator.AreaCalculator.ShapeMessage,
      area_calculator.AreaCalculator.AreaResponse> getCalculateOneMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "calculateOne",
      requestType = area_calculator.AreaCalculator.ShapeMessage.class,
      responseType = area_calculator.AreaCalculator.AreaResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<area_calculator.AreaCalculator.ShapeMessage,
      area_calculator.AreaCalculator.AreaResponse> getCalculateOneMethod() {
    io.grpc.MethodDescriptor<area_calculator.AreaCalculator.ShapeMessage, area_calculator.AreaCalculator.AreaResponse> getCalculateOneMethod;
    if ((getCalculateOneMethod = CalculatorGrpc.getCalculateOneMethod) == null) {
      synchronized (CalculatorGrpc.class) {
        if ((getCalculateOneMethod = CalculatorGrpc.getCalculateOneMethod) == null) {
          CalculatorGrpc.getCalculateOneMethod = getCalculateOneMethod =
              io.grpc.MethodDescriptor.<area_calculator.AreaCalculator.ShapeMessage, area_calculator.AreaCalculator.AreaResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "calculateOne"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  area_calculator.AreaCalculator.ShapeMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  area_calculator.AreaCalculator.AreaResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CalculatorMethodDescriptorSupplier("calculateOne"))
              .build();
        }
      }
    }
    return getCalculateOneMethod;
  }

  private static volatile io.grpc.MethodDescriptor<area_calculator.AreaCalculator.AreaRequest,
      area_calculator.AreaCalculator.AreaResponse> getCalculateMultiMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "calculateMulti",
      requestType = area_calculator.AreaCalculator.AreaRequest.class,
      responseType = area_calculator.AreaCalculator.AreaResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<area_calculator.AreaCalculator.AreaRequest,
      area_calculator.AreaCalculator.AreaResponse> getCalculateMultiMethod() {
    io.grpc.MethodDescriptor<area_calculator.AreaCalculator.AreaRequest, area_calculator.AreaCalculator.AreaResponse> getCalculateMultiMethod;
    if ((getCalculateMultiMethod = CalculatorGrpc.getCalculateMultiMethod) == null) {
      synchronized (CalculatorGrpc.class) {
        if ((getCalculateMultiMethod = CalculatorGrpc.getCalculateMultiMethod) == null) {
          CalculatorGrpc.getCalculateMultiMethod = getCalculateMultiMethod =
              io.grpc.MethodDescriptor.<area_calculator.AreaCalculator.AreaRequest, area_calculator.AreaCalculator.AreaResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "calculateMulti"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  area_calculator.AreaCalculator.AreaRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  area_calculator.AreaCalculator.AreaResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CalculatorMethodDescriptorSupplier("calculateMulti"))
              .build();
        }
      }
    }
    return getCalculateMultiMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CalculatorStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CalculatorStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CalculatorStub>() {
        @java.lang.Override
        public CalculatorStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CalculatorStub(channel, callOptions);
        }
      };
    return CalculatorStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CalculatorBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CalculatorBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CalculatorBlockingStub>() {
        @java.lang.Override
        public CalculatorBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CalculatorBlockingStub(channel, callOptions);
        }
      };
    return CalculatorBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CalculatorFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CalculatorFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CalculatorFutureStub>() {
        @java.lang.Override
        public CalculatorFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CalculatorFutureStub(channel, callOptions);
        }
      };
    return CalculatorFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class CalculatorImplBase implements io.grpc.BindableService {

    /**
     */
    public void calculateOne(area_calculator.AreaCalculator.ShapeMessage request,
        io.grpc.stub.StreamObserver<area_calculator.AreaCalculator.AreaResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCalculateOneMethod(), responseObserver);
    }

    /**
     */
    public void calculateMulti(area_calculator.AreaCalculator.AreaRequest request,
        io.grpc.stub.StreamObserver<area_calculator.AreaCalculator.AreaResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCalculateMultiMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCalculateOneMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                area_calculator.AreaCalculator.ShapeMessage,
                area_calculator.AreaCalculator.AreaResponse>(
                  this, METHODID_CALCULATE_ONE)))
          .addMethod(
            getCalculateMultiMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                area_calculator.AreaCalculator.AreaRequest,
                area_calculator.AreaCalculator.AreaResponse>(
                  this, METHODID_CALCULATE_MULTI)))
          .build();
    }
  }

  /**
   */
  public static final class CalculatorStub extends io.grpc.stub.AbstractAsyncStub<CalculatorStub> {
    private CalculatorStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CalculatorStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CalculatorStub(channel, callOptions);
    }

    /**
     */
    public void calculateOne(area_calculator.AreaCalculator.ShapeMessage request,
        io.grpc.stub.StreamObserver<area_calculator.AreaCalculator.AreaResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCalculateOneMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void calculateMulti(area_calculator.AreaCalculator.AreaRequest request,
        io.grpc.stub.StreamObserver<area_calculator.AreaCalculator.AreaResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCalculateMultiMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class CalculatorBlockingStub extends io.grpc.stub.AbstractBlockingStub<CalculatorBlockingStub> {
    private CalculatorBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CalculatorBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CalculatorBlockingStub(channel, callOptions);
    }

    /**
     */
    public area_calculator.AreaCalculator.AreaResponse calculateOne(area_calculator.AreaCalculator.ShapeMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCalculateOneMethod(), getCallOptions(), request);
    }

    /**
     */
    public area_calculator.AreaCalculator.AreaResponse calculateMulti(area_calculator.AreaCalculator.AreaRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCalculateMultiMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class CalculatorFutureStub extends io.grpc.stub.AbstractFutureStub<CalculatorFutureStub> {
    private CalculatorFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CalculatorFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CalculatorFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<area_calculator.AreaCalculator.AreaResponse> calculateOne(
        area_calculator.AreaCalculator.ShapeMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCalculateOneMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<area_calculator.AreaCalculator.AreaResponse> calculateMulti(
        area_calculator.AreaCalculator.AreaRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCalculateMultiMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CALCULATE_ONE = 0;
  private static final int METHODID_CALCULATE_MULTI = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CalculatorImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CalculatorImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CALCULATE_ONE:
          serviceImpl.calculateOne((area_calculator.AreaCalculator.ShapeMessage) request,
              (io.grpc.stub.StreamObserver<area_calculator.AreaCalculator.AreaResponse>) responseObserver);
          break;
        case METHODID_CALCULATE_MULTI:
          serviceImpl.calculateMulti((area_calculator.AreaCalculator.AreaRequest) request,
              (io.grpc.stub.StreamObserver<area_calculator.AreaCalculator.AreaResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class CalculatorBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CalculatorBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return area_calculator.AreaCalculator.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Calculator");
    }
  }

  private static final class CalculatorFileDescriptorSupplier
      extends CalculatorBaseDescriptorSupplier {
    CalculatorFileDescriptorSupplier() {}
  }

  private static final class CalculatorMethodDescriptorSupplier
      extends CalculatorBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CalculatorMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (CalculatorGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CalculatorFileDescriptorSupplier())
              .addMethod(getCalculateOneMethod())
              .addMethod(getCalculateMultiMethod())
              .build();
        }
      }
    }
    return result;
  }
}
