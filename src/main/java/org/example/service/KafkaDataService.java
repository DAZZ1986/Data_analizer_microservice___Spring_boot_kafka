package org.example.service;

import org.example.model.Data;

public interface KafkaDataService {
    //Это сервис который будет обрабатывать как-то прочитанные данные, а мы будем просто выводить их на экран

    void handle(Data data);
}
