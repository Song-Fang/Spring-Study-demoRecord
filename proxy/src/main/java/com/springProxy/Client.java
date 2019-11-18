package com.springProxy;

public class Client {
    public static void main(String[] args) {
        Producer producer = new Producer();
        producer.sellProduct(1000);
    }
}
