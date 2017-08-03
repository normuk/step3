package com.norm.agilsphere.fizbuzz;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListGroup {

	public Map<String, Long> groupList(List<String> input) {
		return input.stream().collect(Collectors
				.groupingBy(x -> isNumeric(x) ? "number" : x, Collectors.counting()));
	}

	private static boolean isNumeric(String str) {
		try {
			Double.parseDouble(str);
		}
		catch (NumberFormatException nfe) {
			return false;
		}
		return true;
	}
}

