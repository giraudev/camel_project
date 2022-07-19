package com.camel.camel_a.routes.a;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class SimpleLoggingProcessor implements Processor {
	
	private Logger logger = LoggerFactory.getLogger(SimpleLoggingProcessingComponent.class);


	@Override
	public void process(Exchange exchange) throws Exception {
		
		// TODO Auto-generated method stub

	}

}
