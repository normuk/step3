package com.norm.agilsphere.fizbuzz;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;


public class ListGroupTest {
	
	private ListGroup group;

	@Before 
	public void setUp(){
		group = new ListGroup();
	}
	@Test
	public void testNumber() {
		Map<String, Long> result = group.groupList(Arrays.asList("1"));
		assertEquals(new Long(1), result.get("number"));
	}
	
	@Test
	public void testNonNumber() {
		Map<String, Long> result = group.groupList(Arrays.asList("fizz"));
		assertEquals(new Long(1), result.get("fizz"));
	}
	
	@Test
	public void testMultipleNonNumbers() {
		Map<String, Long> result = group.groupList(Arrays.asList("fizz", "fizz", "buzz", "fizzbuzz"));
		assertEquals( new Long(2), result.get("fizz"));
		assertEquals( new Long(1), result.get("buzz"));
		assertEquals( new Long(1), result.get("fizzbuzz"));
	}
	@Test
	public void testMultipleNumbers() {
		Map<String, Long> result = group.groupList(Arrays.asList("1","2","3","4","5"));
		assertEquals( new Long(5), result.get("number"));
	}
	

}
