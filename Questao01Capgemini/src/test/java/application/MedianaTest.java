package application;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

public class MedianaTest {

	@Test
	public void testMediana() {
		List<Integer> list = Arrays.asList(9, 2, 1, 4, 6);
		Collections.sort(list);
			
		int	mediana = list.get(list.size() / 2);
		assertEquals(4 , mediana);
	}

}
