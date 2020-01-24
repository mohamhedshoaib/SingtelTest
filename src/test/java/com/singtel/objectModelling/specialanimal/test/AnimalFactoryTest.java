package com.singtel.objectModelling.specialanimal.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.singtel.objectModelling.animal.Animal;
import com.singtel.objectModelling.animal.AnimalFactory;
import com.singtel.objectModelling.animal.Cat;
import com.singtel.objectModelling.animal.Dog;
import com.singtel.objectModelling.animal.IAnimal;
import com.singtel.objectModelling.bird.BirdFactory;
import com.singtel.objectModelling.bird.Chiken;
import com.singtel.objectModelling.bird.IBird;
import com.singtel.objectModelling.bird.Parrot;
import com.singtel.objectModelling.utils.FriendType;

import junit.framework.Assert;

class AnimalFactoryTest {

	private AnimalFactory classUnderTest;
	
	public AnimalFactoryTest() {
		classUnderTest = new AnimalFactory();
		// To do using some mocking framework can test for system.out.println as well		
	}
	
	public void setUp() {
		classUnderTest = new AnimalFactory();
	}
	
	public void tearDown() {
		classUnderTest = null;
	}
	
	@SuppressWarnings("static-access")
	@Test
	void whenIdisEqualToOne_AnimalFactoryReturns_InstanceOfDog() {
		
		// Arrange
			int id = 1;
			
		// Action
			IAnimal animal = classUnderTest.getAnimal(id);
			Animal result = (Animal) animal;
			
			int walkCount = result.getCharacteristicsMap().get(result.walkKey);
			int swimCount = result.getCharacteristicsMap().get(result.swimKey);
			
		// Assert
			assertTrue(animal instanceof Dog);
			assertEquals(walkCount, 1);
			assertEquals(swimCount, 1);
			assertFalse(result.getCharacteristicsMap().containsKey(result.singKey));
			assertFalse(result.getCharacteristicsMap().containsKey(result.flyKey));
			
			result.clearCharacteristics();
		// To do with mocking framework can get the details of sing() as well
	}
	
	
	@SuppressWarnings("static-access")
	@Test
	void whenIdisEqualToTwo_AnimalFactoryReturns_InstanceOfCat() {
		
		// Arrange
			int id = 2;
			
		// Action
			IAnimal animal = classUnderTest.getAnimal(id);
			Animal result = (Animal) animal;
			
			int walkCount = result.getCharacteristicsMap().get(result.walkKey);
			int swimCount = result.getCharacteristicsMap().get(result.swimKey);
			
		// Assert
			assertTrue(animal instanceof Cat);
			assertEquals(walkCount, 1);
			assertEquals(swimCount, 1);
			assertFalse(result.getCharacteristicsMap().containsKey(result.singKey));
			assertFalse(result.getCharacteristicsMap().containsKey(result.flyKey));
			
			result.clearCharacteristics();
		// To do with mocking framework can get the details of sing() as well
	}
	
	@SuppressWarnings("static-access")
	@Test
	void whenIdisInvalid_AnimalFactoryReturns_null() {
		
		// Arrange
			int id = 3;
			
		// Action
			IAnimal animal = classUnderTest.getAnimal(id);
			
		// Assert 
			assertNull(animal);
	}
}
