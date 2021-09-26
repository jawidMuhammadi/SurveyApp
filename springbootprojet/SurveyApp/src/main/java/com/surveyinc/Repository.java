package com.surveyinc;

import java.util.ArrayList;

public class Repository {
	
	private static ArrayList<FootballSurvey> footbalSurveyList = new ArrayList<FootballSurvey>();
	private static ArrayList<HappinessSurvey> happySurveyList = new ArrayList<HappinessSurvey>();
	
	public static void saveFootaballSurvey(FootballSurvey survey) {
		footbalSurveyList.add(survey);
	}

	public static void saveHappySurvey(HappinessSurvey survey) {
		happySurveyList.add(survey);
	}
	
	public static int getFootbalSurveySize() {
		return footbalSurveyList.size();
	}
	
	public static int getHappinessSurveySize() {
		return happySurveyList.size();
	}

}
