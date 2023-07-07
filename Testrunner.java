package org.test.step;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions(features ="C://Users//Pallavi//eclipse-workspace//YTFM_Cucumber1//Feature//Mytest.feature",
		  glue ="steps")
public class Testrunner {

}
