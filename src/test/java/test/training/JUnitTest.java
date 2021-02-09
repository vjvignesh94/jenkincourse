package test.training;

import org.junit.Assert;
import org.junit.Test;

import com.training.jenkin.JenkinTraining;

public class JUnitTest {
	
	@Test
	public void testMultiplication()
	{
		int result = JenkinTraining.multiplyNumber(1, 2);
		Assert.assertEquals(result, 2);
		result = JenkinTraining.multiplyNumber(1, 2, 2);
		Assert.assertEquals(result, 4);
	}
	
	@Test
	public void testAddition()
	{
		int result = JenkinTraining.addNumber(1, 2);
		Assert.assertEquals(result, 3);
		result = JenkinTraining.addNumber(1, 2, 2);
		Assert.assertEquals(result, 5);
	}

}
