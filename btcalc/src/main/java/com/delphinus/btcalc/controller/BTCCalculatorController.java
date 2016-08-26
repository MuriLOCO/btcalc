package com.delphinus.btcalc.controller;

import java.math.BigDecimal;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.delphinus.btcalc.beans.BTCFixedValues;
import com.delphinus.btcalc.form.CalculatorForm;
import com.delphinus.btcalc.service.BTCFixedValuesService;
import com.delphinus.btcalc.service.CalculatorService;

@Controller
public class BTCCalculatorController {

	final private BTCFixedValuesService btcFixedValuesService;
	final private CalculatorService calculatorService;
	
	@Inject
	public BTCCalculatorController(BTCFixedValuesService btcFixedValuesService, CalculatorService calculatorService) {
		this.btcFixedValuesService = btcFixedValuesService;
		this.calculatorService = calculatorService;
	}
	
	@RequestMapping(value = "calculator", method = RequestMethod.GET)
	public ModelAndView getCalculatorPage(){
		final ModelAndView mav = new ModelAndView();
		final CalculatorForm calculatorForm = new CalculatorForm();
		final BTCFixedValues btcFixedValues = btcFixedValuesService.getBtcFixedValues();
		calculatorForm.setBlockReward(new BigDecimal(btcFixedValues.getBlockReward()));
		calculatorForm.setBtcUsDollar(new BigDecimal(btcFixedValues.getBtcUsDollar()));
		calculatorForm.setBtcDifficulty(new BigDecimal(btcFixedValues.getBtcDifficulty()));
	
		mav.setViewName("calculator");
		mav.addObject("calculatorForm", calculatorForm);
		
		
		return mav;
	}
	
	@RequestMapping(value = "calculate", method = RequestMethod.POST)
	public ModelAndView calculate(ModelAndView mav, CalculatorForm calculatorForm){
		
		final BTCFixedValues btcFixedValues = btcFixedValuesService.getBtcFixedValues();
		
		final String hashTime = calculatorService.calculateHashTime(calculatorForm.getBtcDifficulty(), calculatorForm.getHashRate()); 		
		final String energyCostPerYear = calculatorService.calculateEnergyCostPerYear(calculatorForm.getPowerCost(), calculatorForm.getPowerConsumption());
		final String blocksPerYear = calculatorService.calculateBlocksPerYear(new BigDecimal(hashTime));
		final String coinsPerYear = calculatorService.calculateCoinsPerYear(new BigDecimal(btcFixedValues.getBlockReward()), new BigDecimal(blocksPerYear));
		final String revenuePerYear = calculatorService.calculateRevenuePerYear(new BigDecimal(coinsPerYear), new BigDecimal(btcFixedValues.getBtcUsDollar()));
		final String profitPerYear = calculatorService.calculateProfitPerYear(new BigDecimal(revenuePerYear), new BigDecimal(energyCostPerYear));
		final String netProfit = calculatorService.calculateNetProfit(new BigDecimal(revenuePerYear), calculatorForm.getHardwareCost(), new BigDecimal(energyCostPerYear));
		
		mav.setViewName("calculator");
		mav.addObject("hashTime", hashTime);
		mav.addObject("energyCostPerYear", energyCostPerYear);
		mav.addObject("blocksPerYear", blocksPerYear);
		mav.addObject("coinsPerYear", coinsPerYear);
		mav.addObject("revenuePerYear", revenuePerYear);
		mav.addObject("profitPerYear", profitPerYear);
		mav.addObject("netProfit", netProfit);
		
		return mav;
	}
}
