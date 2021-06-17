package beugro_gyak;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AlmaTest {

	@Test
	void testBuy() {
		Alma a = new Alma();
		assertNotNull(a.Buy(0));
	}
}
