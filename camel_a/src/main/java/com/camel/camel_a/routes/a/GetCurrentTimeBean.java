package com.camel.camel_a.routes.a;

import java.time.LocalDate;

import org.springframework.stereotype.Component;

@Component
public class GetCurrentTimeBean {
	
	// Crianfo um bean para router
	public String getCurrentTime() {
		return "Time now is"+ LocalDate.now();
	}

}
