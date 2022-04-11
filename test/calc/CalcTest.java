/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calc;

import org.junit.Assert;
import org.junit.Test;

public class CalcTest {

	@Test
	public void add3and7() {
		int result = Calc.add(3, 7);
		Assert.assertEquals(result, 10);
	}
	
	@Test
	public void factorialOf5() {
	    int result = Calc.factorial(5);
	    Assert.assertEquals(result, 120);
	}
   
	
}