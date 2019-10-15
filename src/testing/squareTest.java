package testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class squareTest {

	@Test
	public void test() {
		JunitTesting testing = new JunitTesting();
		int output = testing.square(5);
		assertEquals(25, output);
	}

}
