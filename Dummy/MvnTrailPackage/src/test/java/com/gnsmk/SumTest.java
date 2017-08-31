package com.gnsmk;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SumTest {

	@Test
	public void addTest() { //action
		int x = 5, y = 6;
		Sum s = new Sum(); //assign
		assertEquals("Sum Class", x + y, s.add(x, y)); //assert
	}
}