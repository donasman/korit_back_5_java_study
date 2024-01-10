package com.study.ch15;

import com.study.ch13.D;

public class SendMain {

    public static void main(String[] args) {
        SendData<?> sendData1 = new SendData<>(200, "김준일");
//        send(sendData1);
        SendData<?> sendData2 = new SendData<>(200, new Member("김준일", "01099881916"));
        send(sendData2);
        SendData<?> sendData3 = new SendData<>(200, new VipMember("김준이", "01011112222"));
        send(sendData3);
    }

    public static void send(SendData<?> sendData) {
        sendData.send();
    }

}
