package com.example.demo.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class Config {

    @Bean
    public Jaxb2Marshaller marshaller(){
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();

        marshaller.setContextPath("com.example.demo.schemas.crip");
        return marshaller;
    }

    @Bean
    public Client soapConnector(Jaxb2Marshaller marshaller){
        Client client = new Client();
        client.setDefaultUri("https://preprodservices.crif-online.ch/CrifSS/CrifSoapServiceV1");
        client.setMarshaller(marshaller);
        client.setUnmarshaller(marshaller);
        return client;
    }
}
