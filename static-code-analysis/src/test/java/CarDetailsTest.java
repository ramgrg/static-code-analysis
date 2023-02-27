import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CarDetailsTest {
	
	@Test
	public void testTaxable() {
		Car corollaCar = new Car("Toyota corolla", "AJY123D03", 2009, 16, 21500);
		double taxableAmount = CarDetails.taxableAmount(corollaCar.getPrice());
		Assertions.assertEquals(430, taxableAmount);
	}

}
