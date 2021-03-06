package org.meizhuo.rpc.client;

import org.meizhuo.rpc.server.RPCResponse;

/**
 * Created by wephone on 17-12-27.
 * 调用端发送请求实体类
 * 也作为回调中同步等待的对象锁
 */
public class RPCRequest {

    private String requestID;
    private String serviceId;
    private String methodName;
//    private Class[] parameterTypes;
    private Object[] parameters;
    //结果异步返回时 赋值在这里
    private RPCResponse rpcResponse;
    //本次请求的traceId
    private String traceId;
    //本次请求的spanId
    private String spanId;
    private Long requestTime;

    public String getRequestID() {
        return requestID;
    }

    public void setRequestID(String requestID) {
        this.requestID = requestID;
    }

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }

//    public Class[] getParameterTypes() {
//        return parameterTypes;
//    }
//
//    public void setParameterTypes(Class[] parameterTypes) {
//        this.parameterTypes = parameterTypes;
//    }

    public Object[] getParameters() {
        return parameters;
    }

    public void setParameters(Object[] parameters) {
        this.parameters = parameters;
    }

    public Boolean getIsResponse() {
        if (rpcResponse==null){
            return false;
        }
        return true;
    }

    public RPCResponse getRpcResponse() {
        return rpcResponse;
    }

    public void setRpcResponse(RPCResponse rpcResponse) {
        this.rpcResponse = rpcResponse;
    }

    public String getTraceId() {
        return traceId;
    }

    public void setTraceId(String traceId) {
        this.traceId = traceId;
    }

    public String getSpanId() {
        return spanId;
    }

    public void setSpanId(String spanId) {
        this.spanId = spanId;
    }

    public Long getRequestTime() {
        return requestTime;
    }

    public void setRequestTime(Long requestTime) {
        this.requestTime = requestTime;
    }
}
