package br.elizangela.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;



@RunWith(Cucumber.class)

@CucumberOptions(
		plugin = {"pretty"},
		monochrome = true,
		features = {"src/test/resources/features/login.feature"},
		glue = {"br.elizangela.steps"},
		tags = "not @ignore",
		//tags = {"@tipo1","@tipo2"},
		//tags = {"@tipo1,@tipo2"},
		snippets = SnippetType.CAMELCASE,
		dryRun = false,
		strict = true
		)

public class RunnerTest {

}
