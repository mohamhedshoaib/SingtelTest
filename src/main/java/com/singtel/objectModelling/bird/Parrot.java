package com.singtel.objectModelling.bird;

import com.singtel.objectModelling.animal.Animal;
import com.singtel.objectModelling.utils.FriendType;

public class Parrot extends Animal implements IBird {
	
	public FriendType friendType;
	
	public FriendType getFriendType() {
		return friendType;
	}

	public void setFriendType(FriendType friendType) {
		this.friendType = friendType;
	}

	public Parrot(FriendType friendId) {
		addCharacteristics(flyKey);
		addCharacteristics(singKey);
		addCharacteristics(walkKey);
		
		this.friendType = friendId;
	}

	@Override
	public void fly() {
		System.out.println(flyWord);

	}

	@Override
	public void sing() {
		
		switch(friendType) {
		
		case Cat:
			System.out.println("Meow");
			break;
		case Dog:
			System.out.println("Wooof, Wooof");
			break;
		case Duck:
			System.out.println("Quack, Quack");
		default:
			System.out.println("I am parrot");
			break;
			 
		}
		

	}

}
