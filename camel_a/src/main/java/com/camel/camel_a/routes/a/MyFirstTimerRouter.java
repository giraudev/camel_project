package com.camel.camel_a.routes.a;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class MyFirstTimerRouter  extends RouteBuilder{

	@Override
	public void configure() throws Exception {
		// TODO Auto-generated method stub
		// using timer
		from("timer:first-timer")
		.to("log:first-timer");
		
		
		
	}

}
