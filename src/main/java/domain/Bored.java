package domain;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Bored extends Mood {
	public Bored() {
		super();
	}

	@Override
	protected void eat(Pet pet) {

		if (this.getDurationSinceLastChange().toMinutes() > 80) {
			pet.setMood(new Happy());
		}
		
	}

	@Override
	protected void play(Pet pet) {
		pet.setMood(new Happy());
		
	}
	
	private Duration getDurationSinceLastChange() {
		LocalDateTime lastChange = Instant.ofEpochMilli(Long.parseLong(this._lastChange))
				.atZone(ZoneId.systemDefault()).toLocalDateTime();
		LocalDateTime now = LocalDateTime.now();
		
		return Duration.between(lastChange, now);
	}


}
