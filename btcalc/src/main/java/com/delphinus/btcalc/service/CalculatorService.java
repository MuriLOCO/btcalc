package com.delphinus.btcalc.service;

import java.math.BigDecimal;

public interface CalculatorService {

	String calculateHashTime(BigDecimal btcDifficulty, BigDecimal hashRate);
	String calculateEnergyCostPerYear(BigDecimal powerCost, BigDecimal powerConsumption);
	String calculateBlocksPerYear(BigDecimal hashTime);
	String calculateCoinsPerYear(BigDecimal blockReward, BigDecimal blocksPerYear);
	String calculateRevenuePerYear(BigDecimal coinsPerYear, BigDecimal btcUsDollar);
	String calculateProfitPerYear(BigDecimal revenuePerYear, BigDecimal energyCostPerYear);
	String calculateNetProfit(BigDecimal revenuePerYear, BigDecimal hardwareCost, BigDecimal energyCostPerYear);
}
