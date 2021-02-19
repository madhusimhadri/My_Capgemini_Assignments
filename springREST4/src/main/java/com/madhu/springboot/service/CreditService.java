package com.madhu.springboot.service;

import org.springframework.stereotype.Service;

import com.madhu.springboot.model.CreditCard;

@Service
public class CreditService 
{

	private CreditCard card1=new CreditCard();
	
	public CreditCard validate(String number) {
		//parse the individual string values to int 
		if(number.length() == 15) {
			//for JCB card
			//There are  validations that can be applied for JCB card
			//apply validations and return results
		 
			card1.setType("JCB");
			card1.setValid(true);
			
		}
		else if(number.length() <=19 && number.length()>=16) {
			//for Master and Visa
			if(number.length()==16) {
				//for visa
				card1.setType("Visa");
				card1.setValid(true);
			}
			card1.setType("MasterCard");
			card1.setValid(true);
		}
		return card1;
		}
		public String check() {
			return "Working Fine";//card2.toString();
		}
		
			
	
}
