package domain;

import exceptions.UnableToPlayException;

public class Hungry extends Mood {

	@Override
	protected void eat(Pet pet) {
		pet.setMood(new Happy());
		
	}

	@Override
	protected void play(Pet pet) {
		throw new UnableToPlayException("Unable to play due Pet's Mood is " + this.getClass().toString());
		
	}



}
