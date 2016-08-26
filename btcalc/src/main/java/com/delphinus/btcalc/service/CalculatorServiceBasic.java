package com.delphinus.btcalc.service;

import java.math.BigDecimal;
import java.math.RoundingMode;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceBasic implements CalculatorService {

	@Override
	public String calculateHashTime(BigDecimal btcDifficulty, BigDecimal hashRate) {
		return btcDifficulty.multiply(new BigDecimal(java.lang.Math.pow(2.0, 32))).divide(hashRate.multiply(new BigDecimal(1000000000.0)), 10, RoundingMode.HALF_UP).toPlainString();
	}

	@Override
	public String calculateEnergyCostPerYear(BigDecimal powerCost, BigDecimal powerConsumption) {
		return new BigDecimal(365.25).multiply(new BigDecimal(24.0)).multiply(powerConsumption).divide(new BigDecimal(1000.0), 10, RoundingMode.HALF_UP).multiply(powerCost).toPlainString();
	}

	@Override
	public String calculateBlocksPerYear(BigDecimal hashTime) {
		return new BigDecimal(365.25).multiply(new BigDecimal(24.0)).multiply(new BigDecimal(3600.0)).divide(hashTime, 10, RoundingMode.HALF_UP).toPlainString();
	}

	@Override
	public String calculateCoinsPerYear(BigDecimal blockReward, BigDecimal blocksPerYear) {
		return blockReward.multiply(blocksPerYear).toPlainString();
	}

	@Override
	public String calculateRevenuePerYear(BigDecimal coinsPerYear, BigDecimal btcUsDollar) {
		return coinsPerYear.multiply(btcUsDollar).toPlainString();
	}

	@Override
	public String calculateProfitPerYear(BigDecimal revenuePerYear, BigDecimal energyCostPerYear) {
		return revenuePerYear.subtract(energyCostPerYear).toPlainString();
	}

	@Override
	public String calculateNetProfit(BigDecimal revenuePerYear, BigDecimal hardwareCost, BigDecimal energyCostPerYear) {
		return revenuePerYear.subtract(hardwareCost).subtract(energyCostPerYear).toPlainString();
	}


}
