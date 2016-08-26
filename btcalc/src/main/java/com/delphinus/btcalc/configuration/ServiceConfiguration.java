package com.delphinus.btcalc.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;

import com.delphinus.btcalc.dao.BTCFixedValuesDAO;
import com.delphinus.btcalc.service.BTCFixedValuesService;
import com.delphinus.btcalc.service.BTCFixedValuesServiceBasic;
import com.delphinus.btcalc.service.CalculatorService;
import com.delphinus.btcalc.service.CalculatorServiceBasic;

@Configurable
public class ServiceConfiguration {

	@Autowired
	private BTCFixedValuesDAO btcFixedValuesDAO;
	
	@Bean
	public BTCFixedValuesService btcFixedValuesService(){
		return new BTCFixedValuesServiceBasic(this.btcFixedValuesDAO);
	}
	
	@Bean
	public CalculatorService calculatorService(){
		return new CalculatorServiceBasic();
	}
	
}
