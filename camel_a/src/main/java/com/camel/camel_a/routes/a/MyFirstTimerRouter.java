package com.camel.camel_a.routes.a;

import java.time.LocalDate;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class MyFirstTimerRouter  extends RouteBuilder{

	@Override
	public void configure() throws Exception {
		
		from("timer:first-timer")
		.transform().constant("Time now is:" + LocalDate.now())
		.to("log:first-timer");
		
// using timer with body		
//		from("timer:first-timer")
//		.transform().constant("My router constant message")
//		.to("log:first-timer");

// using timer without body
//		from("timer:first-timer")
//		.to("log:first-timer");
		
	
	}

}
