package vicQuiz3;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class VicQuizTest3 {


	@Test
	public void testA() {
		double testside1 = 8.5;
		double testside2 = 10;
		double testside3 = 9.5;
		Triangle testArea = new Triangle(testside1,testside2,testside3);
		double answer = 37.229;
		
		assertEquals(answer,testArea.getArea(),0.01);
		
	}
	@Test
	public void testP()
	{
		double testside1 = 5.0;
		double testside2 = 5.0;
		double testside3 = 12.0;
		Triangle testPerimeter = new Triangle(testside1,testside2,testside3);
		double perimeter = 22.0;
		assertEquals(perimeter,testPerimeter.getPerimeter(),0.01);
	}

}
