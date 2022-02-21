package task2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TransformerTest {

	private Transformer transformer;
	
	@BeforeEach
	void setUp() {
		transformer = new Transformer();
	}
	
	@Test
	void givenNumber_whenIncrementEachDigit_thenIncrementEachDigit() {
		String expected = "10109";
		
		String actual = transformer.incrementEachDigit(998);
		
		assertEquals(expected, actual);
	}

}
