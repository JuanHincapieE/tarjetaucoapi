package com.tarjetaucoapi.tarjetaucoapi.util;

public interface IMessageSender<T> {

    void execute(T message);

}
