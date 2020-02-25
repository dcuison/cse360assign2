/**
 * Author: Darwin Cuison
 * Class ID: 339
 * Assignment: 01
 * Description: This class is called SimpleList. The class contain
 * the following methods: SimpleList, add, remove, count, toString, 
 * and search. 
**/

package Assign1;
import java.util.Arrays;

public class SimpleList 
{
	private int[] list;
	private int count;
	
	public SimpleList()
	{
		list = new int[10];
		count = 0;
	}
	
	/**
	 * What is happening is if the length of the list
	 * is greater than zero then it will go to the for-loop. 
	 * Then, if the list is full, then the second to last element
	 * now becomes the last element while the previous last element
	 * no longer exists. After the if statement, the parameter is then
	 * placed at the beginning of the list. 
	 */
	public void add(int a1)
	{
		int num1 = list.length;
		
		if(num1 > 0)
		{
			for(int x1 = num1 - 1; x1 > 0; x1--)
			{
				if(num1 == 10)
				{
					list[x1] = list[x1 - 1];
				}
				else
				{
					list[x1 + 1] = list[x1];
				}
			}
		}
		list[0] = a1;
		
		if(count < 10)
		{
			count++;
		}
	}
	
	
	/**
	 * First, the parameter is searched. If the parameter 
	 * doesn't equal -1, then it execute the for-loop which
	 * the other items in the list are moved down.
	 */
	public void remove(int a1)
	{
		int num1 = search(a1);
		
		if(num1 != -1)
		{
			for(int x1 = num1; x1 < count - 1; x1++)
			{
				list[x1] = list[x1 + 1];
			}
			
			count--;
		}
	}
	
	public int count()
	{
		return count;
	}
	
	public String toString()
	{
		return Arrays.toString(list);
	}
	
	
	/**
	 * The constructor below is search. Inside the method 
	 * i made 2 new integers num1 being the length of list
	 * and num2. Inside the for-loop, if the position of x1
	 * on the list is equal to a1, then i set num2 to x1. 
	 */
	public int search(int a1)
	{
		int num1 = list.length;
		int num2 = -1;
		
		for(int x1 = 0; x1 < num1; x1++)
		{
			if(list[x1] == a1)
			{
				num2 = x1;
			}
		}
		return num2;
	}
}
