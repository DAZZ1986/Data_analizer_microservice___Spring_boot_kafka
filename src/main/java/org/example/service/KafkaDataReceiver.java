package org.example.service;

public interface KafkaDataReceiver {
    //Это будет сервис который будет читать сообщение из кафки и отправлять их

    void fetch();

}
