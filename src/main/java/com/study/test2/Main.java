package com.study.test2;

public class Main {
    public static void main(String[] args) {
        Order order = Order.builder()
                .orderId(100)
                .productName("Samsung GalaxyBook2 Prod")
                .consumerName("홍길동")
                .price(1450000)
                .stock(2)
                .build();
        order.showOrderInfo();
    }
}
