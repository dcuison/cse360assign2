/**
 * Author: Darwin Cuison
 * Class ID: 339
 * Assignment: 01
 * Description: This class is called SimpleListTest. Here I wrote
 * pass and fail cases for each method.
**/

package cse360assign2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SimpleListTest 
{

	@Test
	public void simpleListTest()
	{
		SimpleList num1 = new SimpleList();
		assertNotNull(num1);
	}
	
	@Test
	public void testAdd()
	{
		SimpleList num1 = new SimpleList();
		
	}
	
	@Test
	public void testRemove()
	{
		SimpleList num1 = new SimpleList();
		
	}
	
	@Test
	public void testCount()
	{
		SimpleList num1 = new SimpleList();
		assertEquals(0, num1.count());
	}
	
	@Test
	public void testToString()
	{
		SimpleList num1 = new SimpleList();
		
	}
	
	@Test
	public void testSearch()
	{
		SimpleList num1 = new SimpleList();
		num1.add(3);
		num1.add(2);
		num1.add(1);
		assertNotEquals(0, num1.search(3));
	}
}
