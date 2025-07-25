package com.spec.impl;

import com.spec.Sim;

public class Jio implements Sim {

	@Override
	public void calling(int rxNumber) {
		System.out.println("Call connected from Jio " + rxNumber);
	}

	@Override
	public int callingAndSms(int rxNumber, String smsContent) {
		System.out.println("Call connected to number " +rxNumber+ " Content is "+smsContent);
		return 200;
	}

	@Override
	public void netWorkMode(String netMode) {
		System.out.println("Selected net work mode is "+netMode);
	}

}
