package com.camel.camel_a.routes.a;

import java.time.LocalDate;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyFirstTimerRouter  extends RouteBuilder{
	
	@Autowired
	private GetCurrentTimeBean getCurrentTimeBean;
	
	@Autowired
	private SimpleLoggingProcessingComponent loggerComponent; 

	@Override
	public void configure() throws Exception {
		
		//ideal usar o nome do bean, caso exista mais de 1 na clasee
		
		from("timer:first-timer")
		.log("${body}")
		.bean(getCurrentTimeBean, "getCurrentTime")
		.log("${body}")
		.bean(loggerComponent)
		.to("log:first-timer");
		
		// using localDate		
//		from("timer:first-timer")
//		.transform().constant("Time now is:" + LocalDate.now())
//		.to("log:first-timer");
		
		// using timer with body		
//		from("timer:first-timer")
//		.transform().constant("My router constant message")
//		.to("log:first-timer");

		// using timer without body
//		from("timer:first-timer")
//		.to("log:first-timer");
		
	
	}

}
