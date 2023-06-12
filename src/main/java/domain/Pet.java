package domain;

public class Pet {

	private Mood _mood;
	private Integer _level;
	
	public Pet() {
		this._mood = new Bored();
		this._level = 0;
	}
	
	public Pet(Mood _mood) {
		super();
		this._mood = _mood;
	}

	public void eat() {
		this._mood.eat(this);
		
	}
	
	public void play() {
		this._mood.play(this);
		
	}

	public Mood getMood() {
		return _mood;
	}

	public void setMood(Mood _mood) {
		this._mood = _mood;
	}
	
	public Integer getLevel() {
		return this._level;
	}

	public void setLevel(Integer level) {
		this._level = level;
		
	}
	
}
