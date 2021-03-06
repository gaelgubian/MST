package fr.fhacktory.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class StoryPlace implements Serializable {

	@Id
	@GeneratedValue
	private Integer id;
	private String name;

	public StoryPlace(String stPlace) {
		name = stPlace;
	}

	public StoryPlace() {
	}
}
