package com.delphinus.btcalc.form;

import java.math.BigDecimal;

public class CalculatorForm {
	
	
	private BigDecimal hashRate;
	private BigDecimal powerConsumption;
	private BigDecimal powerCost;
	private BigDecimal poolFees;
	private BigDecimal btcDifficulty;
	private BigDecimal blockReward;
	private BigDecimal btcUsDollar;
	private BigDecimal hardwareCost;
	
	public BigDecimal getHashRate() {
		return hashRate;
	}
	public void setHashRate(BigDecimal hashRate) {
		this.hashRate = hashRate;
	}		
	public BigDecimal getPowerConsumption() {
		return powerConsumption;
	}
	public void setPowerConsumption(BigDecimal powerConsumption) {
		this.powerConsumption = powerConsumption;
	}
	public BigDecimal getPowerCost() {
		return powerCost;
	}
	public void setPowerCost(BigDecimal powerCost) {
		this.powerCost = powerCost;
	}
	public BigDecimal getPoolFees() {
		return poolFees;
	}
	public void setPoolFees(BigDecimal poolFees) {
		this.poolFees = poolFees;
	}
	public BigDecimal getBtcDifficulty() {
		return btcDifficulty;
	}
	public void setBtcDifficulty(BigDecimal btcDifficulty) {
		this.btcDifficulty = btcDifficulty;
	}
	public BigDecimal getBlockReward() {
		return blockReward;
	}
	public void setBlockReward(BigDecimal blockReward) {
		this.blockReward = blockReward;
	}
	public BigDecimal getBtcUsDollar() {
		return btcUsDollar;
	}
	public void setBtcUsDollar(BigDecimal btcUsDollar) {
		this.btcUsDollar = btcUsDollar;
	}
	public BigDecimal getHardwareCost() {
		return hardwareCost;
	}
	public void setHardwareCost(BigDecimal hardwareCost) {
		this.hardwareCost = hardwareCost;
	}
	
	
}
