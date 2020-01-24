package com.singtel.objectModelling.bird.test;


import org.junit.jupiter.api.Test;

import com.singtel.objectModelling.animal.Animal;
import com.singtel.objectModelling.bird.*;
import com.singtel.objectModelling.utils.FriendType;

import junit.framework.TestCase;

import org.junit.*;
import static org.junit.Assert.*;

class BirdFactoryTest extends TestCase {

	private BirdFactory classUnderTest;
	
	public BirdFactoryTest() {
		classUnderTest = new BirdFactory();
		// To do using some mocking framework can test for system.out.println as well		
	}
	
	public void setUp() {
		classUnderTest = new BirdFactory();
	}
	
	public void tearDown() {
		classUnderTest = null;
	}
	
	@SuppressWarnings("static-access")
	@Test
	void whenIdisEqualToOne_BirdFactoryReturns_InstanceOfChicken() {
		
		// Arrange
			int id = 1;
			
		// Action
			IBird bird = classUnderTest.getBird(id);
			Animal result = (Animal) bird;
			
			int walkCount = result.getCharacteristicsMap().get(result.walkKey);
			int singCount = result.getCharacteristicsMap().get(result.singKey);
			
		// Assert
			assertTrue(bird instanceof Chiken);
			assertEquals(walkCount, 1);
			assertEquals(singCount, 1);
			assertFalse(result.getCharacteristicsMap().containsKey(result.swimKey));
			assertFalse(result.getCharacteristicsMap().containsKey(result.flyKey));
			
			result.clearCharacteristics();
		// To do with mocking framework can get the details of sing() as well
	}
	
	
	@SuppressWarnings("static-access")
	@Test
	void whenIdisEqualToOne_BirdFactoryReturns_InstanceOfParrotWithFriendTypeDog() {
		
		// Arrange
			int id = 3;
			
		// Action
			IBird bird = classUnderTest.getBird(id);
			Animal result = (Animal) bird;
			Parrot parrot = (Parrot) bird;
			
			
			int walkCount = result.getCharacteristicsMap().get(result.walkKey);
			int singCount = result.getCharacteristicsMap().get(result.singKey);
			int flyCount = result.getCharacteristicsMap().get(result.flyKey);
			
			
		// Assert
			assertTrue(bird instanceof Parrot);
			assertEquals(parrot.getFriendType(), FriendType.Dog);
			assertEquals(walkCount, 1);
			assertEquals(singCount, 1);
			assertEquals(flyCount, 1);
			assertFalse(result.getCharacteristicsMap().containsKey(result.swimKey));
			
			result.clearCharacteristics();
		// To do with mocking framework can get the details of sing() as well
	}
	
	@SuppressWarnings("static-access")
	@Test
	void whenIdisInvalid_BirdFactoryReturns_null() {
		
		// Arrange
			int id = 9;
			
		// Action
			IBird bird = classUnderTest.getBird(id);
			
		// Assert 
			assertNull(bird);
	}

}
