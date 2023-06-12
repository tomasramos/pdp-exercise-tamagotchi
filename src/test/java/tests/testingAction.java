package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import domain.Bored;
import domain.Happy;
import domain.Hungry;
import domain.Pet;
import exceptions.UnableToPlayException;

public class testingAction {

	@Test
	public void givenPet_WhenPetIsHungryAndEats_ThenPetBecomesHappy() {
		// Given
		Pet pet = new Pet();
		
		// When
		pet.setMood(new Hungry());
		pet.eat();
		
		// Then
		assertEquals(new Happy().getClass(), pet.getMood().getClass());
	}
	
	@Test
	public void givenPet_WhenPetIsHappyAndEats_ThenPetLevelIncreasesInOneUnit() {
		// Given
		Pet pet = new Pet();
		
		// When
		pet.setMood(new Happy());
		Integer levelBeforeEat = pet.getLevel();
		pet.eat();
		
		// Then
		Integer expectedLevel = levelBeforeEat + 1;
		assertTrue(expectedLevel == pet.getLevel());
	}
	
	// TODO: givenPet_WhenPetIsBoredAndEatsAndMoreThan80MinutesSinceLastUpdate_ThenPetBecomesHappy()
	
	@Test
	public void givenPet_WhenPetIsBoredAndEatsAndLessThan80MinutesSinceLastUpdate_ThenPetDoesNotBecomeHappy() {
		// Given
		Pet pet = new Pet();
		
		// When
		pet.setMood(new Bored());
		pet.eat();
		
		// Then
		assertNotSame(new Happy().getClass(), pet.getMood().getClass());
	}
	
	@Test(expected = UnableToPlayException.class)
	public void givenPet_WhenPetIsHungryAndPlays_ThenUnableToPlayExceptionIsThrown() {
		// Given
		Pet pet = new Pet();
		
		// When
		pet.setMood(new Hungry());
		pet.play();
	}
	
	@Test
	public void givenPet_WhenPetIsHappyAndPlays_ThenPetLevelIncreasesInTwoUnits() {
		// Given
		Pet pet = new Pet();
		
		// When
		pet.setMood(new Happy());
		Integer levelBeforePlay = pet.getLevel();
		pet.play();
		
		// Then
		Integer expectedLevel = levelBeforePlay + 2;
		assertTrue(expectedLevel == pet.getLevel());
	}
	
	@Test
	public void givenPet_WhenPetIsBoredAndPlays_ThenPetBecomesHappy() {
		// Given
		Pet pet = new Pet();
		
		// When
		pet.setMood(new Bored());
		pet.play();
		
		// Then
		assertEquals(new Happy().getClass(), pet.getMood().getClass());
	}

}
