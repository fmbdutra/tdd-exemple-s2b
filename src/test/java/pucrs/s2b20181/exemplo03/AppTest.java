/*
 * Fabiano Dutra
 * S2B 2018/1
 * TDD exemple - Test Driven Development
 * Exam scores system
 */

package pucrs.s2b20181.exemplo03;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AppTest {

	@Test
	public void testFiveAndFiveGivesExam(){
		String expected = "In Exam";
		String actual = Grade.calc(5.0, 5.0);
		assertEquals(expected, actual);		
	}
	
	@Test
	public void testSevenAndSevenGivesAproved(){
		String expected = "Approved";
		String actual = Grade.calc(7.0, 7.0);
		assertEquals(expected, actual);		
	}
	
	@Test
	public void testThreeAndThreeGivesReproved() {
		String expected = "Reproved";
		String actual = Grade.calc(3.0, 3.0);
		assertEquals(expected, actual);		
	}
	
	@Test
	public void testThree99AndThree99GivesReproved() {
		String expected = "Reproved";
		String actual = Grade.calc(3.999, 3.999);
		assertEquals(expected, actual);		
	}
	
	@Test
	public void testThree9999AndThree0001GivesApproved() {
		String expected = "In Exam";
		String actual = Grade.calc(3.9999, 4.0001);
		assertEquals(expected, actual);		
	}


}
