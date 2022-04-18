package com.jackyzeng.designpatterns.behaviours.responsibilityChain;

public class ConcreteHandler1 extends Handler {

    public ConcreteHandler1(Handler successor) {
        super(successor);
    }

    @Override
    protected void handleRequest(Request request) {
        if (request.getType() == Request.RequestType.TYPE1) {
            System.out.println(request.getName() + " is handle by ConcreteHandler1");
            return;
        }
        if (successor != null) {
            successor.handleRequest(request);
        }
    }

    public static void main(String[] args) {

        Handler handler1 = new ConcreteHandler1(null);
        Handler handler2 = new ConcreteHandler2(handler1);

        Request request1 = new Request(Request.RequestType.TYPE1, "request1");
        handler2.handleRequest(request1);

        Request request2 = new Request(Request.RequestType.TYPE2, "request2");
        handler2.handleRequest(request2);
    }
}
