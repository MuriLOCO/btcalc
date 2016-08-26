package com.delphinus.btcalc.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.delphinus.btcalc.beans.BTCFixedValues;
import com.delphinus.btcalc.dao.BTCFixedValuesDAO;

@Service
public class BTCFixedValuesServiceBasic implements BTCFixedValuesService {

	final private BTCFixedValuesDAO btcFixedValuesDAO;	
	
	@Inject
	public BTCFixedValuesServiceBasic(BTCFixedValuesDAO btcFixedValuesDAO) {
		this.btcFixedValuesDAO = btcFixedValuesDAO;
	}
	
	@Override
	public BTCFixedValues getBtcFixedValues() {
		return btcFixedValuesDAO.getBTCFixedValues();
	}		
}
