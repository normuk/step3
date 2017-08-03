package com.norm.agilsphere.fizbuzz.rules;

public class NumberContainsRule implements NumberRule{

	private String contains;
	
	private String result;
	
	public NumberContainsRule(String contains, String result) {
		this.contains = contains;
		this.result = result;
	}
	
	@Override
	public String getResult(Integer number) {
		if(number.toString().indexOf(contains) > -1){
			return result;
		}
		return null;
	}

}
