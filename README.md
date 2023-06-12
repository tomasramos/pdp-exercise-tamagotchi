## UTN - FRBA - PDP - Excercises - Objects - Guide 5 - Exercise 2
# Exercise

Model a virtual pet (Tamagotchi), including the messages corresponding to the actions of eating and playing, and the question about wheter or not it can play.
You also have to be able to know the happiness level of a pet, which is an integer greater than or equal to 0, where the higher the level, the happier the pet is.
A pet can be bored, hungry or happy; and its behavior depends on what state is.
Let's see:

When a pet eats:
* If it is hungry, it becomes happy
* If it is happy, its level increases in one unit
* If it is bored, and there is more than 80 minutes that it is bored, then it becomes happy
* If it is bored since 80 minutes or less, then nothing happens.

When a pet plays:
* If it is happy, its level increases in two units
* If it is bored, it becomes happy
* It has no effect playing with the pet if it is hungry

A pet can play if it is happy or bored; it can not play if it is hungry.

You can not ask the current state of the pet. That means it is forbbiden to make comparisons like  `state == 'happy'` or similar.
