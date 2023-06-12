package domain;

public class Happy extends Mood {

	@Override
	protected void eat(Pet pet) {
		pet.setLevel(pet.getLevel() + 1);
		
	}

	@Override
	protected void play(Pet pet) {
		pet.setLevel(pet.getLevel() + 2);
		
	}

}
