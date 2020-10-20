package tn.esprit.esponline;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class Calcul1Test {
	Calcul calcul = new Calcul();

	@Test
	public void testCalculerSom() {
		assertEquals(25, calcul.calculerSom(10, 15));
	}

	@Test
	public void testCalculerDiff() {
		assertEquals(30, calcul.calculerDiff(40, 10));
	}

	
}
