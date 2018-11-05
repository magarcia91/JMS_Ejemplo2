package com.distribuida.jms;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class ArtemisReceptor {

	@JmsListener(destination = "operacion", containerFactory = "myFactory")
    public void receiveMessage(ArtemisMensaje msg) {
        System.out.println("Received <" + msg + ">");
    }
}
