package com.singtel.objectModelling.animal;

public class AnimalFactory {

	public IAnimal getAnimal(int id) {
		
		switch(id) {
		case 1:
			return new Dog();
			
		case 2:
			return new Cat();
			
		default:
			return null;
		}
	}
}
