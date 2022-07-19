package com.camel.camel_b;

import java.math.BigDecimal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class MyCurrencyExchangeProcessor {
	
	Logger logger = LoggerFactory.getLogger(MyCurrencyExchangeProcessor.class);

	
	public void processMessage(CurrencyExchange currencyExchange) {
		
		logger.info("Do some processing with currencyExchange.getConversionMultiple() {}", currencyExchange);
		currencyExchange.getConversionMultiple();
	}

}

@Component
class MyCurrencyExchangeTransformer {
	
	Logger logger = LoggerFactory.getLogger(MyCurrencyExchangeTransformer.class);

	
	public void processMessage(CurrencyExchange currencyExchange) {
		
		currencyExchange.setConversionMultiple(
				currencyExchange.getConversionMultiple().multiply(BigDecimal.TEN));
				
				logger.info("Do some processing with currencyExchange.getConversionMultiple() {}", currencyExchange);
	}

}