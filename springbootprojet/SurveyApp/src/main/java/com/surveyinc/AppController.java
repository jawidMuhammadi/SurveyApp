package com.surveyinc;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class AppController {

	@GetMapping(EndPoints.HOME_PAGE)
	public String home(Model model) {
		model.addAttribute("fCount",Repository.getFootbalSurveySize());
		model.addAttribute("hCount",Repository.getHappinessSurveySize());
		return "main";
	}

	@GetMapping(EndPoints.FOOTBALL_SURVEY)
	public String footballSurveyScreen(Model model) {
		return "survey1";
	}
	
	@GetMapping(EndPoints.HAPPINESS_SURVEY)
	public String happinessSurveyScreen(Model model) {
		return "survey2";
	}
	
	@PostMapping(EndPoints.FOOTBALL_SURVEY)
	public ModelAndView submitFootballSurvey(FootballSurvey survey) {
		Repository.saveFootaballSurvey(survey);
		return new ModelAndView(new RedirectView("main",true));
	}
	
	@PostMapping(EndPoints.HAPPINESS_SURVEY)
	public RedirectView submitHappinessSurvey(HappinessSurvey survey) {
		Repository.saveHappySurvey(survey);
		return new RedirectView("main");
	}

}