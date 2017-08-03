package com.norm.agilsphere.fizbuzz.rules;

import java.util.List;

public class Divisor implements NumberRule{
	private List<Integer> divisors;
	private String result;
	
	public Divisor(List<Integer> divisors, String result){
	   this.divisors = divisors;
	   this.result = result;
	}
	
	public String getResult(Integer number){
		for(Integer divisor : divisors){
			if(number % divisor != 0){
				return null;
			}
		}
		return result;
	}
	
}