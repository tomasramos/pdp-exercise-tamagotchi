package domain;

import java.util.Date;

public abstract class Mood {
	String _lastChange;
	
	public Mood() {
		this._lastChange = String.valueOf(new Date().getTime());
	}

	protected abstract void eat(Pet pet);
	protected abstract void play(Pet pet);
}
