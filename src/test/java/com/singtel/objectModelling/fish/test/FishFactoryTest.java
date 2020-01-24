package com.singtel.objectModelling.fish.test;


import org.junit.jupiter.api.Test;

import com.singtel.objectModelling.animal.Animal;
import com.singtel.objectModelling.bird.*;
import com.singtel.objectModelling.fish.ClownFish;
import com.singtel.objectModelling.fish.FishFactory;
import com.singtel.objectModelling.fish.IFish;
import com.singtel.objectModelling.fish.Sharq;
import com.singtel.objectModelling.utils.FriendType;

import junit.framework.TestCase;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

class FishFactoryTest extends TestCase{

	private FishFactory classUnderTest;
	
	public FishFactoryTest() {
		classUnderTest = new FishFactory();
		// To do using some mocking framework can test for system.out.println as well		
	}
	
	public void setUp() {
		classUnderTest = new FishFactory();
	}
	
	public void tearDown() {
		classUnderTest = null;
	}
	
	@SuppressWarnings("static-access")
	@Test
	void whenIdisEqualToOne_FishFactoryReturns_InstanceOfSharq() {
		
		// Arrange
			int id = 1;
			
		// Action
			IFish fish = classUnderTest.getFish(id);
			Animal result = (Animal) fish;
			
			int swimCount = result.getCharacteristicsMap().get(result.swimKey);
			
			
		// Assert
			assertTrue(fish instanceof Sharq);
			assertEquals(swimCount, 1);

			assertFalse(result.getCharacteristicsMap().containsKey(result.walkKey));
			assertFalse(result.getCharacteristicsMap().containsKey(result.singKey));
			assertFalse(result.getCharacteristicsMap().containsKey(result.flyKey));
			
			result.clearCharacteristics();
		// To do with mocking framework can get the details of sing() as well
	}
	
	
	@SuppressWarnings("static-access")
	@Test
	void whenIdisEqualToOne_FishFactoryReturns_InstanceOfClownFish() {
		
		// Arrange
			int id = 2;
			
		// Action
			IFish fish = classUnderTest.getFish(id);
			Animal result = (Animal) fish;
			
			int swimCount = result.getCharacteristicsMap().get(result.swimKey);
			
			
		// Assert
			assertTrue(fish instanceof ClownFish);
			assertEquals(swimCount, 1);

			assertFalse(result.getCharacteristicsMap().containsKey(result.walkKey));
			assertFalse(result.getCharacteristicsMap().containsKey(result.singKey));
			assertFalse(result.getCharacteristicsMap().containsKey(result.flyKey));
			
			result.clearCharacteristics();
		// To do with mocking framework can get the details of sing() as well
	}
	
	@SuppressWarnings("static-access")
	@Test
	void whenIdisInvalid_BirdFactoryReturns_null() {
		
		// Arrange
			int id = 9;
			
		// Action
			IFish fish = classUnderTest.getFish(id);
			
		// Assert 
			assertNull(fish);
	}

}
