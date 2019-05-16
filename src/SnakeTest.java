
//Pardeep kaur
// c0737369

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SnakeTest {

	private Snake peter;
	private Snake takis;

	@Before
	public void setUp() throws Exception {
		peter = new Snake("Peter S", 10, "coffee");
		takis = new Snake("Takis Z", 80, "vegetables");
	
	
	}

	@Test
	public void testishealthy() 
	
	{	
	String favouriteFood = vegetables;
	assertsEquals(favouriteFood,vegetables);
	}
		
public void testisunhealthy() 
	
	{	
	String coffee;
	String vegetables;
	String favouriteFood = coffee ;
	assertsEquals(favouriteFood,vegetables);
	//if(favouriteFood == copffee)
	//{
		//System.out.println("snke is unhealthy")
	assertsEquals(String favouriteFood, coffee);
	}
	

 
	public void testfitsInCage()
	{
	int snakelenghth = 10;
	int cagelength = 10;
	assertsEquals(snakeLength,cageLength);
	
		
	}
}
