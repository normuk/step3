package com.norm.agilsphere.fizbuzz.rules;

import java.util.List;

public class NumberRuleChain {
	private String chainResult;

	public NumberRuleChain(List<NumberRule> divisors, Integer i) {
		String result;
		chainResult = i.toString();
		for(NumberRule divisor : divisors){
		   result = divisor.getResult(i);
		   if(result != null){
			   chainResult= result;
			   break;
		   }
		}
	}

	@Override
	public String toString() {
		return chainResult;
	}
}