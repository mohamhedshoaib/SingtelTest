package com.singtel.objectModelling.bird;

import com.singtel.objectModelling.animal.IAnimal;

public interface IBird extends IAnimal {
	
	final String flyWord = "I am flying";
	final String nonFlyWord = "I cannot fly";
	void fly();
	void sing();
}
