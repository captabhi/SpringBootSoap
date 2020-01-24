package com.example.demo.demo;

import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

public class BaseClient extends WebServiceGatewaySupport {

	public Object callWebService(Object request) {
		return getWebServiceTemplate().marshalSendAndReceive("https://preprodservices.crif-online.ch/CrifSS/CrifSoapServiceV1",request);
	}

}
