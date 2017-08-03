package com.norm.agilsphere.fizbuzz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import com.norm.agilsphere.fizbuzz.rules.NumberRuleChain;

import com.norm.agilsphere.fizbuzz.rules.Divisor;
import com.norm.agilsphere.fizbuzz.rules.NumberContainsRule;
import com.norm.agilsphere.fizbuzz.rules.NumberRule;

public class NumberRangeProcessorImpl implements NumberRangeProcessor {

	private static List<NumberRule> rules;

	@Override
	public List<String> processRange(Integer end) {
		return IntStream.rangeClosed(1, end).boxed().map(i -> new NumberRuleChain(rules,i).toString())
				.collect(Collectors.toList());

	}
	
	static{
		rules = new ArrayList<>();
		rules.add(new NumberContainsRule("3", "lucky"));
		rules.add(new Divisor(Arrays.asList(3,5), "fizzbuzz"));
		rules.add(new Divisor(Arrays.asList(3), "fizz"));
		rules.add(new Divisor(Arrays.asList(5), "buzz"));
	}
}
