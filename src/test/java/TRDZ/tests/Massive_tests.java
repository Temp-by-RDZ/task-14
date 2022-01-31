package TRDZ.tests;

import TRDZ.tasks.Initialization;
import org.junit.Assert;
import org.junit.Test;

public class Massive_tests {

	@Test
	public void delay_4_test1(){
		int[] actual = Initialization.delay_4 (new int[] { 1, 2, 4, 3, 4, 1, 7 });
		int[] expected = {1,7};
		Assert.assertArrayEquals(expected, actual);
		}

	@Test(expected = RuntimeException.class)
	public void delay_4_test2(){
		Initialization.delay_4(new int[] { 1, 2 });
		}

	@Test
	public void delay_4_test3(){
		int[] actual = Initialization.delay_4(new int[] { 4 });
		int[] expected = { };
		Assert.assertArrayEquals(expected, actual);
		}

	@Test(expected = RuntimeException.class)
	public void delay_4_test4(){
		Initialization.delay_4(new int[] { });
		}

	@Test
	public void check_test1() {
		boolean actual = Initialization.check(new int[] { 1,1,1,4,4,1,4,4 });
		Assert.assertTrue(actual);
		}

	@Test
	public void check_test2() {
		boolean actual = Initialization.check(new int[] { 1,1 });
		Assert.assertFalse(actual);
		}

	@Test
	public void check_test3() {
		boolean actual = Initialization.check(new int[] { 2,3,5 });
		Assert.assertFalse(actual);
		}

	@Test
	public void check_test4() {
		boolean actual = Initialization.check(new int[] {  });
		Assert.assertFalse(actual);
		}

	}
