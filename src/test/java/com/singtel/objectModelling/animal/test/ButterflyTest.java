package com.singtel.objectModelling.animal.test;


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
import com.singtel.objectModelling.specialAnimals.Butterfly;
import com.singtel.objectModelling.utils.FriendType;

import junit.framework.TestCase;



class ButterflyTest extends TestCase {

	private Butterfly classUnderTest;
	
	@SuppressWarnings("static-access")
	@Test
	void whenIsEvolvedIsTrue_ButterFlyReturns_Butterfly() {
		
		// Arrange
			boolean isEvolved = true;
			
		// Action
			IAnimal animal = new Butterfly(isEvolved);
			Animal result = (Animal) animal;
			
			int flyCount = result.getCharacteristicsMap().get(result.flyKey);
			
		// Assert
			assertTrue(animal instanceof Butterfly);
			assertEquals(flyCount, 1);
			assertFalse(result.getCharacteristicsMap().containsKey(result.singKey));
			assertFalse(result.getCharacteristicsMap().containsKey(result.swimKey));
			assertFalse(result.getCharacteristicsMap().containsKey(result.walkKey));
			
			result.clearCharacteristics();
		// To do with mocking framework can get the details of sing() as well
	}
	
	
	@SuppressWarnings("static-access")
	@Test
	void whenIsEvolvedIsFalse_ButterFlyReturns_Butterfly() {
		
		// Arrange
			boolean isEvolved = false;
			
		// Action
			IAnimal animal = new Butterfly(isEvolved);
			Animal result = (Animal) animal;
			
			int walkCount = result.getCharacteristicsMap().get(result.walkKey);
			
		// Assert
			assertTrue(animal instanceof Butterfly);
			assertEquals(walkCount, 1);
			assertFalse(result.getCharacteristicsMap().containsKey(result.singKey));
			assertFalse(result.getCharacteristicsMap().containsKey(result.flyKey));
			assertFalse(result.getCharacteristicsMap().containsKey(result.swimKey));
			
			result.clearCharacteristics();
		// To do with mocking framework can get the details of sing() as well
	}
}
