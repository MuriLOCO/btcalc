package com.delphinus.btcalc.beans;

import java.io.Serializable;
import java.sql.Timestamp;

public class BTCFixedValues implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private long id;
	private String btcDifficulty;
	private String blockReward;
	private String btcUsDollar;
	private Timestamp lastUpdate;
	
	public String getBtcDifficulty() {
		return btcDifficulty;
	}
	public void setBtcDifficulty(String btcDifficulty) {
		this.btcDifficulty = btcDifficulty;
	}
	public String getBlockReward() {
		return blockReward;
	}
	public void setBlockReward(String blockReward) {
		this.blockReward = blockReward;
	}
	public String getBtcUsDollar() {
		return btcUsDollar;
	}
	public void setBtcUsDollar(String btcUsDollar) {
		this.btcUsDollar = btcUsDollar;
	}
	public Timestamp getLastUpdate() {
		return lastUpdate;
	}
	public void setLastUpdate(Timestamp lastUpdate) {
		this.lastUpdate = lastUpdate;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}	

}
