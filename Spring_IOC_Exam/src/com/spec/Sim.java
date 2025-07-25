package com.spec;

public interface Sim {

	void calling(int rxNumber);
	int callingAndSms(int rxNumber, String smsContent);
	void netWorkMode(String netMode);
	
}
