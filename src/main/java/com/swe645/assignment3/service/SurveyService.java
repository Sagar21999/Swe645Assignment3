// The service interface which contains all the services the project offers. its implementation should ideally contain the business logic.

package com.swe645.assignment3.service;

import java.util.List;

import com.swe645.assignment3.entity.Survey;

public interface SurveyService {

	
	Survey saveSurvey(Survey survey);
	List<Survey> getAllSurveys();
	Survey getSurveyById(long id);
	Survey updateSurvey(Survey survey,long id);
	void deleteSurvey(long id);
}
