package epam.assignment.TDD_Junit;
/*
* To Do List
*.A is present only at index 0. ABCD => BCD success
*.A is present only at index 0. BACD => BCD success
*.A is present at index 0 & 1.  AACD => CD success
* A is not present at any index. BCDE => BCDE success
*.A is not present at index 0  or 1 but present at other index. BCADA => BCADA success
*.A is present at index 0 & 1 as well as at other indices. AABAA => BAA success
*.Only 1 character string is A. A => null success
*.Null string.
*/


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RemoveFirst2ATest {
	RemoveFirst2A removeA=new RemoveFirst2A();

	@Test
	void testRemoveAt0() {
		assertEquals("BCD", removeA.remove("ABCD"));
		}
	
	@Test
	void testRemoveAt1()
	{
		assertEquals("BCD", removeA.remove("BACD"));

	}
	
	@Test
	void testRemoveAt1and0()
	{
		assertEquals("CD", removeA.remove("AACD"));

	}
	
	@Test
	void testNoA()
	{
		assertEquals("BCCD", removeA.remove("BCCD"));

	}
	
	@Test
	void testANotAt1and0()
	{
		assertEquals("BCADA", removeA.remove("BCADA"));

	}
	
	@Test
	void testRemoveAllIndex()
	{
		assertEquals("BAA", removeA.remove("AABAA"));

	}
	
	@Test
	void testStringSize1()
	{
		assertEquals("",removeA.remove("A"));
	}
	
	@Test
	void testNullString()
	{
		assertEquals("", removeA.remove(""));
	}


}
/*
*
*
*/
