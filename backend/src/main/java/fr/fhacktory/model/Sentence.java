package fr.fhacktory.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.apache.commons.lang3.StringUtils;

import fr.fhacktory.utils.AdjectifsGenerator;
import fr.fhacktory.utils.ObjectGenerator;
import fr.fhacktory.utils.VerbGenerator;
import lombok.Data;

@Data
@Entity
public class Sentence implements Serializable {
	@Id
	@GeneratedValue
	private Integer id;
	private String generatedSentence;
	private String subject;
	private String verb;
	private String complement;
	private String place;
	private String adjectivComplement;
	private String adjectivPlace;
	private String imageUrl;

	public Sentence() {
		super();
	}

	/**
	 * @param questionnaire
	 * @return
	 */
	public Sentence(StepForm questionnaire, Story currentStory) {
		super();

		if (StringUtils.isBlank(questionnaire.getSubject())) {
			setSubject(currentStory.getRandomCharacter());
		} else {
			setSubject(questionnaire.getSubject());
		}
		if (StringUtils.isBlank(questionnaire.getComplement())) {
			setComplement(ObjectGenerator.getAnObject());
		} else {
			setComplement(questionnaire.getComplement());
		}
		if (Math.random() > 0.5) {
			setAdjectivComplement(AdjectifsGenerator.getAnObjectAdjectif());
		}
		if (StringUtils.isBlank(questionnaire.getPlace())) {
			if (Math.random() > 0.4) {
				setPlace(currentStory.getRandomPlace());
			}
		} else {
			setPlace(questionnaire.getPlace());
		}
		if (Math.random() > 0.5) {
			setAdjectivPlace(AdjectifsGenerator.getAnObjectAdjectif());
		}
		if (StringUtils.isBlank(questionnaire.getVerb())) {
			setVerb(VerbGenerator.getAVerb());
		} else {
			setVerb(questionnaire.getVerb());
		}
	}

}
