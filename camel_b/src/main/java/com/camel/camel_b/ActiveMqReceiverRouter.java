package com.camel.camel_b;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.dataformat.JsonLibrary;
import org.springframework.stereotype.Component;

@Component
public class ActiveMqReceiverRouter extends RouteBuilder{

	@Override
	public void configure() throws Exception {
		// TODO Auto-generated method stub
		from("activemq:my-activemq-queue")
		.unmarshal().json(JsonLibrary.Jackson, CurrencyExchange.class)
		.to("log:received-message-from-active-mq");
	}

}
