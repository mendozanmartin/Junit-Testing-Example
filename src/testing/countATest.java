package testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class countATest {

	@Test
	public void testAlphabet() {
		JunitTesting testing = new JunitTesting();
		int output = testing.countA("alphabet");
		assertEquals(2, output);
	}
	@Test
	public void testMartin() {
		JunitTesting testing = new JunitTesting();
		int output = testing.countA("martin");
		assertEquals(1, output);
	}

}
