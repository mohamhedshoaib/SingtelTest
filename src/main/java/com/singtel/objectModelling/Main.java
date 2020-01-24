package com.singtel.objectModelling;

import com.singtel.objectModelling.animal.Animal;
import com.singtel.objectModelling.bird.BirdFactory;
import com.singtel.objectModelling.bird.IBird;
import com.singtel.objectModelling.fish.FishFactory;
import com.singtel.objectModelling.fish.IFish;
import com.singtel.objectModelling.specialAnimals.Butterfly;

public class Main {
	
	public static void main(String[] args) {
		
		
//		Animal bird = (Animal) new BirdFactory().getBird(1);
//		IBird b = (IBird) bird;
//		b.sing();
//		
//		bird = (Animal) new BirdFactory().getBird(2);
//		b = (IBird) bird;
//		b.sing();
//		
//		
//		
//		bird = (Animal) new BirdFactory().getBird(3);
//		b = (IBird) bird;
//		b.sing();
//		
//		bird = (Animal) new BirdFactory().getBird(4);
//		b = (IBird) bird;
//		b.sing();
//		
//		bird = (Animal) new BirdFactory().getBird(5);
//		b = (IBird) bird;
//		b.sing();
//		
//		
//		bird = (Animal) new FishFactory().getFish(1);
//		IFish fish = (IFish) bird;
//		System.out.println(fish.getColour());
		
		
	Animal[] animals = new Animal[] {
			(Animal) new BirdFactory().getBird(1),
			(Animal) new BirdFactory().getBird(2),
			(Animal) new BirdFactory().getBird(3),
			(Animal) new BirdFactory().getBird(4),
			(Animal) new BirdFactory().getBird(5),
			(Animal) new FishFactory().getFish(1),
			(Animal) new Butterfly(true) 
	};
		
		System.out.println(animals[0].getCharacteristicsMap().toString());
	
		
	}

}
