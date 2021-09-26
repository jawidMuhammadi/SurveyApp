package com.surveyinc;

public class HappinessSurvey {
		
	private String name;
	
	private String lastName;
	
	private String gender;
	
	private String birthday;
	
	private int happinessRate;
	
	private String happyFactors;
	
	private String unhappyFactors;
	
	private String notes;
	
	private String surveyerName;
	
	private String surveyerLastName;

	public String getSurveyerName() {
		return surveyerName;
	}

	public void setSurveyerName(String surveyerName) {
		this.surveyerName = surveyerName;
	}

	public String getSurveyerLastName() {
		return surveyerLastName;
	}

	public void setSurveyerLastName(String surveyerLasName) {
		this.surveyerLastName = surveyerLasName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public int getHappinessRate() {
		return happinessRate;
	}

	public void setHappinessRate(int happinessRate) {
		this.happinessRate = happinessRate;
	}

	public String getHappyFactors() {
		return happyFactors;
	}

	public void setHappyFactors(String happyFactors) {
		this.happyFactors = happyFactors;
	}

	public String getUnhappyFactors() {
		return unhappyFactors;
	}

	public void setUnhappyFactors(String unhappyFactors) {
		this.unhappyFactors = unhappyFactors;
	}

	public String getNote() {
		return notes;
	}

	public void setNote(String note) {
		this.notes = note;
	}
	
}
