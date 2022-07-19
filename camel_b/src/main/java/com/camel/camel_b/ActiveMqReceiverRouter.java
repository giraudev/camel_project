package com.camel.camel_b;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.dataformat.JsonLibrary;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ActiveMqReceiverRouter extends RouteBuilder{
	

	@Autowired
	MyCurrencyExchangeProcessor myCurrencyExchangeProcessor;
	
	@Autowired
	MyCurrencyExchangeTransformer myCurrencyExchangeTransformer;


	@Override
	public void configure() throws Exception {
		// TODO Auto-generated method stub
//		from("activemq:my-activemq-queue")
//		.unmarshal().json(JsonLibrary.Jackson, CurrencyExchange.class)
//		.bean(myCurrencyExchangeProcessor)
//		.bean(myCurrencyExchangeTransformer)
//		.to("log:received-message-from-active-mq");
		
		from("activemq:my-activemq-xml-queue")
		.unmarshal()
		.jacksonXml(CurrencyExchange.class)
		.bean(myCurrencyExchangeProcessor)
		.bean(myCurrencyExchangeTransformer)
		.to("log:received-message-from-active-mq");
	}

}
