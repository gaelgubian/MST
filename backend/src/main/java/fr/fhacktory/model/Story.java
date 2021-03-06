package fr.fhacktory.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Transient;

import fr.fhacktory.utils.NameGenerator;
import fr.fhacktory.utils.PlaceGenerator;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Story implements Serializable {
	@Id
	@GeneratedValue
	private Integer id;

	@OneToMany(cascade = CascadeType.ALL)
	private List<Sentence> sentences = new ArrayList<>();

	@OneToMany(cascade = CascadeType.ALL)
	private List<StoryCharacter> characters = new ArrayList<>();

	@OneToMany(cascade = CascadeType.ALL)
	private List<StoryPlace> places = new ArrayList<>();

	@Transient
	public String getRandomCharacter() {
		String stCharacter = null;
		while (characters.iterator().hasNext() && stCharacter == null) {
			StoryCharacter currentCharacter = characters.iterator().next();
			if (Math.random() < 0.75) {
				stCharacter = currentCharacter.getName();
			}
		}
		if (stCharacter == null) {
			stCharacter = NameGenerator.getAName();
			characters.add(new StoryCharacter(stCharacter));
		}
		return stCharacter;
	}

	@Transient
	public String getRandomPlace() {
		String stPlace = null;
		while (places.iterator().hasNext() && stPlace == null) {
			StoryPlace currentPlace = places.iterator().next();
			if (Math.random() < 0.75) {
				stPlace = currentPlace.getName();
			}
		}
		if (stPlace == null) {
			stPlace = PlaceGenerator.getPlace();
			places.add(new StoryPlace(stPlace));
		}
		return stPlace;
	}

}
